package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updateEvent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/insertStyle.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/loginStyle.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("            <div id=\"main_block\">\n");
      out.write("                <!--Top Block Starts -->\n");
      out.write("                <div id=\"top_block\">\n");
      out.write("                    <div class=\"navi\"> \n");
      out.write("                        <a href=\"newIndex.jsp\" class=\"navi_hm\">Home</a> \n");
      out.write("                        <a href=\"newIndex.jsp\" class=\"navi_tx\">Category</a> \n");
      out.write("                        <a href=\"newIndex.jsp\" class=\"navi_tx\">About us</a> \n");
      out.write("                        <a href=\"newIndex.jsp\" class=\"navi_tx\">Login</a> \n");
      out.write("                        <a href=\"newIndex.jsp\" class=\"navi_tx\">Logout</a> \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"tp_img1\">\n");
      out.write("                        <div class=\"tp_img2\"> \n");
      out.write("                            <a href=\"newIndex.jsp\">\n");
      out.write("                                <img src=\"images/logo.gif\" alt=\"\" width=\"211\" height=\"131\" class=\"logo\" />\n");
      out.write("                            </a> <img src=\"images/tp_tx.gif\" alt=\"\" width=\"450\" height=\"49\" class=\"tp_tx\" /> </div>\n");
      out.write("                    </div>\n");
      out.write("                </div> \n");
      out.write("               <!--Top Block Ends -->\n");
      out.write("            </div>\n");
      out.write("        </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <center>\n");
      out.write("        <div id=\"sub_block1\">\n");
      out.write("            <font folor=\"red\"><h3><a href=\"newIndex.jsp\">Back to Login Page</a></h3></font>\n");
      out.write("            <!--Content Block Starts -->\n");
      out.write("            <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty requestScope.DTO}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                <div id=\"content_block\">\n");
      out.write("                    <form action=\"MainController\" method=\"POST\">\n");
      out.write("                        <h1>Update Event Page</h1>\n");
      out.write("                        <fieldset>\n");
      out.write("                            <legend><span class=\"number\">1</span>Add new event Info</legend>\n");
      out.write("                            <label for=\"name\">Poster:</label>\n");
      out.write("                            <input type=\"text\" id=\"name\" name=\"txtPoster\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.DTO.poster}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("                            <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.invalidInput != null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                <font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.invalidInput.poster}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font>\n");
      out.write("                            </c:if>\n");
      out.write("\n");
      out.write("                            <label for=\"name\">Event ID:</label>\n");
      out.write("                            <input type=\"text\" id=\"name\" name=\"txtEventID\" readonly=\"true\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.DTO.eventid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.invalidInput != null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                <font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.invalidInput.eventid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font>\n");
      out.write("                            </c:if>\n");
      out.write("\n");
      out.write("                            <label for=\"name\">Event Name:</label>\n");
      out.write("                            <input type=\"text\" id=\"name\" name=\"txtEventname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.DTO.eventname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.invalidInput != null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                <font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.invalidInput.eventname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font>\n");
      out.write("                            </c:if>\n");
      out.write("\n");
      out.write("                            <label for=\"name\">Start:</label>\n");
      out.write("                            <input type=\"date\" id=\"name\" name=\"txtStart\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.DTO.start}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.invalidInput != null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                <font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.invalidInput.start}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font>\n");
      out.write("                            </c:if>\n");
      out.write("                            \n");
      out.write("                            <label for=\"name\">Finish:</label>\n");
      out.write("                            <input type=\"date\" id=\"name\" name=\"txtFinish\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.DTO.finish}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.invalidInput != null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                <font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.invalidInput.finish}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font>\n");
      out.write("                            </c:if>\n");
      out.write("\n");
      out.write("                            <label for=\"name\">Address:</label>\n");
      out.write("                            <input type=\"text\" id=\"name\" name=\"txtAddress\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.DTO.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.invalidInput != null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                <font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.invalidInput.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font>\n");
      out.write("                            </c:if>\n");
      out.write("\n");
      out.write("                            <label for=\"name\">Minimum Partipant Number:</label>\n");
      out.write("                            <input type=\"number\" id=\"name\" name=\"txtMinNumber\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.DTO.minNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.invalidInput != null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                <font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.invalidInput.minNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font>\n");
      out.write("                            </c:if>\n");
      out.write("\n");
      out.write("                            <label for=\"name\">Maximum Partipant Number:</label>\n");
      out.write("                            <input type=\"number\" id=\"name\" name=\"txtMaxNumber\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.DTO.maxNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.invalidInput != null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                <font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.invalidInput.maxNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font>\n");
      out.write("                            </c:if>\n");
      out.write("\n");
      out.write("                            <label for=\"name\">Fee:</label>\n");
      out.write("                            <input type=\"number\" id=\"name\" name=\"txtFee\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.DTO.fee}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.invalidInput != null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                <font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.invalidInput.fee}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font>\n");
      out.write("                            </c:if>\n");
      out.write("\n");
      out.write("                            <label for=\"name\">Category:</label>\n");
      out.write("                            <input type=\"text\" id=\"name\" name=\"txtCategory\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.DTO.category}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.invalidInput != null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                <font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.invalidInput.category}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font>\n");
      out.write("                            </c:if>\n");
      out.write("\n");
      out.write("                            <label for=\"name\">Description:</label>\n");
      out.write("                            <input type=\"text\" id=\"name\" name=\"txtDescription\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.DTO.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.invalidInput != null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                <font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.invalidInput.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font>\n");
      out.write("                            </c:if>\n");
      out.write("\n");
      out.write("                            <label for=\"name\">Status</label>\n");
      out.write("                            <input type=\"text\" id=\"name\" name=\"txtStatus\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.DTO.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.invalidInput != null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                <font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.invalidInput.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font>\n");
      out.write("                            </c:if>\n");
      out.write("\n");
      out.write("                        </fieldset>\n");
      out.write("\n");
      out.write("                        <input type=\"submit\" id=\"Submit\" value=\"Update Event\" name=\"action\">\n");
      out.write("                    </form>\n");
      out.write("                    <!--Left Block Starts -->\n");
      out.write("                    <!--<div id=\"left_block\">-->\n");
      out.write("                </div>\n");
      out.write("            </c:if>\n");
      out.write("\n");
      out.write("    </center>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/loginStyle.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("            <div id=\"sub_block2\">\n");
      out.write("                <div id=\"footer_block\"> \n");
      out.write("                    <span class=\"ftr_nv\"> \n");
      out.write("                        <a href=\"newIndex.jsp\">Home</a> \n");
      out.write("                        <span>|</span> \n");
      out.write("                        <a href=\"newIndex.jsp\">Category </a> \n");
      out.write("                        <span>|</span> \n");
      out.write("                        <a href=\"newIndex.jsp\">About us</a> \n");
      out.write("                        <span>|</span> \n");
      out.write("                        <a href=\"newIndex.jsp\">Sign up </a> \n");
      out.write("                        <span>|</span> \n");
      out.write("                        <a href=\"newIndex.jsp\">Logout </a> \n");
      out.write("                    </span> \n");
      out.write("                    <span class=\"cpy\">Copyright &copy; 2017, All rights reserved. This website is designed by SE62877</span> \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
