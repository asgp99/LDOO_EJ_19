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
public class admin extends usuario{
    int empleado = 0;

    public admin() {
    }

    public int getEmpleado() {
        return empleado;
    }

    public void setEmpleado(int empleado) {
        this.empleado = empleado;
    }    
}
