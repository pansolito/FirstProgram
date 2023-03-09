
package crud2;

    
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author pansolit0
 */


public class conexion {
    Connection cn =null;
    public Connection conectar(){
    try{
    cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/crud","root","");
    System.out.println("Conectado a la base de datos con exito.");
}   catch(Exception e){
    System.out.println("error al conectar la base datos, verificar url de conexion, o datos de usuario."+e);
    }
    return cn;
    }

    }

      

