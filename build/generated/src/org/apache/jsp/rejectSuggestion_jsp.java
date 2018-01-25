package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cuongto.dtos.SuggestionDTO;

public final class rejectSuggestion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("    <center>\n");
      out.write("        <div id=\"sub_block1\">\n");
      out.write("            <font folor=\"red\"><h3><a href=\"newIndex.jsp\">Back to Login Page</a></h3></font>\n");
      out.write("            <!--Content Block Starts -->\n");
      out.write("            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            <!--trong trường hợp addNewEvent không có kết quả thì lấy kết quả từ param-->\n");
      out.write("            ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </center>\n");
      out.write("    ");
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
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty requestScope.rejectSuggestion}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <div id=\"content_block\">\n");
        out.write("                    <form action=\"MainController\" method=\"POST\">\n");
        out.write("                        <h1>Please fill in the Reject Suggestion Form</h1>\n");
        out.write("                        <fieldset>\n");
        out.write("                            <legend><span class=\"number\">1</span>Reject Suggestion Info</legend>\n");
        out.write("                            <label for=\"name\">Poster:</label>\n");
        out.write("                            <input type=\"text\" id=\"name\" name=\"txtPoster\" readonly=\"true\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.rejectSuggestion.poster}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" >\n");
        out.write("\n");
        out.write("                            <label for=\"name\">Event Name:</label>\n");
        out.write("                            <input type=\"text\" id=\"name\" name=\"txtEventname\" readonly=\"true\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.rejectSuggestion.eventname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("\n");
        out.write("                            <label for=\"name\">Start:</label>\n");
        out.write("                            <input type=\"date\" id=\"name\" name=\"txtStart\" readonly=\"true\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.rejectSuggestion.start}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                            \n");
        out.write("                            <label for=\"name\">Finish:</label>\n");
        out.write("                            <input type=\"date\" id=\"name\" name=\"txtFinish\" readonly=\"true\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.rejectSuggestion.finish}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("\n");
        out.write("                            <label for=\"name\">Address:</label>\n");
        out.write("                            <input type=\"text\" id=\"name\" name=\"txtAddress\" readonly=\"true\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.rejectSuggestion.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                            \n");
        out.write("                            <label for=\"name\">Minimum Participant Number:</label>\n");
        out.write("                            <input type=\"number\" id=\"name\" name=\"txtMinNumber\" readonly=\"true\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.rejectSuggestion.minNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                            \n");
        out.write("                            <label for=\"name\">Maximum Participant Number:</label>\n");
        out.write("                            <input type=\"number\" id=\"name\" name=\"txtMaxNumber\" readonly=\"true\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.rejectSuggestion.maxNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                            \n");
        out.write("                            <label for=\"name\">Fee:</label>\n");
        out.write("                            <input type=\"number\" id=\"name\" name=\"txtFee\" readonly=\"true\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.rejectSuggestion.fee}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                            \n");
        out.write("                            <label for=\"name\">Category:</label>\n");
        out.write("                            <input type=\"text\" id=\"name\" name=\"txtCategory\" readonly=\"true\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.rejectSuggestion.category}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                            \n");
        out.write("                            <label for=\"name\">Description:</label>\n");
        out.write("                            <input type=\"text\" id=\"name\" name=\"txtDescription\" readonly=\"true\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.rejectSuggestion.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                            \n");
        out.write("                            <label for=\"name\">Suggestor:</label>\n");
        out.write("                            <input type=\"text\" id=\"name\" name=\"txtSuggestor\" readonly=\"true\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.rejectSuggestion.suggestor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                            \n");
        out.write("                            <label for=\"name\">Reason:</label>\n");
        out.write("                            <input type=\"text\" id=\"name\" name=\"txtReason\">\n");
        out.write("                            ");
        if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                        </fieldset>\n");
        out.write("\n");
        out.write("                        <input type=\"submit\" id=\"Submit\" value=\"Reject Suggestion\" name=\"action\">\n");
        out.write("                    </form>\n");
        out.write("                    <!--Left Block Starts -->\n");
        out.write("                    <!--<div id=\"left_block\">-->\n");
        out.write("                </div>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.invalidInput != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <font color=\"red\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.invalidInput.suggestor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</font>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty requestScope.rejectSuggestion}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <div id=\"content_block\">\n");
        out.write("                    <form action=\"MainController\" method=\"POST\">\n");
        out.write("                        <h1>Please fill in the Reject Suggestion Form</h1>\n");
        out.write("                        <fieldset>\n");
        out.write("                            <legend><span class=\"number\">1</span>Reject Suggestion Info</legend>\n");
        out.write("                            <label for=\"name\">Poster:</label>\n");
        out.write("                            <input type=\"text\" id=\"name\" name=\"txtPoster\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtPoster}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" >\n");
        out.write("\n");
        out.write("                            <label for=\"name\">Event Name:</label>\n");
        out.write("                            <input type=\"text\" id=\"name\" name=\"txtEventname\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtEventname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                            \n");
        out.write("                            <label for=\"name\">Start:</label>\n");
        out.write("                            <input type=\"date\" id=\"name\" name=\"txtStart\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtStart}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                            \n");
        out.write("                            <label for=\"name\">Finish:</label>\n");
        out.write("                            <input type=\"date\" id=\"name\" name=\"txtFinish\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtFinish}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                            \n");
        out.write("                            <label for=\"name\">Address:</label>\n");
        out.write("                            <input type=\"text\" id=\"name\" name=\"txtAddress\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtAddress}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                            \n");
        out.write("                            <label for=\"name\">Minimum Participant Number:</label>\n");
        out.write("                            <input type=\"number\" id=\"name\" name=\"txtMinNumber\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtMinNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                            \n");
        out.write("                            <label for=\"name\">Maximum Participant Number:</label>\n");
        out.write("                            <input type=\"number\" id=\"name\" name=\"txtMaxNumber\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtMaxNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                            \n");
        out.write("                            <label for=\"name\">Fee:</label>\n");
        out.write("                            <input type=\"number\" id=\"name\" name=\"txtFee\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtFee}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                            \n");
        out.write("                            <label for=\"name\">Category:</label>\n");
        out.write("                            <input type=\"text\" id=\"name\" name=\"txtCategory\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtCategory}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                            \n");
        out.write("                            <label for=\"name\">Description:</label>\n");
        out.write("                            <input type=\"text\" id=\"name\" name=\"txtDescription\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtDescription}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                            \n");
        out.write("                            <label for=\"name\">Suggestor:</label>\n");
        out.write("                            <input type=\"text\" id=\"name\" name=\"txtSuggestor\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtSuggestor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                            \n");
        out.write("                            <label for=\"name\">Reason:</label>\n");
        out.write("                            <input type=\"text\" id=\"name\" name=\"txtReason\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtReason}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                            ");
        if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                        </fieldset>\n");
        out.write("\n");
        out.write("                        <input type=\"submit\" id=\"Submit\" value=\"Reject Suggestion\" name=\"action\">\n");
        out.write("                    </form>\n");
        out.write("                    <!--Left Block Starts -->\n");
        out.write("                    <!--<div id=\"left_block\">-->\n");
        out.write("                </div>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.invalidInput != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <font color=\"red\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.invalidInput.reason}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</font>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }
}
