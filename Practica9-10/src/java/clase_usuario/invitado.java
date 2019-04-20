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
public class invitado extends usuario{
    String fecha = "";

    public invitado() {
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
