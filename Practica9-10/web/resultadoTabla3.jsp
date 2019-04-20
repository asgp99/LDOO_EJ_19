<%@page import="clase_usuario.invitado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
HttpSession httpSession = request.getSession(false);
invitado invitado = null; 
String nombre = "", contraseña = "", correo = "",fechaNacimiento = "", fecha = "";

if(httpSession != null){
    invitado = (invitado) httpSession.getAttribute("invitado");
}

if(invitado!=null){
  nombre = invitado.getNombre();
  contraseña = invitado.getContraseña();
  correo = invitado.getCorreo();
  fechaNacimiento = invitado.getFechaNacimiento();
  fecha = invitado.getFecha();
} 
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Nombre:<% out.println(nombre); %><br>
        Contraseña:<% out.println(contraseña); %><br>
        Correo Electronico:<% out.println(correo); %><br>
        Fecha de Nacimiento:<% out.println(fechaNacimiento); %><br>
        Fecha de Registro:<% out.println(fecha); %>
    </body>
</html>