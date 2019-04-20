package conexionBD;
import java.sql.Connection;
import java.sql.DriverManager;

public class conexionBD {
   private Connection conexion;
   
   public conexionBD(){
       try{
           Class.forName("com.mysql.jdbc.Driver");
           conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/usuariosBD?autoReconnect=true&useSSL=false","root","123");
       }catch(Exception e){
           System.err.println("error" + e);
       }
   }
   
   public Connection getConexion(){
       return conexion;
   }
}
