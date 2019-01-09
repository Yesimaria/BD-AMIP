/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
 
/* Genesis Campos CI: 23.852.701
 *  Jonathan Falcon CI: 24.145.115
 *  Maiker Gutierrez CI: 21.503.775
 *  Laura Rincon CI: 25.140.751
 */

public class Conexion {

    public Conexion() {

    }

    public Connection getConexion() {
        Connection cone = null;

        try {
            Class.forName("org.postgresql.Driver").newInstance();
            cone = (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/bdaim", "postgres", "123456");
        } catch (Exception e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);

        }
        return cone;

    }
}
