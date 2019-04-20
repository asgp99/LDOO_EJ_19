<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="get" action="inicio_sesion">
            Usuario:<input type="text" name="nombre"><br>  
            Contraseña:<input type="password" name="contraseña"><br>
            <input type="submit" value="Login"><br>
        </form><br><br>
        <%
        if(request.getParameter("var")!=null){
            out.print("Error con tus datos!");
        }
        %>
    </body>
</html>
