package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">  \n");
      out.write("            <form id=\"contact\" action=\"\" method=\"post\">\n");
      out.write("                <h3>Quick Contact</h3>\n");
      out.write("                <h4>Contact us today, and get reply with in 24 hours!</h4>\n");
      out.write("                <fieldset>\n");
      out.write("                    <input placeholder=\"Your name\" type=\"text\" tabindex=\"1\" required autofocus>\n");
      out.write("                </fieldset>\n");
      out.write("                <fieldset>\n");
      out.write("                    <input placeholder=\"Your Email Address\" type=\"email\" tabindex=\"2\" required>\n");
      out.write("                </fieldset>\n");
      out.write("                <fieldset>\n");
      out.write("                    <input placeholder=\"Your Phone Number\" type=\"tel\" tabindex=\"3\" required>\n");
      out.write("                </fieldset>\n");
      out.write("                <fieldset>\n");
      out.write("                    <input placeholder=\"Your Web Site starts with http://\" type=\"url\" tabindex=\"4\" required>\n");
      out.write("                </fieldset>\n");
      out.write("                <fieldset>\n");
      out.write("                    <textarea placeholder=\"Type your Message Here....\" tabindex=\"5\" required></textarea>\n");
      out.write("                </fieldset>\n");
      out.write("                <fieldset>\n");
      out.write("                    <button name=\"submit\" type=\"submit\" id=\"contact-submit\" data-submit=\"...Sending\">Submit</button>\n");
      out.write("                </fieldset>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
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
