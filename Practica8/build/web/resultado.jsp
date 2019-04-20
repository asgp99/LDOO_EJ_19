<%@page import="clase_usuario.usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
HttpSession httpSession = request.getSession(false);
usuario usuario = null; 
String nombre = "", contraseña = "", correo = "",fechaNacimiento = "";

if(httpSession != null){
    usuario = (usuario) httpSession.getAttribute("usuario");
}

if(usuario!=null){
  nombre = usuario.getNombre();
  contraseña = usuario.getContraseña();
  correo = usuario.getCorreo();
  fechaNacimiento = usuario.getFechaNacimiento();
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
    </body>
</html>