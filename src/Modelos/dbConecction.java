package Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author chris
 */
public class dbConecction {

    Connection conectar = null;
    String user = "root";
    String password = "admin";
    String db = "JavaSwingLoginApp";
    String ip = "localhost";
    String port = "3306";

    String cadena = "jdbc:mysql://" + ip + ":" + port + "/" + db;

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
    
    

}
