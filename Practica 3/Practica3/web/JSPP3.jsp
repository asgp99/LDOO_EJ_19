<%-- 
    Document   : JSPP3
    Created on : 12/03/2019, 04:04:40 PM
    Author     : Sergio Gzz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <%     String contra=request.getParameter("contra");
            String correo=request.getParameter("correo");
            String nombre=request.getParameter("nombre");
            String fecha=request.getParameter("fecha");
     %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>
            Contra: <%=contra%> <br>
            Correo: <%=correo%> <br> 
            Nombre:<%=nombre%> <br>
            Fecha: <%=fecha%>
        </p>
        <h1>Ya le entendi profe!</h1>
    </body>
</html>
