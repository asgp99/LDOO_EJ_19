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
public class normal extends usuario{
    String subscripcion = "";
    String domicilio = "";

    public normal() {
    }

    public String getSubscripcion() {
        return subscripcion;
    }

    public void setSubscripcion(String subscripcion) {
        this.subscripcion = subscripcion;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
}
