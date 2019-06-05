import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"crearSesion"})
public class crearSesion extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            usuario cuenta=new usuario(request.getParameter("nombre"),request.getParameter("contra"),request.getParameter("correo"));
            HttpSession session= request.getSession(true);
            String nombre = request.getParameter("nombre");
            String contra = request.getParameter("contra");
            String correo = request.getParameter("correo");
            session.setMaxInactiveInterval(60*5); // 5 minutes

            if(nombre==null){
                nombre="";
            }else{
                session.setAttribute("nombre", nombre);
            }

            if(contra==null){
                contra="";
            }else{
                session.setAttribute("contra", contra);
            }

            if(correo==null){
                correo="";
            }else{
                session.setAttribute("correo", correo);
            }
            
            response.sendRedirect("login.html");
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
