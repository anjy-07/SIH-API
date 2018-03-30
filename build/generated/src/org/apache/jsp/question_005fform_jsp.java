package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class question_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script type=\"text/javascript\" src=\"js/question_form.js\"></script>\n");
      out.write("        <link rel = \"stylesheet\" type = \"text/css\" href = \"css/question_form.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>Question Form</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        int tid = Integer.parseInt(request.getParameter("tid"));
        System.out.println(tid);
        
      out.write("\n");
      out.write("    <center><div id=\"heading\"><h1>QUESTIONNAIRE</h1></div></center>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div class=\"conatiner\">\n");
      out.write("        <div class=\"jumbotron\" style=\"width: 60%; margin-left: 23%; padding: 20px; background-color: gray; \">\n");
      out.write("            <form>\n");
      out.write("               <div class=\"form-group\">\n");
      out.write("                 <label for=\"Question\">Question</label>\n");
      out.write("                 <input type=\"text\" name=\"question\" id=\"question\" class=\"form-control\" Placeholder=\"Question\">\n");
      out.write("               </div>\n");
      out.write("               <div class=\"form-group\">\n");
      out.write("                 <label for=\"inputType\">Select type</label>\n");
      out.write("                 <select name=\"question_format\" id=\"question_format\" class=\"form-control\" onchange=\"quest_opt()\">\n");
      out.write("                        <option value=\"Short Text\">Short Text</option>\n");
      out.write("                        <option value=\"Paragraph\">Paragraph</option>\n");
      out.write("                        <option value=\"Multiple Choice\">Multiple Choice</option>\n");
      out.write("                        <option value=\"Check Boxes\">Check Boxes</option>\n");
      out.write("                        <option value=\"Drop Down\">Drop Down</option>\n");
      out.write("                        <option value=\"Date\">Date</option>\n");
      out.write("                        <option value=\"Linear Scale\">Linear Scale</option>\n");
      out.write("                 </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label >Description</label>\n");
      out.write("                    <textarea class=\"form-control\"  name=\"question_description\" id=\"question_description\" placeholder=\"Description...\"></textarea>\n");
      out.write("                </div>  \n");
      out.write("                <div class=\"form-group\" id=\"question_option\">\n");
      out.write("                     \n");
      out.write("                     <input class=\"form-control\" type=\"text\" name=\"no_of_option\" id=\"no_of_option\" placeholder=\"no_of_option\" value=\"1\" onkeyup=\"change_opt(this.value)\" />\n");
      out.write("                     <div class=\"form-group\" id=\"option\">\n");
      out.write("                         <input placeholder=\"1)\" class=\"form-control\" type=\"text\" name=\"option1\" id=\"option1\"/>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <span><input class=\"form-control btn-primary\" style=\"width: 100px;\" type=\"button\"  name=\"create\" value=\"create\" id=\"create\" onclick=\"create_question(");
      out.print( tid );
      out.write(")\"/></span>\n");
      out.write("                <span style=\"margin-left: 20px;\"><input class=\"form-control btn-primary\" style=\"width: 100px;\" type=\"button\"  name=\"cancel\" value=\"cancel\" id=\"cancel\"/></span>\n");
      out.write("                <div>\n");
      out.write("                     Required\n");
      out.write("                    <label style=\"margin-top: 2px;\" class=\"switch\">\n");
      out.write("                        <input style=\"margin-top: 2px;\" type=\"checkbox\" id=\"required\" name=\"required\">\n");
      out.write("                        <span style=\"margin-top: 2px;\" class=\"slider round\"></span>\n");
      out.write("                    </label> \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                     \n");
      out.write("                   \n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
