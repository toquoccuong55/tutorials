/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuongto.servlets;

import cuongto.beans.CategoryBean;
import cuongto.beans.RegistrationBean;
import cuongto.daos.RegistrationDAO;
import cuongto.dtos.RegistrationErrorObj;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author toquo
 */
@WebServlet(name = "LoginController", urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {

    private static final String error = "error.jsp";
    private static final String admin = "admin.jsp";
    private static final String employee = "employee.jsp";
    private static final String guest = "guest.jsp";
    private static final String invalidInput = "newIndex.jsp";

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
        String url = error;
        try {
            String username = request.getParameter("txtUsername");
            String password = request.getParameter("txtPassword");

            RegistrationErrorObj errorObj = new RegistrationErrorObj();
            boolean valid = true;

            if (username.length() == 0) {
                valid = false;
                errorObj.setUsername("Username cannot be blank!");
            }
            if(password.length() == 0){
                valid = false;
                errorObj.setPassword("Password cannot be blank!");
            }
            if(valid){
                RegistrationBean bean = new RegistrationBean();
                bean.setUsername(username);
                bean.setPassword(password);
                String role = bean.checkLogin();
                
                if(role.equals("failed")){
                    request.setAttribute("ERROR", "Invalid Username or Password!");
                }else{
                    if(role.equals("admin")){
                        url = admin;
                    }else if(role.equals("employee")){
                        url = employee;
                    }else if(role.equals("guest")){
                        url = guest;
                    }else{
                        request.setAttribute("ERROR", "Sorry, We do not support this role!");
                    }
                    
                    HttpSession session = request.getSession();
                    session.setAttribute("txtUsername", username);
                    
                    
                    
                }
            }else{
                request.setAttribute("invalidInput", errorObj);
                url = invalidInput;
            }
            
        } catch (Exception e) {
            log("ERROR at LoginController: " + e.getMessage());
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
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
