
package Modelos;

import java.sql.Connection;

/**
 *
 * @author chris
 */
public class dbConecction {
    
    Connection conn = null;
    String user ="root";
    String password ="admin";
    String db ="JavaSwingLoginApp";
    String ip ="localhost";
    String port ="3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+port+"/"+db;
    
    
    
    public dbConecction(){
        try {
            
        } catch (Exception e) {
        }
        
    }
    
    
    
}
