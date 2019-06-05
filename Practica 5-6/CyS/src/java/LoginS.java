import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"LoginS"})
public class LoginS extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            HttpSession session= request.getSession(true);
            String nombrelogin = request.getParameter("nombreL");
            String contraLogin = request.getParameter("contraL");            
            
            if ((contraLogin.equals((String)session.getAttribute("contra"))) && (nombrelogin.equals((String)session.getAttribute("nombre")))){
                Cookie userCookie = new Cookie("nombre", "nombrelogin");
                userCookie.setMaxAge(60*60*24*365);
                response.sendRedirect("Bienvenido.html");  
            }else{
               out.print("<h1>Error de inicio de sesion, pruebe de nuevo.</h1><br>");
               response.sendRedirect("login.html");  
               }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}

