<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style><%@include file="/WEB-INF/views/mystyle.css"%></style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form method = "post" action="employeeAddress" enctype="multipart/form-data">
		<br>
		<br>


		<center>
			<h1>የሰራተኛ ፋይል መጫኛ</h1><br><br>
		</center>
		<table align="center">


		
			<tr>
				<th align="left"><strong>የፋይል ቁጥር:</strong></th>
				<td><input name="hid" type="text" value = "${empid}" size="40"></td>
			</tr>
			
			<tr>
				<th align="left"><strong>የፋይሉ ስም:</strong></th>
				<td><input name="name" type="text" size="40"></td>
			</tr>
		<tr>
				<th align="left"><strong>ፋይሉን ምረጥ:</strong></th>
				<td><input name="photo" type="file"  size="40"></td>
			</tr>
			
			<tr>
				
				<td><input type="submit" value="   ፋይሉን ጫን   "></td>
			


			</tr>
		</table>


	</form>

</body>
</html>