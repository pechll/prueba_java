package BussinesLogic;
/**
 *
 * @author Ing. Percy Edward Chávez LLamoga <pechll@hotmail.com>
 */
import java.sql.DriverManager;
import java.sql.Connection;

public class clsConexion {
    Connection conn;
    String stServidor, stUsuario, stPassword, stBD ="";
    
    public clsConexion(){
        try{
            stServidor = "localhost";
            stUsuario = "sa";
            stPassword= "123__=";
            stBD ="bd_muninte";
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String stConexion = "jdbc:sqlserver://"+ stServidor+ ":1433;databaseName="+ stBD;
            
            conn = DriverManager.getConnection(stConexion, stUsuario,stPassword);
            
                    
        }catch (Exception e){
            
        }
    }
    
    public Connection getConexion(){
        return conn;
    }
    
    public void closeConexion(){
        try{
            conn.close();
        }catch (Exception e) {
            
        }
    }
}
