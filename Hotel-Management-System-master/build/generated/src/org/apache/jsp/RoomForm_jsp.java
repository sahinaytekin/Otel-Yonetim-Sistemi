package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.*;
import java.util.List;

public final class RoomForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<style>\n");
      out.write("    body{\n");
      out.write("\tmargin:0 auto;\n");
      out.write("\tbackground-image: url(\"images/body2.jpg\");\n");
      out.write("\tbackground-repeat: no-repeat;\n");
      out.write("\tbackground-size: 100% 720px;\n");
      out.write("}\n");
      out.write("    table{ border-collapse: collapse; width: 50%;}\n");
      out.write("    table td{border: 1px solid white    ;}\n");
      out.write("    td {\n");
      out.write("    background-color:#999999;\n");
      out.write("    height: 10px;\n");
      out.write("    color:white; \n");
      out.write("    padding:10px;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("th{background-color:#515459;\n");
      out.write("\n");
      out.write("   color:#fff;\n");
      out.write("  }\n");
      out.write("  .button {\n");
      out.write("\n");
      out.write("  background-color: #f4511e;\n");
      out.write("\n");
      out.write("  border: none;\n");
      out.write("\n");
      out.write("  color: white;\n");
      out.write("\n");
      out.write("  padding: 8px 16px;\n");
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
      out.write("  \n");
      out.write("  border-radius: 10px;\n");
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
      out.write(".button3:hover {opacity: 1}\n");
      out.write("    \n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body> \n");

	if(session.getAttribute("userid")==null){
		response.sendRedirect("login.jsp");
	}

      out.write("\n");
      out.write("<form>\n");
      out.write("\t<TABLE table border=\"1\" cellpadding=\"10\">\n");
      out.write("\t\t<TR><TD>Oda No</TD>\t<TD><input type=text name=roomNo /></TD></TR>\n");
      out.write("\t\t<TR><TD>Klima: </TD>\n");
      out.write("        <TD><input type=\"radio\" name=roomType value=\"Evet\"/>Evet\n");
      out.write("        <input type=\"radio\" name=roomType value=\"Hayır\"/>Hayır</TD>\n");
      out.write("        </TR>\n");
      out.write("        <TR><TD>Yatak: </TD>\n");
      out.write("        <TD><input type=\"radio\" name=bedType value=\"Tek Kişilik\"/>Tek Kişilik\n");
      out.write("        <input type=\"radio\" name=bedType value=\"Çift Kişilik\"/>Çift Kişilik</TD>\n");
      out.write("        </TR>\n");
      out.write("\t\t<TR><td>Fiyat</TD>\t<TD><input type=text name=tariff /></TD></TR>\n");
      out.write("\t\t<TR><TD></TD> <TD><input type=submit class=\"button\" value=Ekle /></TD></TR>\n");
      out.write("\t</TABLE>\n");
      out.write("</form>\n");
      out.write("\n");

 RoomDAO rdao=new RoomDAO();
		
//write a code to add room
	int roomNo;
	String roomType, bedType;
	double tariff;
	
if(request.getParameter("roomNo")!=null)
{	
	roomNo=Integer.parseInt(request.getParameter("roomNo"));
	roomType=request.getParameter("roomType");
	bedType=request.getParameter("bedType");
	tariff=Double.parseDouble(request.getParameter("tariff"));
	
	Room room=new Room(roomNo, roomType, bedType, tariff);
	
	try{
		rdao.addRoom(room);
		out.print("Oda Başarıyla Eklendi..");
	}catch(Exception ex)
	{
		out.println(ex.getMessage());
	}
}

      out.write("\n");
      out.write("\n");
      out.write("<br/><br/> <h3>Oda No:</h3>\n");
      out.write("<form>\n");
      out.write("\t<select name=roomno>\n");
      out.write("\t\t");

		RoomDAO rrdao=new RoomDAO();
		try
		{
			List<Integer> rooms= rrdao.getAllRoomsNo();
			for(Integer rn:rooms){
		
      out.write("\n");
      out.write("          \t\t<option value=\"");
      out.print(rn);
      out.write('"');
      out.write('>');
      out.print(rn);
      out.write("</option>\n");
      out.write("\t\t");

     		}
		}catch(Exception e){    out.print(e);}
		
      out.write("\n");
      out.write("\t</select>\n");
      out.write("        <input type=submit class=\"button\" value=Sil />\n");
      out.write("</form>\n");

//RoomDAO rmdao= new RoomDAO();
int r;
if(request.getParameter("roomno")!=null){
	r= Integer.parseInt(request.getParameter("roomno"));
	rdao.removeRoom(r);
	out.print("Oda "+r+"  Başarıyla Silindi..");
}

      out.write('\n');
      out.write('\n');

//display all room
try{
	List<Room> rooms= rdao.getAllRooms();
	out.print("<TABLE BORDER =1>");
	out.print("<THEAD><TH>Oda No</TH><TH>Klima</TH><TH>Yatak</TH><TH>Fiyat</TH><TH>Durum</TH><TH>Misafir</TH>");
	for(Room room : rooms){
		String status;
		status= room.getStatus() ? "Dolu" : "Boş";
			out.print("<TR>");
			out.println("<TD>"+room.getRoomNo()+"</TD><TD>"+room.getRoomType()+"</TD><TD>"+room.getBedType()+"</TD><TD>"+room.getTariff()+"</TD><TD>"+status+"</TD><TD>"+room.getGuest()+"</TD>");
			out.print("</TR>");
	}
	out.print("</TABLE>");
}catch(Exception ex){
	out.println(ex.getMessage());
}
//get all rooms
try{
	//
}
catch(Exception ex){
	out.println(ex.getMessage());
}

      out.write("\n");
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
