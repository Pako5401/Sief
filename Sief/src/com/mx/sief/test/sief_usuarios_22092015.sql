
/* Primer tabla de prueba para implementar el modulo de "Login"
	@Fecha: 22/09/2015 10:18 am
	@Usuario Francisco Júarez
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
    
    INSERT INTO usuarios VALUES(1,'fjuarez','123','Francisco Pedro','Juárez Medrano','a',1);	
    INSERT INTO usuarios VALUES(2,'gperez','1234','Gustavo','Perez Savedra','o',1);
    INSERT INTO usuarios VALUES(3,'elópez','1234','Edgar','López Jimenez','o',0);
    
    /* 
    1.- Crea la tabla componentes, para la carga dinamica 
    ============================Tarea 12/11/2015==================================================
    -id_componente
    -titulo_img
    -alias_img
    -descripcion_componente
    -estatus
    -genero
    -*usuario
    
    <h:outputLink value="My/Fuckin/Liga.xhtml" class="portfolio-link" >
	Fuckin Liga
</h:outputLink>

2.- Estudiar como hacer la carga automatizada de componentes y como modificar elementos html con jquery y/o jsf
    
    */
