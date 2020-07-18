CREATE DATABASE escuela;

USE escuela;

CREATE TABLE `escuela`.`persona`(
	`idPersona` INT NOT NULL AUTO_INCREMENT,
    `nombre` VARCHAR(50) NOT NULL,
	`domicilio` VARCHAR(200) NULL,
	`celular` VARCHAR(10) NULL,
    `email` VARCHAR(50) NULL,
    `fecha_nacimiento` DATE NULL,
    `genero` VARCHAR(10) NOT NULL,
    PRIMARY KEY (`idPersona`)
);



