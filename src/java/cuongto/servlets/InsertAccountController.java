/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuongto.servlets;

import cuongto.beans.RegistrationBean;
import cuongto.daos.RegistrationDAO;
import cuongto.dtos.RegistrationDTO;
import cuongto.dtos.RegistrationErrorObj;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author toquo
 */
@WebServlet(name = "InsertAccountController", urlPatterns = {"/InsertAccountController"})
public class InsertAccountController extends HttpServlet {

    private static final String error = "error.jsp";
    private static final String success = "admin.jsp";
    private static final String invalidInput = "insert.jsp";

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
            String confirm = request.getParameter("txtConfirm");
            String fullname = request.getParameter("txtFullname");
            String email = request.getParameter("txtEmail");
            String phone = request.getParameter("txtPhone");
            String role = request.getParameter("user_job");

            RegistrationErrorObj errorObj = new RegistrationErrorObj();
            boolean valid = true;

            if (username.length() < 6) {
                valid = false;
                errorObj.setUsername("Username cannot be less than 6 characters");
            }
            if (password.length() < 6) {
                valid = false;
                errorObj.setPassword("Password cannot be less than 6 characters");
            }
            if (!confirm.equals(password)) {
                valid = false;
                errorObj.setConfirm("Confirm does not match to Password");
            }
            if (fullname.length() == 0) {
                valid = false;
                errorObj.setFullname("Fullname cannot be blank!");
            }
            if (email.length() == 0) {
                valid = false;
                errorObj.setEmail("Email cannot be blank!");
            }
            if (phone.length() == 0) {
                valid = false;
                errorObj.setPhone("Phone cannot be blank!");
            }

            if (valid) {
                RegistrationBean bean = new RegistrationBean();
                RegistrationDTO dto = new RegistrationDTO(username, fullname, email, phone, role);
                dto.setPassword(password);
                bean.setDto(dto);
                boolean inserted = bean.insertAccount();
                if(inserted){
                    url = success;
                }else{
                    request.setAttribute("ERROR", "Insert failed");
                }
            } else {
                request.setAttribute("invalidInput", errorObj);
                url = invalidInput;
            }
        } catch (Exception e) {
            if(e.getMessage().contains("duplicate")){
                RegistrationErrorObj errorObj = new RegistrationErrorObj();
                errorObj.setUsername("Username is existed");
                request.setAttribute("invalidInput", errorObj);
                url = invalidInput;
            }
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
