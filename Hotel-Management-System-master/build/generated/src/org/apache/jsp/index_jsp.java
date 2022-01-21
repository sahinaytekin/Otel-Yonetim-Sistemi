package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; utf-8;charset=utf-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\"></link>\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<style>\n");
      out.write(".button- {\n");
      out.write("\n");
      out.write("  background-color: #f4511e;\n");
      out.write("\n");
      out.write("  border: none;\n");
      out.write("\n");
      out.write("  color: white;\n");
      out.write("\n");
      out.write("  padding: 16px 32px;\n");
      out.write("\n");
      out.write("  text-align: center;\n");
      out.write("\n");
      out.write("  font-size: 16px;\n");
      out.write("\n");
      out.write("  margin: 4px 2px;\n");
      out.write("\n");
      out.write("  opacity: 0.6;\n");
      out.write("\n");
      out.write("  transition: 0.3s;\n");
      out.write("\n");
      out.write("  display: inline-block;\n");
      out.write("\n");
      out.write("  text-decoration: none;\n");
      out.write("\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button:hover {opacity: 1} \n");
      out.write("\n");
      out.write("    box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button2:hover {\n");
      out.write("\n");
      out.write("    box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button3 {\n");
      out.write("\n");
      out.write("  background-color: #666666;\n");
      out.write("\n");
      out.write("  border: none;\n");
      out.write("\n");
      out.write("  color: white;\n");
      out.write("\n");
      out.write("  padding: 16px 32px;\n");
      out.write("\n");
      out.write("  text-align: center;\n");
      out.write("\n");
      out.write("  font-size: 16px;\n");
      out.write("\n");
      out.write("  margin: 4px 2px;\n");
      out.write("\n");
      out.write("  opacity: 0.7;\n");
      out.write("\n");
      out.write("  transition: 0.3s;\n");
      out.write("\n");
      out.write("  display: inline-block;\n");
      out.write("\n");
      out.write("  text-decoration: none;\n");
      out.write("\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button3:hover {opacity: 0.8}\n");
      out.write("    \n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body> \n");

	if(session.getAttribute("userid")==null){
		response.sendRedirect("login.jsp");
	}

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<center><div style=\"width: 200px; height: 50px;\"><h2>Hoşgeldin<h2> <FONT COLOR=black> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userid }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</FONT> <br> \n");
      out.write("            </center>\n");
      out.write("   <div class=menu>\n");
      out.write("       <center><div style=\"margin-top: 150px; border-color: #ffffff; border-style: solid; width: 200px;\" ><a href=\"RoomForm.jsp\" class=\"button3\" style=\"text-decoration:none;\"><h2>Oda Durumu</h2></a></div> </center>\n");
      out.write("   \t<center><div style=\"margin-top: 10px; border-color: #ffffff; border-style: solid; width: 200px;\"><a href=\"GuestForm.jsp\" class=\"button3\" style=\"text-decoration:none;\"><h2>Müşteri Ekle</h2></a></div> </center>\n");
      out.write("   \n");
      out.write("        <center> <div style=\"margin-top: 10px;\"><form action=\"LogoutServlet\">\n");
      out.write("   \t\t<input type=\"submit\" class =\"button\" value=\"Çıkış\"> \n");
      out.write("                </form> </div> </center>\n");
      out.write("        \n");
      out.write("        <input type=\"submit\" class =\"button\" value=\"Güncelle\" ><a href=\"GuestForm.jsp\"> Güncelle\n");
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
