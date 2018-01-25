/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuongto.servlets;

import cuongto.beans.SuggestionBean;
import cuongto.dtos.SuggestionErrorObj;
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
@WebServlet(name = "RejectSuggestionController", urlPatterns = {"/RejectSuggestionController"})
public class RejectSuggestionController extends HttpServlet {
    private static final String error = "error.jsp";
    private static final String success = "CheckSuggestedEventController";   
    private static final String invalidInput = "rejectSuggestion.jsp";
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
            String eventname = request.getParameter("txtEventname");
            String reason = request.getParameter("txtReason");
            
            SuggestionErrorObj errorObj = new SuggestionErrorObj();
            boolean valid = true;
            
            if(reason.length() == 0){
                valid = false;
                errorObj.setReason("You must give reason why rejecting a suggestion!");
            }
            if(valid){
                SuggestionBean bean = new SuggestionBean();
                bean.setEventname(eventname);
                bean.setReason(reason);
                boolean rejected = bean.rejectSuggestion();
                if(rejected){
                    url = success;
                }else{
                    request.setAttribute("ERROR", "Rejecting a suggestion failed");
                }
            }else{
                request.setAttribute("invalidInput", errorObj);
                url = invalidInput;
            }
            
        } catch (Exception e) {
            log("ERROR at RejectController: " + e.getMessage());
        }finally{
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
