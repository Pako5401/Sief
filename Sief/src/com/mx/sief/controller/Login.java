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
import com.mx.sief.view.LoginForm;
import javax.swing.JOptionPane;

/*
 * Clase en cargada de controlar la logica de negocio al loguearse,
 * desde aqui hara la redirección segun el tipo de usuario a la interfaz 
 * correspondiente.
 * Escuchara los eventos creados en la interfaz.
 */
public class Login {
    Conexion con=null;
    LoginDao ld =null;
    LoginBean lb = null;
    boolean estadoCon = true;
    LoginForm loginForm;

    
    public static void main(String[] args) {
        Login log=new Login();
        log.iniciar();
    }
    
    /**
	 * Permite instanciar todas las clases con las que trabaja
	 * el sistema
	 */
	private void iniciar() {
		/*Se instancian las clases*/
		loginForm=new LoginForm();
		loginForm.setVisible(true);
	}

    public void valUsuarios(String user,String pass) {
        System.out.println("user = "+user);
        System.out.println("pass = "+pass);
        con = new Conexion();
        ld = new LoginDao();
//        lb=new LoginBean();
        estadoCon = con.valConexion();
        if (estadoCon == false) {
            System.out.println("Fallo la conexion a bd, Intenta mas tarde");
        } else if(estadoCon == true) {
            lb = ld.valUsuarios(user, pass);
            if(lb!=null){
            System.out.println("Nombre = " + lb.getNombre());
            System.out.println("Apellido = " + lb.getApellido());
            System.out.println("Tipo = " + lb.getTipo());
            JOptionPane.showMessageDialog(null,"Bienvenido "+lb.getNombre()+" "+lb.getApellido());
            } else {
                JOptionPane.showMessageDialog(null,"Usuario incorrecto");
            }
        }
    }



}
