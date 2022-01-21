package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.*;
import java.util.List;

public final class GuestForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style> \n");
      out.write("    body{\n");
      out.write("\tmargin:0 auto;\n");
      out.write("\tbackground-image: url(\"images/body2.jpg\");\n");
      out.write("\tbackground-repeat: no-repeat;\n");
      out.write("\tbackground-size: 100% 720px;\n");
      out.write("}\n");
      out.write("table{ border-collapse: collapse; width: 50%;}\n");
      out.write(" table td{border: 1px solid white;}\n");
      out.write("td {\n");
      out.write("    background-color:#999999;\n");
      out.write("   \n");
      out.write("    color:white; \n");
      out.write("    margin-top:10px;\n");
      out.write("    }\n");
      out.write("    th{background-color:#515459;\n");
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
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body> \n");

	if(session.getAttribute("userid")==null){
		response.sendRedirect("login.jsp");
	}

      out.write("\n");
      out.write("    <form>\n");
      out.write("\t<TABLE>\n");
      out.write("\t\n");
      out.write("\t\t<TR><TD>Müşteri Adı: </TD>\t<TD><input type=text name=guestName /></TD></TR>\n");
      out.write("<TR><TD>Oda No: </TD>\n");
      out.write("\t\n");
      out.write("\t<TD><select name=roomNo>\n");
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
      out.write("\t</select></TD>\n");
      out.write(" \t\t<TR><TD>Cinsiyet</TD>\n");
      out.write(" \t\t\t<TD><select name=gender>\n");
      out.write("        \t<option name=male value=Erkek> Erkek </option>\n");
      out.write("        \t<option name=famale value=Kadın> Kadın </option>\n");
      out.write("        \t<option name=other value=Diğer> Dİğer </option>\n");
      out.write("        \t</select>\n");
      out.write("        \t</TD>\n");
      out.write("        </TR>\n");
      out.write("\t\t<TR><TD>Medeni Durum: </TD>\n");
      out.write("        \t<TD><input type=\"radio\" name=status value=\"Bekar\"/>Bekar\n");
      out.write("        \t\t<input type=\"radio\" name=status value=\"Evli\"/>Evli</TD>\n");
      out.write("        </TR>\t\t\n");
      out.write("        <tr><td>Şehir: </TD>\t<TD><input type=text name=city /></TD></TR>\n");
      out.write("\t\t<tr><td>Ülke: </TD>\t<TD><input type=text name=country /></TD></TR>\n");
      out.write("\t\t<tr><td>Telefon: </TD>\t<TD><input type=text name=phone /></TD></TR>\n");
      out.write("\t\t<tr><td>Kaç Gece Kalacak: </TD>\t<TD><input type=text name=nightsStay /></TD></TR>\n");
      out.write("\t\t\n");
      out.write("        <tr>\t<TD></TD><TD><input type=submit class=\"button\" value=Ekle /></TD></TR>\n");
      out.write("\t</TABLE>\n");
      out.write("    </form>\n");
      out.write(" ");

 GuestDAO gdao=new GuestDAO();
		
//write a code to add guest
	String guestName, gender, status, city, country, phone, checkIn, checkOut;
	int room, nightsStay;
	
if(request.getParameter("guestName")!=null)
{
	guestName=request.getParameter("guestName");
	gender=request.getParameter("gender");
	status=request.getParameter("status");
	city=request.getParameter("city");
	country=request.getParameter("country");
	phone=request.getParameter("phone");
	
	room=Integer.parseInt(request.getParameter("roomNo"));
	nightsStay= Integer.parseInt(request.getParameter("nightsStay"));
	
	Guest guest=new Guest(guestName, gender, status, city, country, phone, room, nightsStay);
	
	try{
		gdao.addGuest(guest);
		out.print("Müşteri Başarıyla Eklendi..");
	}catch(Exception ex)
	{
		out.println(ex.getMessage());
	}
}
//get all rooms
try{
	RoomDAO rdao= new RoomDAO();
	List<Guest> guests= gdao.getAllGuests();
}
catch(Exception ex){
	out.println(ex.getMessage());
}
//display all guest
try{
	List<Guest> guests= gdao.getAllGuests();
	out.print("<TABLE BORDER =1>");

	out.print("<THEAD><TH>Oda No</TH><TH>Müşteri Adı</TH><TH>Cinsiyet</TH><TH>Medeni Durum</TH><TH>Şehir</TH><TH>Ülke</TH><TH>Telefon</TH><TH>Kaç Gece Kalacak</TH><TH>Giriş</TH><TH>Çıkış</TH></THEAD>");
	
	for(Guest guest : guests)
	{
			out.print("<TR>");
			out.println("<TD>"+guest.getSelectedRoom()+"</TD><TD>"+guest.getGuestName()+"</TD><TD>"+guest.getGender()+"</TD><TD>"+guest.getStatus()+"</TD><TD>"+guest.getCity()+"</TD><TD>"+guest.getCountry()+"</TD><TD>"+guest.getPhone()+"</TD><TD>"+guest.getNightsStay()+"</TD><TD>"+guest.getCheckIn()+"</TD><TD>"+guest.getCheckOut()+"</TD>");
			out.print("</TR>");
	}
	out.print("</TABLE>");
}catch(Exception ex){
	out.println(ex.getMessage());
}
//*/
 
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
