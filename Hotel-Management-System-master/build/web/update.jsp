<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String id = request.getParameter("id");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/hotelmanagement";
String database = "hotelmanagement";
String userid = "root";
String password = "";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from room where id="+id;
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<!DOCTYPE html>
<html>
<body>
<h1>Update data from database in jsp</h1>
<form method="post" action="update-process.jsp">
<input type="hidden" name="roomNo" value="<%=resultSet.getString("roomNo") %>">
<input type="text" name="roomNo" value="<%=resultSet.getString("roomNo") %>">
<br>
First name:<br>
<input type="text" name="roomType" value="<%=resultSet.getString("roomType") %>">
<br>
Last name:<br>
<input type="text" name="bedType" value="<%=resultSet.getString("bedType") %>">
<br>
City name:<br>
<input type="text" name="tariff" value="<%=resultSet.getString("tariff") %>">
<br>
Email Id:<br>
<input type="email" name="status" value="<%=resultSet.getString("status") %>">
<br><br>
Email Id:<br>
<input type="text" name="guest" value="<%=resultSet.getString("guest") %>">
<br><br>
<input type="submit" value="submit">
</form>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</body>
</html>