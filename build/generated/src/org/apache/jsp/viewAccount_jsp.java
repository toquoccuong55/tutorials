package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class viewAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>View Accounts</title>\n");
      out.write("        <link href=\"css/guestStyle.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
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
      out.write("                        <a href=\"MainController?action=loadCategory\" class=\"navi_tx\">Category</a> \n");
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
      out.write("            <!--Content Block Starts -->\n");
      out.write("            <font folor=\"red\"><h3><a href=\"newIndex.jsp\">Back to Admin Page</a></h3></font>\n");
      out.write("            <div id=\"content_block\">\n");
      out.write("                <!--Right Block Starts -->\n");
      out.write("                <div id=\"right_block\" style=\"width:100%\"> \n");
      out.write("                    <form action=\"MainController\" method=\"POST\" >\n");
      out.write("                        <h1>View Employee Accounts</h1>\n");
      out.write("                        <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty requestScope.accountList}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <h2>No record is matched</h2>\n");
      out.write("                        </c:if>\n");
      out.write("                        <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty requestScope.accountList}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <fieldset>\n");
      out.write("                                <table style=\"width:100%\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Username</th>\n");
      out.write("                                            <th>Full name</th>\n");
      out.write("                                            <th>Email</th>\n");
      out.write("                                            <th>Phone</th>\n");
      out.write("                                            <th>Delete</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.accountList}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"dto\">\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.fullname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <c:url var=\"deleteEvent\" value=\"MainController\">\n");
      out.write("                                                        <c:param name=\"action\" value=\"Remove Event\"/>                                                        \n");
      out.write("                                                        <c:param name=\"txtEventID\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.eventid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                                    </c:url>\n");
      out.write("                                                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${deleteEvent}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Delete</a>\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </c:forEach>\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </fieldset>\n");
      out.write("                        </c:if>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <!--Right Block Ends -->\n");
      out.write("                <!--Content Block Ends -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
