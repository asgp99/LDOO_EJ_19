<%@page import="clase_usuario.normal"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
HttpSession httpSession = request.getSession(false);
normal normal = null; 
String nombre = "", contraseña = "", correo = "",fechaNacimiento = "", empleado = "", subscripcion = "", domicilio = "";

if(httpSession != null){
    normal = (normal) httpSession.getAttribute("normal");
}

if(normal!=null){
  nombre = normal.getNombre();
  contraseña = normal.getContraseña();
  correo = normal.getCorreo();
  fechaNacimiento = normal.getFechaNacimiento();
  subscripcion = normal.getSubscripcion();
  domicilio = normal.getDomicilio();
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
        Tipo de subscripcion:<% out.println(subscripcion); %>
        Domicilio:<% out.println(domicilio); %>
    </body>
</html>
