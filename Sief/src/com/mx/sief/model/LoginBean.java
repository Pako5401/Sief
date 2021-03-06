/*
 * @author: Francisco Pedro Júarez Medrano
 * @user: Pako5401
 * @email: daner_sk8@hotmail.com
 * @created: Dom 20, 2015 at 07:00 PM
 * @place: Ciudad de México, México
 * evisions:
 * Ver        Date               Author              Description
 * ---------  ---------------  -------------------  --------------------                
 */
package com.mx.sief.model;

/**
 * Clase encargada de persistir los datos obtenidos de la bd y/o datos que
 * ingrese el usuario mediante setters y getters, no contendra logica de negocio
 * ni conexion a bd.
 */
public class LoginBean {

    private String nombre;
    private String apellido;
    private String tipo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
