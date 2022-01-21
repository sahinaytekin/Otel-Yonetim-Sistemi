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
    table td{border: 1px solid white    ;}
    td {
    background-color:#999999;
    height: 10px;
    color:white; 
    padding:10px;
    }
    
th{background-color:#515459;

   color:#fff;
  }
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
}

.button2:hover {

    box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
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
    
</style>

</head>
<body> 
<%
	if(session.getAttribute("userid")==null){
		response.sendRedirect("login.jsp");
	}
%>


<%
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
%>


<%
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
%>
</body>
</html>