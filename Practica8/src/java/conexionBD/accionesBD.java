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
    
    public boolean registro(String nombre, String contraseña, String correo, String fechaNacimiento){
       PreparedStatement pst = null; 
       try {
            String consulta = "insert into usuarios (nombre, contraseña, correo, fechaNacimiento) values (?,?,?,?)";             
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, contraseña);
            pst.setString(3, correo);
            pst.setString(4, fechaNacimiento);
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