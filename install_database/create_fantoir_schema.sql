-- Create user schema
drop user fantoir cascade;
grant  DBA ,CREATE ANY TABLE, SELECT ANY TABLE, UPDATE ANY TABLE, DELETE ANY TABLE to fantoir identified by fantoir;
alter user fantoir default tablespace orass temporary tablespace temp;

-- connect user schema
connect fantoir/fantoir@saa

-- Create tables

ALTER TABLE fantoir.adresse
 DROP PRIMARY KEY CASCADE;
DROP TABLE fantoir.adresse CASCADE CONSTRAINTS;

CREATE TABLE fantoir.adresse
(
  ID_VOIE      VARCHAR2(50)   NOT NULL,
  NUM_VOIE     NUMBER(6),
  REP_VOIE     VARCHAR2(6),
  NOM_VOIE     VARCHAR2(200),
  COD_POSTAL   NUMBER(5),
  NOM_COMMUNE  VARCHAR2(200),
  X            NUMBER(12,2),
  y            NUMBER(12,2)
 );
ALTER TABLE fantoir.adresse ADD (
  CONSTRAINT ID_VOIE_PK
 PRIMARY KEY
 (ID_VOIE));
 
 
ALTER TABLE fantoir.commune DROP PRIMARY KEY CASCADE;
DROP TABLE fantoir.commune CASCADE CONSTRAINTS;
 
CREATE TABLE fantoir.commune
(
  COD_INSEE VARCHAR2(6),
  COD_POSTAL   NUMBER(5),
  NOM_COMMUNE  VARCHAR2(200)
);
 
ALTER TABLE fantoir.commune ADD(CONSTRAINT COD_INSEE_PK PRIMARY KEY(COD_INSEE));
 
 
ALTER TABLE fantoir.voie DROP PRIMARY KEY CASCADE;
DROP TABLE fantoir.voie CASCADE CONSTRAINTS;

CREATE TABLE fantoir.voie
(
  ID_VOIE_BIS  VARCHAR2(50),
  NUM_VOIE     NUMBER(6),
  REP_VOIE     VARCHAR2(6),
  NOM_VOIE     VARCHAR2(200),
  X            NUMBER(12,2),
  y            NUMBER(12,2),
  COD_INSEE   VARCHAR2(6)
  
 );
 
ALTER TABLE fantoir.voie ADD (CONSTRAINT VOIE_PK PRIMARY KEY(ID_VOIE_BIS));
 
ALTER TABLE fantoir.voie ADD (CONSTRAINT COD_INSEE_FK FOREIGN KEY (COD_INSEE) REFERENCES fantoir.commune(COD_INSEE));
 

