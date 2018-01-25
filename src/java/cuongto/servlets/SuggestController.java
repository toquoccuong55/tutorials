/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuongto.servlets;

import cuongto.beans.CategoryBean;
import cuongto.beans.SuggestionBean;
import cuongto.daos.SuggestionDAO;
import cuongto.dtos.SuggestionDTO;
import cuongto.dtos.SuggestionErrorObj;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Calendar;
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
@WebServlet(name = "SuggestController", urlPatterns = {"/SuggestController"})
public class SuggestController extends HttpServlet {

    private static final String error = "error.jsp";
    private static final String invalidInput = "suggest.jsp";
    private static final String employee = "employee.jsp";

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
            String eventname = request.getParameter("txtEventname");
            String start = request.getParameter("txtStart");
            String finish = request.getParameter("txtFinish");
            String address = request.getParameter("txtAddress");
            String minNumber = request.getParameter("txtMinNumber");
            String maxNumber = request.getParameter("txtMaxNumber");
            String fee = request.getParameter("txtFee");
            String category = request.getParameter("txtCategory");
            String description = request.getParameter("txtDescription");
            HttpSession session = request.getSession();
            String username = (String) session.getAttribute("txtUsername");

            SuggestionErrorObj errorObj = new SuggestionErrorObj();
            boolean valid = true;
            if (poster.length() == 0) {
                valid = false;
                errorObj.setPoster("Suggestion must have a poster");
            }
            if (eventname.length() == 0) {
                valid = false;
                errorObj.setEventname("EventName cannot be blank!");
            }
            if (start.length() == 0) {
                valid = false;
                errorObj.setStart("Start cannot be blank!");
            }
            if (finish.length() == 0) {
                valid = false;
                errorObj.setFinish("Finish cannot be blank!");
            }
            if (address.length() == 0) {
                valid = false;
                errorObj.setAddress("Address cannot be blank!");
            }

            if ((minNumber.length() == 0)) {
                valid = false;
                errorObj.setMinNumber("Minimum participant number cannot be blank");
            }

            if ((maxNumber.length() == 0)) {
                valid = false;
                errorObj.setMaxNumber("Maximum participant number cannot be blank");
            }
            if ((fee.length() == 0)) {
                valid = false;
                errorObj.setFee("Fee cannot be blank!");
            }
            if (category.length() == 0) {
                valid = false;
                errorObj.setCategory("Category cannot be blank!");
            }
            if (description.length() == 0) {
                valid = false;
                errorObj.setDescription("Description cannot be blank!");
            }

            if (valid) {
                CategoryBean cateBean = new CategoryBean();
                cateBean.setCategory(category);
                boolean existed = cateBean.checkCategory(); //kiểm tra category đã tồn tại chưa?
                if (existed) {
                    SuggestionBean bean = new SuggestionBean();
                    SuggestionDTO dto = new SuggestionDTO(poster, eventname, start, finish, address,
                            Integer.parseInt(minNumber), Integer.parseInt(maxNumber),
                            Double.parseDouble(fee), category, description, false, false, "", username);
                    bean.setDto(dto);
                    boolean inserted = bean.insertSuggestion();
                    if (inserted) {
                        url = employee;
                    } else {
                        request.setAttribute("ERROR", "Insert suggestion failed");
                    }
                } else {
                    errorObj.setCategory("Category is not existed");
                    request.setAttribute("invalidInput", errorObj);
                    url = invalidInput;
                }

            } else {
                request.setAttribute("invalidInput", errorObj);
                url = invalidInput;
            }
        } catch (Exception e) {
            if (e.getMessage().contains("duplicate")) {
                SuggestionErrorObj errorObj = new SuggestionErrorObj();
                errorObj.setEventname("EventName is existed");
                request.setAttribute("invalidInput", errorObj);
                url = invalidInput;
            } else {
                log("ERROR at SuggestController: " + e.getMessage());
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
