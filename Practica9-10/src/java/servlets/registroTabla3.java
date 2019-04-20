/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;

import clase_usuario.factoria;
import clase_usuario.usuario;
import conexionBD.accionesBD;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Abraham Sergio González Peña.
 */
@WebServlet(name = "registroTabla3", urlPatterns = {"/registroTabla3"})
public class registroTabla3 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            accionesBD accionesBD1 = new accionesBD();
            accionesBD accionesBD2 = new accionesBD();
            String nombre = request.getParameter("nombre");
            String correo = request.getParameter("correo");
            String contraseña = request.getParameter("contraseña");
            String fechaNacimiento = request.getParameter("fechaNacimiento");
            String fecha = request.getParameter("fecha");
            factoria factoria = null;
            HttpSession session = request.getSession();

            accionesBD1.registroTabla1(nombre, correo, contraseña, fechaNacimiento,"invitado");
            accionesBD2.registroTabla3(fecha);
            
            factoria = factoria.getFactoria();
            usuario invitado = factoria.getUsuario("invitado");
            invitado.setNombre(nombre);
            invitado.setCorreo(correo);
            invitado.setContraseña(contraseña);
            invitado.setFechaNacimiento(fechaNacimiento);
            invitado.setTipoUsuario("invitado");
            invitado.setFecha(fecha);

            session.setAttribute("invitado", invitado);

            response.sendRedirect("loginTabla3.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
