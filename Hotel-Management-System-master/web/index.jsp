<%@ page language="java" contentType="text/html; utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="css/style.css"></link>
<title>Insert title here</title>
<style>
.button- {

  background-color: #f4511e;

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

  opacity: 0.7;

  transition: 0.3s;

  display: inline-block;

  text-decoration: none;

  cursor: pointer;
}

.button3:hover {opacity: 0.8}
    
</style>
</head>
<body> 
<%
	if(session.getAttribute("userid")==null){
		response.sendRedirect("login.jsp");
	}
%>


<center><div style="width: 200px; height: 50px;"><h2>Hoşgeldin<h2> <FONT COLOR=black> ${userid }</FONT> <br> 
            </center>
   <div class=menu>
       <center><div style="margin-top: 150px; border-color: #ffffff; border-style: solid; width: 200px;" ><a href="RoomForm.jsp" class="button3" style="text-decoration:none;"><h2>Oda Durumu</h2></a></div> </center>
   	<center><div style="margin-top: 10px; border-color: #ffffff; border-style: solid; width: 200px;"><a href="GuestForm.jsp" class="button3" style="text-decoration:none;"><h2>Müşteri Ekle</h2></a></div> </center>
   
        <center> <div style="margin-top: 10px;"><form action="LogoutServlet">
   		<input type="submit" class ="button" value="Çıkış"> 
                </form> </div> </center>
</body>
</html>