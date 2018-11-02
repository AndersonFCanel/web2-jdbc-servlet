create database web2db;
use  web2db;


CREATE TABLE USUARIO(
	IDUSUARIO INTEGER auto_increment NOT NULL PRIMARY KEY,
	NOME VARCHAR(25) NOT NULL,
	SOBRENOME VARCHAR(50) NOT NULL,
	ENDERECO VARCHAR(255) NOT NULL,
	SENHA VARCHAR(12) NOT NULL,
	LOGIN VARCHAR(20) NOT NULL,
	DATANASCIMENTO VARCHAR(12) NOT NULL,
	ISADM BOOLEAN NOT NULL);



CREATE TABLE CARTAODECREDITO(
	NUMEROCARTAO VARCHAR(19) PRIMARY KEY NOT NULL,
	DATAVENCIMENTO VARCHAR(12) NOT NULL,
	USUARIO_IDUSUARIO INTEGER NOT NULL,
	FOREIGN KEY(USUARIO_IDUSUARIO) REFERENCES USUARIO(IDUSUARIO));