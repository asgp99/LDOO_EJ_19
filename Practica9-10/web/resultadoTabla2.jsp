<%@page import="clase_usuario.admin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
HttpSession httpSession = request.getSession(false);
admin admin = null; 
String nombre = "", contraseña = "", correo = "",fechaNacimiento = "", empleado = "";

if(httpSession != null){
    admin = (admin) httpSession.getAttribute("admin");
}

if(admin!=null){
  nombre = admin.getNombre();
  contraseña = admin.getContraseña();
  correo = admin.getCorreo();
  fechaNacimiento = admin.getFechaNacimiento();
  empleado = String.valueOf(admin.getEmpleado());
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
        Numero de Empleado:<% out.println(empleado); %>
    </body>
</html>