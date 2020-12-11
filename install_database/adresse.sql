--
-- Fichier généré par SQLiteStudio v3.2.1 sur ven. déc. 11 00:10:12 2020
--
-- Encodage texte utilisé : System
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table : adresse
DROP TABLE IF EXISTS adresse;
CREATE TABLE adresse (id_voie integer PRIMARY KEY AUTOINCREMENT, cod_postal varchar, nom_commune varchar, nom_voie varchar, num_voie integer not null, rep_voie varchar, x float not null, y float not null);

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
