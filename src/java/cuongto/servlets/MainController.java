/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuongto.servlets;

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
@WebServlet(name = "MainController", urlPatterns = {"/MainController"})
public class MainController extends HttpServlet {
    private static final String error = "error.jsp";
    private static final String login = "LoginController";
    private static final String search = "SearchController";
    private static final String insertAccount = "InsertAccountController";
    private static final String deleteAccount = "DeleteAccountController";
    private static final String viewAccount = "ViewAccountController";
    private static final String suggest = "SuggestController";
    private static final String viewSuggestedEvent = "ViewSuggestedEventController";
    private static final String checkEvent = "CheckSuggestedEventController";
    private static final String reject = "RejectController";
    private static final String loadSuggestion = "LoadSuggestionController";
    private static final String createEvent = "CreateEventController";
    private static final String viewEvent = "ViewEventController";
    private static final String updateEvent = "UpdateEventController";
    private static final String removeEvent = "RemoveEventController";
    private static final String deleteSuggestion = "DeleteSuggestionController";
    private static final String createCategory = "CreateCategoryController";
    private static final String rejectSuggestion = "RejectSuggestionController";
    private static final String viewCategory = "ViewCategoryController";
    private static final String deleteCategory = "DeleteCategoryController";
    private static final String updateCategory = "UpdateCategoryController";
    
    
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
            String action = request.getParameter("action");
            if(action.equals("Login")){
                url = login;
            }else if(action.equals("Search") || (action.equals("loadCategory"))){
                url = search;
            }else if(action.equals("Sign Up")){
                url = insertAccount;
            }else if(action.equals("viewAccounts")){
                url = viewAccount;
            }else if(action.equals("deleteAccount")){
                url = deleteAccount;
            }else if(action.equals("View Suggested Event")){
                url = viewSuggestedEvent;
            }else if(action.equals("Check Suggested Event")){
                url = checkEvent;
            }else if(action.equals("Approve") || (action.equals("Reject"))){
                url = loadSuggestion;
            }else if(action.equals("Make a Suggestion")){
                url = suggest;
            }else if(action.equals("Reject Suggestion")){
                url = rejectSuggestion;
            }else if(action.equals("Delete a Suggestion")){
                url = deleteSuggestion;
            }else if(action.equals("Create New Event")){
                url = createEvent;
            }else if(action.equals("View event") || (action.equals("Edit Event"))){
                url = viewEvent;
            }else if(action.equals("Update Event")){
                url = updateEvent;
            }else if(action.equals("Remove Event")){
                url = removeEvent;
            }else if(action.equals("Create New Category")){
                url = createCategory;
            }else if(action.equals("View Category")){
                url = viewCategory;
            }else if(action.equals("deleteCategory")){
                url = deleteCategory;
            }else if(action.equals("Update Category")){
                url = updateCategory;
            }else{
                request.setAttribute("ERROR", "This action is not supported");
            }
            
        } catch (Exception e) {
            log("ERROR at MainController: " + e.getMessage());
        } finally{
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
