/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sergio Gzz
 */
public final class usuario {
    private String nombre;
    private String contra;
    private String correo;
   

    usuario(String nombre,String contra,String correo) {
    setNombre(nombre);
    setCorreo(correo);
    setContra(contra);
    }
 public void setNombre(String nombre){
 this.nombre=nombre;
 }
 public String getNombre(){
 return nombre;
 }
 
 public void setCorreo(String correo){
 this.correo=correo;
 }
 public String getCorreo(){
 return correo;
 }
 
 public void setContra(String contra){
 this.contra=contra;
 }
 public String getContra(){
 return contra;
 }

}
