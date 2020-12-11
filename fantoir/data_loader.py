from os import path, makedirs
import requests
import sys
import gzip
import shutil

import bs4

ZIP_FOLDER_REMOTE_PATH = "https://adresse.data.gouv.fr/data/ban/adresses/latest/csv/"
ZIP_FOLDER_LOCAL_PATH = "../datas/ZIP/fantoir/"

RAW_LOCAL_PATH = "../datas/RAW/fantoir/"


class data_loader:
    def ensure_data_loaded(self):
        '''
        Ensure if data are already loaded. Download if missing
        '''

        if path.exists(ZIP_FOLDER_LOCAL_PATH) == False:
            try:
                makedirs(ZIP_FOLDER_LOCAL_PATH)
            except OSError:
                print(f"Creation of the directory {ZIP_FOLDER_LOCAL_PATH} failed")
                exit(1)
            # else:
            #     print(f"Successfully created the directory {ZIP_FOLDER_LOCAL_PATH}")

        r = requests.get(ZIP_FOLDER_REMOTE_PATH)
        data = bs4.BeautifulSoup(r.text, "html.parser")
        for l in data.find_all("a"):
            file_name = l["href"]
            # r = requests.get(ZIP_FOLDER_REMOTE_PATH + file_name)
            # print(r.status_code)

            if not path.exists(ZIP_FOLDER_LOCAL_PATH + file_name):
                self._download_data(file_name)
                print('')

        print('Les fichiers sont correctement téléchargés')

    def _download_data(self, file_name):
        '''
        Download the data from internet
        '''

        print("Téléchargement de " + file_name)
        with open(ZIP_FOLDER_LOCAL_PATH + file_name, "wb") as f:
            response = requests.get(ZIP_FOLDER_REMOTE_PATH + file_name, stream=True)
            total_length = response.headers.get('content-length')

            if total_length is None:  # no content length header
                f.write(response.content)
            else:
                dl = 0
                total_length = int(total_length)

                for data in response.iter_content(chunk_size=4096):
                    dl += len(data)
                    f.write(data)
                    done = int(50 * dl / total_length)
                    sys.stdout.write("\r[%s%s]" %
                                     ('=' * done, ' ' * (50-done)))
                    sys.stdout.flush()

        print(' OK')

        self._extract_data(file_name)

    def _extract_data(self, file_name):
        '''
        Extract the zip file to the hard disk
        '''

        if path.exists(RAW_LOCAL_PATH) == False:
            try:
                makedirs(RAW_LOCAL_PATH)
            except OSError:
                print(f"Creation of the directory {RAW_LOCAL_PATH} failed")
                exit(1)
            # else:
            #     print(f"Successfully created the directory {RAW_LOCAL_PATH} ")

        print('Extract ' + file_name)
        with gzip.GzipFile(ZIP_FOLDER_LOCAL_PATH + file_name, 'r') as gzip_file:
            with open(RAW_LOCAL_PATH + file_name.replace(".gz",""), "wb") as raw_file:
                shutil.copyfileobj(gzip_file, raw_file)

                # gzip_ref.extractall(os.sep.join(['..', '..', 'datas', 'RAW']))
        # print('Data extract successfully')

if __name__ == "__main__":
    loader = data_loader()
    loader.ensure_data_loaded()