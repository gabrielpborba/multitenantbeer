# multitenantbeer

PRIMEIRO INSTALAR O DATABASE H2> http://www.h2database.com/h2-setup-2018-03-18.exe

BOM TUTORIAL: https://www.tutorialspoint.com/h2_database/h2_database_installation.htm


DEPOIS DE INSTALADO> Click [Start], [All Programs], [H2], and [H2 Console (Command Line)]

VAI ABRIR O BROWSER PARA CONFIGURAR O DATASOURCE
CONFIGURAR CONFORME:
Saved Settings: Generic H2 (Embedded)
Setting Name: Generic H2 (Embedded)
Driver Class:org.h2.Driver
JDBC URL:jdbc:h2:mem:beerdb
User Name:beer


Executar o SCHEMA (schema.sql):
CREATE TABLE DATASOURCECONFIG (
	id IDENTITY PRIMARY KEY,
	driverclassname VARCHAR(255),
	url VARCHAR(255),
	name VARCHAR(255),
	username VARCHAR(255),
	password VARCHAR(255),
	initialize BOOLEAN
);

CREATE TABLE BEER (
	id IDENTITY PRIMARY KEY,
	nome VARCHAR(255),
	tipo VARCHAR(255)
);


DEPOIS DE CONFIGURADO, RODAR O src\main\java\br\com\fiap\multitenant\MultitenantApplication.java
NO POSTMAN: http://localhost:8080/beer


