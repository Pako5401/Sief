/*
 * @author: Francisco Pedro Júarez Medrano
 * @user: Pako5401
 * @email: daner_sk8@hotmail.com
 * @created: Dom 20, 2015 at 07:00 PM
 * @place: Ciudad de México, México
 * Revisions:
 * Ver        Date               Author              Description
 * ---------  ---------------  -------------------  --------------------                
 */
package com.mx.sief.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * Clase encargada de realizar la conexion a bd, es la plantilla
 * que sera instanciada en las clasesDao(metodos) que quieran info(abc),
 * con el fin de no realizar conexion en cada clase.
 */
public class Conexion {

    public static Connection conexion = null;
    public static PreparedStatement ps = null;

    /**
     * Metodo principal que se conectara a bd cada que se requiera, proveera de
     * conexion a cualquier clase que lo necesite.
     * @return boolean (true si se conecto, false si fallo).
     */
    public static boolean valConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Conectado, Encontro la libreria");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/sief", "root", "pako");
            return true;
        } catch (ClassNotFoundException e) {
            System.out.println("No conectado, No encontro la libreria");
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return false;
    }

}
