<p  align="center">
<h1  align="center">Fantoir</h3>
</p>

## Sommaire

*  [Contexte du projet](#contexte-du-projet)

*  [Structure](#structure)

*  [Commencer](#commencer)

*  [Utilisation](#utilisation)

*  [Auteurs](#auteurs)


## Contexte du projet


La société Establish a besoin d'une base de données qui recense les différentes adresses postales françaises pour son application de gestion. Elle possède une source de données mais ne sait pas l'utiliser en tant que telle pour son application (principalement à cause de la volumétrie du fichier). Elle sollicite votre aide pour en faire quelque chose.

## Structure
- Le dossier [fantoir](https://github.com/folivier03/BaseDonnees_Fantoir/tree/main/fantoir) contient le code java pour le serveur spring-boot.
- Le dossier [install_database](https://github.com/folivier03/BaseDonnees_Fantoir/tree/main/install_database) contient le fichier sql pour creer la table SQLite.
- Le dossier [install_database](https://github.com/folivier03/BaseDonnees_Fantoir/tree/main/install_database) contient le fichier sql pour creer la table SQLite.
- Le dossier [talend](https://github.com/folivier03/BaseDonnees_Fantoir/tree/main/talend) est l'exportation d'un job talend pour remplir la table SQLite.
- Le dossier [telechargement](https://github.com/folivier03/BaseDonnees_Fantoir/tree/main/telechargement_csv) contient le code python pour le chargement en local des CSV contenant les adresses.
- Le dossier [test](https://github.com/folivier03/BaseDonnees_Fantoir/tree/main/test) contient des captures d'ecran pour differentes requetes de l'API spring-boot a partir de l'outil [postman](https://www.postman.com/).
## Commencer

Pour avoir une copie locale et lancer le programme, suivez ces étapes.

### Outils

Lors de ce projet nous avons utilises plusieurs logiciels et technologies;
- [SQLite studio](https://sqlitestudio.pl/)
- [Postman](https://www.postman.com/)
- [Talend](https://talend.com)
- [Java11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- Pyhton
	
### Installation

Cloner le répertoire
```git
git clone https://github.com/folivier03/BaseDonnees_Fantoir.git
```
> ### _Optionnel_
> #### Pour reproduire la base de donnees SQLite il vous faut reproduire ces etapes
 
 1. Telecharger les CSV a l'aide de [chargement_csv.ipynb](https://github.com/folivier03/BaseDonnees_Fantoir/blob/main/telechargement_csv/chargement_csv.ipynb).
 2. Creer une base de donnees "fantoir.db" dans [./fantoir](https://github.com/folivier03/BaseDonnees_Fantoir/tree/main/fantoir) et lancer la creation de la table [adresse.sql](https://github.com/folivier03/BaseDonnees_Fantoir/blob/main/install_database/adresse.sql) dans SQLite studio.
 3. Lancer le job [talend](https://github.com/folivier03/BaseDonnees_Fantoir/tree/main/talend) pour alimenter la table.
	> Note: Le job talend se base sur un echantillon a l'aide d'un copier-coller dans l'explorateur windows

## Utilisation

- Dans le dossier [./fantoir](https://github.com/folivier03/BaseDonnees_Fantoir/tree/main/fantoir), lancer le serveur spring-boot avec la commande:
```Shell
$ mvnw spring-boot:run
```
Vous pouvez a present faire des requetes sur [localhost:8080/api/v1/adresse](http://localhost:8080/api/v1/adresse)

> Details de l'API non implemente:

### getAll
GET
/api/v1/adresse/

### getById
GET
/api/v1/adresse/{id}

###  getByNumVoie
GET
/api/v1/adresse/voie/{numv}

###  getByVoie
GET
/api/v1/adresse/voie/{numv}/{nomv}

### getByCommune
GET
/api/v1/adresse/commune/{numv}/{nomv}/{nomc}

### getByCodePostal
GET 
/api/v1/adresse/cp/{numv}/{nomv}/{nomc}/{codp}


### createNewAdress 
POST
/api/v1/adresse/


## Auteurs

Mohammed El Arbi Rabah
Orkaëlle Hardelin
Thibault Goutorbe
Farida Olivier
Nicolas Malgat