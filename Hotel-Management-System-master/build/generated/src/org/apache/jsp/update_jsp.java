package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
 Class.forName("com.mysql.jdbc.Driver");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("    <title>Ders Güncelleme</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1>Ders Güncelleme</h1>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("            <form method=\"POST\" align=\"left\" action=\"Data.jsp\">\n");
      out.write("                ");

                Connection con;
                PreparedStatement pst;
                ResultSet rs;

                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/hotelmanagement","root","");
                
                String id = request.getParameter("id");
                
                pst = con.prepareStatement("select * from room where id = ?");
                pst.setString(1, id);
                rs = pst.executeQuery();
                
                while (rs.next()) {
                    
                
                
                
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div>\n");
      out.write("                    <label class=\"form-label\">Ders ID : </label>\n");
      out.write("                    <input type=\"text\" id=\"id\" name=\"id\" placeholder=\"Ders ID\" class=\"form-control\" value=\"");
      out.print( rs.getString("roomID") );
      out.write("\" required>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <label class=\"form-label\">Ders ID : </label>\n");
      out.write("                    <input type=\"text\" id=\"roomNo\" name=\"roomNo\" placeholder=\"Ders ID\" class=\"form-control\" value=\"");
      out.print( rs.getString("roomNo") );
      out.write("\" required>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <label class=\"form-label\">Ders Adı : </label>\n");
      out.write("                    <input type=\"text\" id=\"roomType\" name=\"roomType\" placeholder=\"Ders Adi\" class=\"form-control\" value=\"");
      out.print( rs.getString("roomType") );
      out.write("\" required>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <label class=\"form-label\">Ders Süresi : </label>\n");
      out.write("                    <input type=\"text\" id=\"bedType\" name=\"bedType\" placeholder=\"Ders Süresi\" class=\"form-control\" value=\"");
      out.print( rs.getString("bedType") );
      out.write("\" required>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <label class=\"form-label\">Ders ID : </label>\n");
      out.write("                    <input type=\"text\" id=\"tariff\" name=\"tariff\" placeholder=\"Ders ID\" class=\"form-control\" value=\"");
      out.print( rs.getString("tariff") );
      out.write("\" required>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <label class=\"form-label\">Ders Adı : </label>\n");
      out.write("                    <input type=\"text\" id=\"status\" name=\"status\" placeholder=\"Ders Adi\" class=\"form-control\" value=\"");
      out.print( rs.getString("status") );
      out.write("\" required>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <label class=\"form-label\">Ders Süresi : </label>\n");
      out.write("                    <input type=\"text\" id=\"guest\" name=\"guest\" placeholder=\"Ders Süresi\" class=\"form-control\" value=\"");
      out.print( rs.getString("guest") );
      out.write("\" required>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <input type=\"submit\" name=\"submit\" class=\"btn btn-info\" value=\"Gönder\">\n");
      out.write("                    <input type=\"reset\" name=\"reset\" class=\"btn btn-warning\" value=\"Temizle\">\n");
      out.write("                </div>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-8\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("</body>\n");
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
