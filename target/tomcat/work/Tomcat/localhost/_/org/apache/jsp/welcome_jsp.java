/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-07-27 09:43:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"C:\\Users\\koyelrana\\Desktop\\boot.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write(".bt{\r\n");
      out.write("    margin-left:150px;\r\n");
      out.write("    margin-top:10px;\r\n");
      out.write("}\r\n");
      out.write(".well{\r\n");
      out.write("    text-align:center;\r\n");
      out.write("    background-color:silver;\r\n");
      out.write("    color:gold;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".lg{\r\n");
      out.write("    border: 10px solid lightgreen;\r\n");
      out.write("    width:500px;\r\n");
      out.write("    padding-left:50px;\r\n");
      out.write("    padding-top:50px;\r\n");
      out.write("}\r\n");
      out.write(".footer\r\n");
      out.write("{\r\n");
      out.write(" margin-top:450px;\r\n");
      out.write(" background-color:skyblue;\r\n");
      out.write("    color:green;\r\n");
      out.write("    height:200px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("#text{\r\n");
      out.write("    background-color:black;\r\n");
      out.write("    color:white;\r\n");
      out.write("}\r\n");
      out.write("body{\r\n");
      out.write("    background:\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"well kk\">\r\n");
      out.write("        <h1>MASTER PAGE</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("  <div class=\"login col-sm-6\">\r\n");
      out.write("\r\n");
      out.write("  <div class=\"lg\">\r\n");
      out.write("        <form action=\"Home\" method=\"POST\">\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("                 \r\n");
      out.write("                    FIRST NAME\r\n");
      out.write("                &nbsp; &nbsp;  &nbsp; &nbsp;  &nbsp; &nbsp;   &nbsp; &nbsp;   <input id=\"text\" type=\"text\" name=\"firstname\">\r\n");
      out.write("           <br/></br>\r\n");
      out.write("                    LAST NAME &nbsp; &nbsp;  &nbsp; &nbsp;  &nbsp; &nbsp;   &nbsp; &nbsp;  &nbsp; \r\n");
      out.write("                    <input id=\"text\" type=\"text\" name=\"lastname\">\r\n");
      out.write("            <br/>\r\n");
      out.write("            \r\n");
      out.write("               \r\n");
      out.write("<br/>\r\n");
      out.write("     <button type=Submit class=\"btn btn-success bt\">Login</button>\r\n");
      out.write("       <br/><br/><br><br>\r\n");
      out.write("</div><br/>\r\n");
      out.write("         \r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("      \r\n");
      out.write("        </form>\r\n");
      out.write("        \r\n");
      out.write("            <a href=\"index.jsp\" target=\"_blank\"><button class=\"btn btn-primary\" type=\"submit\">Register</button></a>\r\n");
      out.write("                    <a href=\"ViewUser\" target=\"_blank\"><button class=\"btn btn-primary\" type=\"submit\">View here</button></a>\r\n");
      out.write("              \r\n");
      out.write("                    <a href=\"delete.jsp\" target=\"_blank\"><button  class=\"btn btn-danger\"type=\"submit\">Delete</button></a>\r\n");
      out.write("                <a href=\"update.jsp\" target=\"_blank\">  <button class=\"btn btn-warning\" type=\"submit\">  Update</button></a>\r\n");
      out.write("      \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"cl col-sm-6\">\r\n");
      out.write("<img src=\"http://diyhealth.com/wp-content/uploads/2013/04/tech_related_health_issues_g5iyh.jpg\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"footer\">\r\n");
      out.write("        <h5>Contact Us:<br/>\r\n");
      out.write("        Name: Koyel Rana<br/>\r\n");
      out.write("        Email:koyel.rana@kggroup.com<br/>\r\n");
      out.write("        Mobile No: 9025997001</h5>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
