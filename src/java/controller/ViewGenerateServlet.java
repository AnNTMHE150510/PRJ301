/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Student;

/**
 *
 * @author Admin
 */
public class ViewGenerateServlet extends HttpServlet {

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
        List<Student> list = (List<Student>)request.getAttribute("list");
        try (PrintWriter out = response.getWriter()) {
            out.println("<table>\n"
                    +"   <thead>\n"
                    +"       <tr>\n"
                    +"           <th>ID</th>\n"
                    +"           <th>Name</th>\n"
                    +"       </tr>\n"
                    +"   </thead>\n"
                    +"   <tbody>");
            for(Student x: list){
                out.println("<tr>\n"
                    +"        <td>" + x.getId()+"</td>\n "
                    +"        <td>" + x.getName()+"</td>\n"
                    +"      </tr>");
            }    
            out.println("</tbody>\n"
            +"       </table>");
        }
    }
//protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet CalServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            
//            List<Student> list = (List<Student>)request.getAttribute("list");
//            out.println("<div>");
//               out.println("ID  Name" + "\n");
//            out.println("</div>");
//            for(Student x: list){
//                out.println("<div>");
//                  out.println(x.getId()+ "     " +x.getName()+ "\n");
//                out.println("</div>");
//            }   
//            
//            out.println("</body>");
//            out.println("</html>");
//            
//        }
//    }
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
