/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase_usuario;

/**
 *
 * @author Abraham Sergio González Peña.
 */
public class factoria {
    public static usuario getUsuario(String usuario){
        if("admin".equalsIgnoreCase(usuario)){
            return new admin();
        }else if("invitado".equalsIgnoreCase(usuario)){
            return new invitado();
        }else if("normal".equalsIgnoreCase(usuario)){
            return new normal();
        }else{
            return null;
        }
    }
    
    private static factoria singleton;
  
    public  static factoria getFactoria(){
    if (singleton==null) {
        singleton=new factoria();
    }
    return singleton;
    }

    public factoria() {
    }
}
