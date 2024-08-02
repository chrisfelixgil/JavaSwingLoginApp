package Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author chris
 */


public class dbConecction {

    //datos de la base de datos mysql
    Connection conectar = null;
    String user = "root";
    String password = "admin";
    String db = "JavaSwingLoginApp";
    String ip = "localhost";
    String port = "3306";

    String cadena = "jdbc:mysql://" + ip + ":" + port + "/" + db;

    //Conexion a la base de datos local mysql
    public Connection dbConecction() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, user, password);
            System.out.println("Conexión exitosa.");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No fue posible conectarse a la base de datos." + e);
            
        }
        
        return conectar;

    }
    
    //añade datos a la base de datos
    public int registerUser(String sentenciaSQL){
        try {
            PreparedStatement pstm = conectar.prepareStatement(sentenciaSQL);
            pstm.execute();
            return 1;
            
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }
    
    //Muestra datos de la base de datos.
    public ResultSet showUsers(String sentenciaSQL){
        try {
            PreparedStatement pstm = conectar.prepareStatement(sentenciaSQL);
            ResultSet result = pstm.executeQuery();
            return result;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        
        
        
    }
    
    

}
