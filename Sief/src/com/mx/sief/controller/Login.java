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
package com.mx.sief.controller;

import com.mx.sief.model.Conexion;
import com.mx.sief.model.LoginBean;
import com.mx.sief.model.LoginDao;

/*
 * Clase en cargada de controlar la logica de negocio al loguearse,
 * desde aqui hara la redirección segun el tipo de usuario a la interfaz 
 * correspondiente.
 * Escuchara los eventos creados en la interfaz.
 */
public class Login {

    LoginBean lb = null;
    boolean estadoCon = true;

    public static void main(String[] args) {
        Login log = new Login();
        log.valUsuarios();
    }

    public void valUsuarios() {
        Conexion con = new Conexion();
        LoginDao ld = new LoginDao();
        estadoCon = con.valConexion();

        if (estadoCon == false) {
            System.out.println("Fallo la conexion a bd, Intenta mas tarde");
        } else {
            lb = ld.valUsuarios("fjuarez", "123");
            System.out.println("Nombre = " + lb.getNombre());
            System.out.println("Apellido = " + lb.getApellido());
            System.out.println("Tipo = " + lb.getTipo());
        }
    }
}
