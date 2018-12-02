package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.ArrayList;
import student.vote;

public final class jsp1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <body background=\"wall.jpeg\"> \n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("           * {box-sizing:border-box}\n");
      out.write("body {font-family: Verdana,sans-serif;}\n");
      out.write(" div.top {\n");
      out.write("  background: url(wall.jpeg) repeat;\n");
      out.write("  border: 10px solid black;\n");
      out.write("}\n");
      out.write("ul {\n");
      out.write("    list-style-type: none;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    overflow: hidden;\n");
      out.write("    background-color: #333333;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li {\n");
      out.write("    float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a {\n");
      out.write("    display: block;\n");
      out.write("    color: white;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 20px;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover {\n");
      out.write("    background-color: #111111;\n");
      out.write("}\n");
      out.write("li img {\n");
      out.write("\tdisplay:block;\n");
      out.write("\tpadding: 6px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("            table,th, td \n");
      out.write("            {\n");
      out.write("                padding: 15px;\n");
      out.write("                text-align: left;\n");
      out.write("                font-size: 20px !important;\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            table td \n");
      out.write("            {\n");
      out.write("                border-left: 1px solid #000;\n");
      out.write("                border-right: 1px solid #000;\n");
      out.write("            }\n");
      out.write("            tr:hover {background-color:#cfd8dc;}\n");
      out.write("        </style>\n");
      out.write("    <body background=\"wall.jpeg\">\n");
      out.write("     <ul>\n");
      out.write("   <li><a href=\"student.html\"><img src=\"img.png\"></a></li>\n");
      out.write("  <li><a href=\"student.html\">Home</a></li>\n");
      out.write("<li><a href=\"about.html\">About</a></li>\n");
      out.write("<li margin=\"right\"><right><a href=\"index.html\">Logout</a></right></li>\n");
      out.write("  </UL>\n");
      out.write("        ");

            
           
            response.setHeader("Cache-Control","no-cache,no-store,must-revalidate"); //HTTP 1.1
            
            response.setHeader("Pragma", "no-cache");//HTTP 1.0s
            
            response.setHeader("Expires", "0");
            
            
            
//            if(session.getAttribute("email")==null)
//            {
//                response.sendRedirect("viewcandidates.java");
//            }
            System.out.println("vtc reached.");
            ArrayList<vote> v=(ArrayList)session.getAttribute("voter");
            System.out.println("v.size()" + v.size());
            int i = Integer.parseInt((String)session.getAttribute("i"));
            Iterator it = v.iterator();
            while(it.hasNext())
            {
                
                vote d =(vote)it.next();
            
        
      out.write("\n");
      out.write("       \n");
      out.write("                   <table style=\"border:1px solid black;\">\n");
      out.write("                        <tbody>\n");
      out.write("                 <tr>\n");
      out.write("                        \n");
      out.write("                                <td><strong>Candidate Name </strong></td>\n");
      out.write("                                <td>");
      out.print(d.f_name);
      out.write(' ');
      out.print(d.l_name);
      out.write("</td>\n");
      out.write("                        \n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                                <tr>\n");
      out.write("                                    <td><strong>year</strong></td></b>\n");
      out.write("                                    <td>");
      out.print(d.yr);
      out.write("</td>\n");
      out.write("                        \n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><strong>image</strong></td></b>\n");
      out.write("                                    <td>");
      out.print(d.img);
      out.write("</td>\n");
      out.write("                        \n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td ><strong>Subject</strong></td></b>\n");
      out.write("                                    <td>");
      out.print(d.subject);
      out.write("</td>\n");
      out.write("                        \n");
      out.write("                         </tr>\n");
      out.write("                  <tr><a href=\"counting?f_name=");
      out.print(d.f_name);
      out.write("&id=");
      out.print(i);
      out.write("\"><button type=\"button\">VOTE</button></a>\n");
      out.write("                        </tbody>\n");
      out.write("                       </table>                    \n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("          \n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("              $(document).ready(function(){\n");
      out.write("                $('.tooltipped').tooltip();\n");
      out.write("                });\n");
      out.write("              $(document).ready(function(){\n");
      out.write("                $('.sidenav')\n");
      out.write("                    .sidenav()\n");
      out.write("                    .on('click tap', 'li a', () => {\n");
      out.write("                $('.sidenav').sidenav('close');\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("        </script>      \n");
      out.write("                        \n");
      out.write("        <footer class=\"white-text blue-grey darken-4 \" style=\"position: fixed;bottom:0px;left:0;width:100%;height:20px; font-size: 12px;\">\n");
      out.write("           <div class=\"footer-copyright\">\n");
      out.write("            <div class=\"container center-align\">\n");
      out.write("                &copy; 2018 CHITKARA UNIVERSITY\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
