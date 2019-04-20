package conexionBD;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class accionesBD extends conexionBD{
    public boolean validacion(String user, String pass){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try{
            String consulta = "select * from usuario_general WHERE nombre = ? and contraseña = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, user);
            pst.setString(2, pass);
            rs = pst.executeQuery();
            if(rs.absolute(1)){
                return true;
            }
            }catch(SQLException e){
                System.err.println("Error" + e);
            }finally{
                try {
                    if(getConexion() != null){
                        getConexion().close();
                    }

                    if(pst != null){
                        pst.close();
                    }

                    if(rs != null){
                        rs.close();
                    }
                } catch (SQLException e) {
                    System.err.println("Error" + e);
                }
            }return false;
    }           
    
    public boolean registroTabla1(String nombre, String contraseña, String correo, String fechaNacimiento, String tipoUsuario){
       PreparedStatement pst = null; 
       try {
            String consulta = "insert into usuarios (nombre, contraseña, correo, fechaNacimiento, tipoUsuario) values (?,?,?,?,?)";             
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, contraseña);
            pst.setString(3, correo);
            pst.setString(4, fechaNacimiento);
            pst.setString(5, tipoUsuario);
            if(pst.executeUpdate() == 1){
                return true;
            }
            } catch (Exception e) {
                System.err.println("error" + e);
            } finally{
                try {
                    if(getConexion() != null){
                        getConexion().close();
                    }
                    if(pst != null){
                        pst.close();
                    }
                } catch (Exception e) {
                    System.err.println("error" + e);
                }
            }return false;
    } 
    
    public boolean registroTabla2(String empleado){
       PreparedStatement pst = null;        
       try {
           String consulta = "insert into admininstradores (empleado) values (?)";             
           pst = getConexion().prepareStatement(consulta);
           pst.setString(1, empleado);
           if(pst.executeUpdate() == 1){
               return true;
           }
           } catch (Exception e) {
               System.err.println("error" + e);
           } finally{
               try {
                   if(getConexion() != null){
                       getConexion().close();
                   }
                   if(pst != null){
                       pst.close();
                   }
               } catch (Exception e) {
                   System.err.println("error" + e);
               }
           }return false;
    }
    
    public boolean registroTabla3(String fecha){
       PreparedStatement pst = null;
        
       try {
           String consulta = "insert into invitados (fecha) values(?)";
           pst = getConexion().prepareStatement(consulta);
           pst.setString(1, fecha);
           if(pst.executeUpdate() == 1){
               return true;
           }
           } catch (Exception e) {
               System.err.println("error" + e);
           } finally{
               try {
                   if(getConexion() != null){
                       getConexion().close();
                   }
                    if(pst != null){
                       pst.close();
                   }
               } catch (Exception e) {
                   System.err.println("error" + e);
               }
           }return false;
    }
    
    public boolean registroTabla4(String subscripcion, String domicilio){
       PreparedStatement pst = null;
        
       try {
           String consulta = "insert into usuario_normal (subscripcion, domicilio) values (?,?)";
           pst = getConexion().prepareStatement(consulta);
           pst.setString(1, subscripcion);
           pst.setString(2, domicilio);
           if(pst.executeUpdate() == 1){
               return true;
           }
           } catch (Exception e) {
               System.err.println("error" + e);
           } finally{
               try {
                   if(getConexion() != null){
                       getConexion().close();
                   }
                    if(pst != null){
                       pst.close();
                   }
               } catch (Exception e) {
                   System.err.println("error" + e);
               }
           }return false;
    }
}