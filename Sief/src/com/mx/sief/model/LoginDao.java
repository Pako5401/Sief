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

import java.sql.ResultSet;

/**
 * Clase encargada de contener metodos que solicitaran, modificaran e insertaran
 * datos a la bd, instanciando la clase Conexion.java para conectarse.
 */
public class LoginDao {

    LoginBean loginBean = null;
    Conexion con = new Conexion();

    public LoginBean valUsuarios(String user, String pass) {
        try {
            con.ps = con.conexion.prepareStatement("select nombre, apellidos, tipo from usuarios where usuario ='" + user + "' and contrasenia= '" + pass + "' and estatus=1;");
            ResultSet rs = con.ps.executeQuery();
            while (rs.next()) {
                loginBean = new LoginBean();
                loginBean.setNombre(rs.getString("nombre"));
                loginBean.setApellido(rs.getString("apellidos"));
                loginBean.setTipo(rs.getString("tipo"));
                System.out.println(rs.getString("nombre") + "\t"
                        + rs.getString("apellidos") + "\t" + rs.getString("tipo"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
//                con.ps.close();
//                rs.close();
        }
        return loginBean;
    }

}
