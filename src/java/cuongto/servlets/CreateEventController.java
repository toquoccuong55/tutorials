/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuongto.servlets;

import cuongto.beans.CategoryBean;
import cuongto.beans.EventBean;
import cuongto.beans.SuggestionBean;
import cuongto.daos.EventDAO;
import cuongto.daos.SuggestionDAO;
import cuongto.dtos.EventDTO;
import cuongto.dtos.EventErrorObj;
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
@WebServlet(name = "CreateEventController", urlPatterns = {"/CreateEventController"})
public class CreateEventController extends HttpServlet {

    private static final String error = "error.jsp";
    private static final String success = "admin.jsp";
    private static final String invalidInput = "addNewEvent.jsp";

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
            String poster = request.getParameter("txtPoster");
            String eventID = request.getParameter("txtEventID");
            String eventName = request.getParameter("txtEventname");
            String start = request.getParameter("txtStart");
            String finish = request.getParameter("txtFinish");
            String address = request.getParameter("txtAddress");
            String minNumber = request.getParameter("txtMinNumber");
            String maxNumber = request.getParameter("txtMaxNumber");
            String fee = request.getParameter("txtFee");
            String category = request.getParameter("txtCategory");
            String description = request.getParameter("txtDescription");
            String status = request.getParameter("txtStatus");
            
            EventErrorObj errorObj = new EventErrorObj();
            boolean valid = true;

            if (poster.length() == 0) {
                valid = false;
                errorObj.setPoster("Poster cannot be blank");
            }
            if (eventID.length() == 0) {
                valid = false;
                errorObj.setEventid("Evenid cannot be blank");
            }
            if (eventName.length() == 0) {
                valid = false;
                errorObj.setEventname("Eventname cannot be blank");
            }
            if(start.length() == 0){
                valid = false;
                errorObj.setStart("Start cannot be blank!");
            }
            if(finish.length() == 0){
                valid = false;
                errorObj.setFinish("Finish cannot be blank!");
            }
            if (address.length() == 0) {
                valid = false;
                errorObj.setAddress("Address cannot be blank");
            }
            if (minNumber.length() == 0) {
                valid = false;
                errorObj.setMinNumber("Minimum participant number cannot be blank");
            }
            if (maxNumber.length() == 0) {
                valid = false;
                errorObj.setMaxNumber("Maximum participant number cnanot be blank");
            }
            if (fee.length() == 0) {
                valid = false;
                errorObj.setFee("Fee cannot be blank");
            }
            if (category.length() == 0) {
                valid = false;
                errorObj.setCategory("Category cannot be blank");
            }
            if (description.length() == 0) {
                valid = false;
                errorObj.setDescription("Description cannot be blank");
            }
            if (status.length() == 0) {
                valid = false;
                errorObj.setStatus("Status cannot be blank!");
            }

            if (valid) {
                
                CategoryBean cateBean = new CategoryBean();
                cateBean.setCategory(category);
                boolean existed = cateBean.checkCategory();
                if (existed) {
                    EventDTO dto = new EventDTO(poster, eventID, eventName, start, finish, address,
                            Integer.parseInt(minNumber), Integer.parseInt(maxNumber),
                            Double.parseDouble(fee), category, description, status);
                    EventBean bean = new EventBean();
                    bean.setDto(dto);
                    boolean created = bean.createNewEvent();
                    if (created) {
                        SuggestionBean suggestBean = new SuggestionBean();
                        suggestBean.setEventname(eventName);
                        suggestBean.setChecked();
                        url = success;
                    } else {
                        request.setAttribute("ERROR", "Create new event failed");
                    }
                } else {
                    errorObj.setCategory("Category is not existed. Please Add new category!");
                    request.setAttribute("invalidInput", errorObj);
                    url = invalidInput;
                }
            } else {
                request.setAttribute("invalidInput", errorObj);
                url = invalidInput;
            }
        } catch (Exception e) {
            if (e.getMessage().contains("duplicate")) {
                EventErrorObj errorObj = new EventErrorObj();
                errorObj.setEventid("EventID is existed");
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
