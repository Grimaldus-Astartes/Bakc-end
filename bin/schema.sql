CREATE DATABASE IF NOT EXISTS service;

USE service;

CREATE TABLE IF NOT EXISTS form_celular(
    idFormCelular int not null auto_increment,
    idEmpresa int not null,
    idTelefonoAsignado int not null,
    nombreUsuario varchar(255) not null,
    idRegion int not null,
    idLocalidad int not null,
    idArea int not null,
    idEquipo int not null,
    primary key(idFormCelular)
);