
/* Primer tabla de prueba para implementar el modulo de "Login"
	@Fecha: 22/09/2015 10:18 am
	@Usuario Francisco J�arez
 */

CREATE DATABASE sief;
 USE sief;

	CREATE TABLE usuarios(
	id_usuario INT(5) NOT NULL AUTO_INCREMENT,
    usuario VARCHAR(30) NOT NULL,
    contrasenia VARCHAR(30) NOT NULL,
    nombre VARCHAR(30) NOT NULL,
    apellidos VARCHAR(40) NOT NULL,
    tipo CHAR(1) NOT NULL,
    estatus FLOAT(1),
    PRIMARY KEY(id_usuario)
	);
    
    INSERT INTO usuarios VALUES(1,'fjuarez','123','Francisco Pedro','Ju�rez Medrano','a',1);	
    INSERT INTO usuarios VALUES(2,'gperez','1234','Gustavo','Perez Savedra','o',1);
    INSERT INTO usuarios VALUES(3,'el�pez','1234','Edgar','L�pez Jimenez','o',0);