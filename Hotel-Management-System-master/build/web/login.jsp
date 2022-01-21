<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Login page</title>
	<link rel="stylesheet" type="text/css" href="css/style.css"></link>
	<link rel="stylesheet" type="text/css" href="css/font-awesome.css"></link>
</head>
<body >

	<div class="container">
		<img src="images/men1.png">
		<form method=get action=LoginServlet>
			<div class="form-input">
				<input type="text" name="uid" placeholder="Kullanıcı Adı">
			</div>
			<div class="form-input">
				<input type="password" name="pwd" placeholder="Şifre">
			</div>
			<input class="button" type="submit" name="submit" value="GİRİŞ"><br/>
			
		</form>
	</div>
	
</body>
</html>