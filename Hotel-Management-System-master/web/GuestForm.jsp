<%@page import="model.*" %>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style> 
    body{
	margin:0 auto;
	background-image: url("images/body2.jpg");
	background-repeat: no-repeat;
	background-size: 100% 720px;
}
table{ border-collapse: collapse; width: 50%;}
 table td{border: 1px solid white;}
td {
    background-color:#999999;
   
    color:white; 
    margin-top:10px;
    }
    th{background-color:#515459;

   color:#fff;
  }
  .button3 {

  background-color: #666666;

  border: none;

  color: white;

  padding: 16px 32px;

  text-align: center;

  font-size: 16px;

  margin: 4px 2px;

  opacity: 0.6;

  transition: 0.3s;

  display: inline-block;

  text-decoration: none;

  cursor: pointer;
}

.button3:hover {opacity: 1}
    
  .button {

  background-color: #f4511e;

  border: none;

  color: white;

  padding: 8px 16px;

  text-align: center;

  font-size: 16px;

  margin: 4px 2px;

  opacity: 0.6;

  transition: 0.3s;

  display: inline-block;

  text-decoration: none;

  cursor: pointer;
  
  border-radius: 10px;
}

.button:hover {opacity: 1} 

    box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);

</style>
</head>
<body> 
<%
	if(session.getAttribute("userid")==null){
		response.sendRedirect("login.jsp");
	}
%>
    <form>
	<TABLE>
	
		<TR><TD>Müşteri Adı: </TD>	<TD><input type=text name=guestName /></TD></TR>
<TR><TD>Oda No: </TD>
	
	<TD><select name=roomNo>
		<%
		RoomDAO rrdao=new RoomDAO();
		try
		{
			List<Integer> rooms= rrdao.getAllRoomsNo();
			for(Integer rn:rooms){
		%>
          		<option value="<%=rn%>"><%=rn%></option>
		<%
     		}
		}catch(Exception e){    out.print(e);}
		%>
	</select></TD>
 		<TR><TD>Cinsiyet</TD>
 			<TD><select name=gender>
        	<option name=male value=Erkek> Erkek </option>
        	<option name=famale value=Kadın> Kadın </option>
        	<option name=other value=Diğer> Dİğer </option>
        	</select>
        	</TD>
        </TR>
		<TR><TD>Medeni Durum: </TD>
        	<TD><input type="radio" name=status value="Bekar"/>Bekar
        		<input type="radio" name=status value="Evli"/>Evli</TD>
        </TR>		
        <tr><td>Şehir: </TD>	<TD><input type=text name=city /></TD></TR>
		<tr><td>Ülke: </TD>	<TD><input type=text name=country /></TD></TR>
		<tr><td>Telefon: </TD>	<TD><input type=text name=phone /></TD></TR>
		<tr><td>Kaç Gece Kalacak: </TD>	<TD><input type=text name=nightsStay /></TD></TR>
		
        <tr>	<TD></TD><TD><input type=submit class="button" value=Ekle /></TD></TR>
	</TABLE>
    </form>
 <%
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
 %>
 <div style="margin-top: 0px; margin-left: 900px; border-color: #ffffff; border-style: solid; width: 200px;"><a href="RoomForm.jsp" class="button3" style="text-decoration:none;"><h2>Oda Durumu</h2></a></div>

</body>
</html>











