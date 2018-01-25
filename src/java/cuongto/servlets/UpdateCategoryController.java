/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuongto.servlets;

import cuongto.beans.CategoryBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author toquo
 */
@WebServlet(name = "UpdateCategoryController", urlPatterns = {"/UpdateCategoryController"})
public class UpdateCategoryController extends HttpServlet {

    private static final String error = "error.jsp";
    private static final String success = "ViewCategoryController";
    private static final String invalidInput = "viewCategory.jsp";

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
            String[] newValues = request.getParameterValues("txtCategory");
            String errorObj = "";
            boolean valid = true;
            for (int i = 0; i < newValues.length; i++) {
                if (newValues[i].length() == 0) {
                    valid = false;
                    errorObj = "Category cannot be blank!";
                    break;
                }
            }
            boolean updated = false;
            if (valid) {
                CategoryBean bean = new CategoryBean();
                List<String> oldValues = bean.loadCategory();
                for (int i = 0; i < newValues.length; i++) {
                    bean.setNewCategory(newValues[i]);
                    bean.setOldCategory(oldValues.get(i));
                    updated = bean.updateCategory();
                    if (updated == false) {
                        break;
                    }
                }
                if (updated) {
                    url = success;
                } else {
                    request.setAttribute("ERROR", "Update category failed");
                }
            } else {
                request.setAttribute("invalidInput", errorObj);
                url = invalidInput;
            }
        } catch (Exception e) {
            log("ERROR at UpdateCategoryController: " + e.getMessage());
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
