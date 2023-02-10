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
<form method = "post" action="employeeEducation">
		<br>
		<br><br>
                

		<center>
			<h1>ፋይል ወጪ ማድረጊያ ፎርም</h1>
		</center>
		<br><br>
		<table align="center">


			<tr>
				<th align="left"><strong>የፋይል ቁጥር:</strong></th>
				<td><input name="id" type="text" size="40" value="${hhid}"></td>
			</tr>
			
			<tr>
				<th align="left"><strong>ማእረግ:</strong></th>
				<td><input name="title" type="text" size="40" value="${title}"></td>
			</tr>
			
			<tr>
				<th align="left"><strong>የሰራተኛው ስም:</strong></th>
				<td><input name="fname" type="text" size="40" value="${fname}"></td>
			</tr>
			
			<tr>
				<th align="left"><strong>የአባት ስም:</strong></th>
				<td><input name="sname" type="text" size="40" value="${sname}"></td>
			</tr>
			
			<tr>
				<th align="left"><strong>የአያት ስም:</strong></th>
				<td><input name="lname" type="text"  size="40" value="${lname}"></td>
			</tr>
			
			
			
		
			<tr>
				
				<td><input type="submit" value=" ፈልግ  "></td>
				
               <td><a href="employeeExperience">
				<input type="button" value="ወጪ አድርግ"  name= "employeeExperience"/></a>
				
			     <a href="employeelist">
				<input type="button" value="ፋይል አውርድ"  name= "employeelist"/></a>
				</td>
				

			</tr>
			
		</table>


	</form>
</body>
</html>