
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
    -fecha
    -noticia
    
    1.1 Crear pantallas para el back 
    -Login
    -Home
    --Crear
    --Editar
    --Eliminar
    
    <h:outputLink value="My/Fuckin/Liga.xhtml" class="portfolio-link" >
	Fuckin Liga
</h:outputLink>

2.- Estudiar como hacer la carga automatizada de componentes y como modificar elementos html con jquery y/o jsf

Avance back
============================

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://java.sun.com/jsf/html"
      xmlns:f="http://java.sun.com/jsf/core"
      xmlns:ui="http://java.sun.com/jsf/facelets"
      xmlns:p="http://primefaces.org/ui">
    <f:view contentType="text/html">
        <h:head>
            <f:facet name="first">
                <meta content='text/html; charset=UTF-8' http-equiv="Content-Type"/>
                <title>PrimeFaces</title>
            </f:facet>
        </h:head>
  <h:body>
      <h:form id="form">
          <h3>Imagen de la noticia</h3>
    <p:fileUpload fileUploadListener="#{fileUploadController.upload}" mode="advanced" dragDropSupport="false"
           update="messages" sizeLimit="100000" fileLimit="3" allowTypes="/(\.|\/)(gif|jpe?g|png)$/" />
    <p:growl id="messages" showDetail="true" />
    
    <h3>T&iacute;tulo de la noticia</h3>
    <p:inputText />
    
    <h3>Descripci&oacute;n de la noticia</h3>
    <p:inputTextarea rows="6" cols="33" />
    
    <h3 style="margin-top:0">Estado de la noticia</h3>
    <h:panelGrid columns="2" style="margin-bottom:10px" cellpadding="5">
        <p:outputLabel for="console" value="Activo:" />
        <p:selectOneRadio id="console" value="#{fileUploadController.console}">
            <f:selectItem itemLabel="Xbox One" itemValue="Xbox One" />
            <f:selectItem itemLabel="PS4" itemValue="PS4" />
        </p:selectOneRadio>
    </h:panelGrid>
    
    <h3>G&eacute;nero de la noticia</h3>
    
    <p:outputLabel for="basic" value="Basic:" />
        <p:selectOneListbox id="basic" value="#{selectOneView.option}">
            <f:selectItem itemLabel="Option 1" itemValue="1" />
            <f:selectItem itemLabel="Option 2" itemValue="2" />
            <f:selectItem itemLabel="Option 3" itemValue="3" />
        </p:selectOneListbox>
    
    <h:outputLink value="My/Fuckin/Liga.xhtml" class="portfolio-link" >
	Fuckin Liga
</h:outputLink>
</h:form>
        </h:body>

    </f:view>
</html>

=============================
package com.sample.bean;
 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
 
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
 
import org.primefaces.event.FileUploadEvent;
  
@ManagedBean(name="fileUploadController")
public class FileUploadController {
   private String destination="C:\\Users\\1079354\\Documents\\NetBeansProjects\\FileUploadServer\\web\\resources\\img\\";
 private String console; 
 private String data; 
    public void upload(FileUploadEvent event) {
        System.out.println("Execute upload()");
        FacesMessage msg = new FacesMessage("Success! ", event.getFile().getFileName() + " is uploaded.");  
        FacesContext.getCurrentInstance().addMessage(null, msg);
        // Do what you want with the file        
        try {
            copyFile(event.getFile().getFileName(), event.getFile().getInputstream());
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }  
 
    public void copyFile(String fileName, InputStream in) {
           try {
              
              
                // write the inputStream to a FileOutputStream
                OutputStream out = new FileOutputStream(new File(destination + fileName));
              
                int read = 0;
                byte[] bytes = new byte[1024];
              
                while ((read = in.read(bytes)) != -1) {
                    out.write(bytes, 0, read);
                }
              
                in.close();
                out.flush();
                out.close();
              
                System.out.println("New file created!");
                } catch (IOException e) {
                System.out.println(e.getMessage());
                }
    }
    
    public String getConsole() {
        return console;
    }
 
    public void setConsole(String console) {
        this.console = console;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
    
}
====================



    
    */
