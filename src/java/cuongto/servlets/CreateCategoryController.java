/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuongto.servlets;

import cuongto.beans.CategoryBean;
import cuongto.dtos.EventErrorObj;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author toquo
 */
@WebServlet(name = "CreateCategoryController", urlPatterns = {"/CreateCategoryController"})
public class CreateCategoryController extends HttpServlet {

    private static final String error = "error.jsp";
    private static final String invalidInput = "createCategory.jsp";
    private static final String success = "admin.jsp";

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
            String category = request.getParameter("txtCategory");
            EventErrorObj errorObj = new EventErrorObj();
            boolean valid = true;
            if (category.length() == 0) {
                valid = false;
                errorObj.setCategory("Category cannot be blank!");
            }
            if (valid) {
                CategoryBean bean = new CategoryBean();
                bean.setCategory(category);
                boolean existed = bean.checkCategory();
                if (existed == false) {
                    boolean created = bean.createCategory();
                    if(created){
                        url = success;
                    }else{
                        request.setAttribute("ERROR", "Create new category failed");
                    }
                } else {
                    errorObj.setCategory("This Cateogory is existed");
                    request.setAttribute("invalidInput", errorObj);
                    url = invalidInput;
                }
            } else {
                request.setAttribute("invalidInput", errorObj);
                url = invalidInput;
            }

        } catch (Exception e) {
            log("ERROR at CreateCategoryController: " + e.getMessage());
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
