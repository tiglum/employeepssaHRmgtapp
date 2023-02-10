<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="webapp12.Status"%>
  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<style><%@include file="/WEB-INF/views/mystyle.css"%></style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
<form method = "post" action="employeeSearch" accept-charset="UTF-8">

		<br>
		

		
		<br><br>
                

		<center>
			<h1>ፋይል መፈለጊያ ፎርም</h1>
		</center>
		<br>
		<table align="center">


			<tr>
				<th align="left"><strong>ፋይል ቁጥር:</strong></th>
				<td><input name="pid" type="text" size="40" value="${empid}" ></td>
			</tr>
			<tr>
				<th align="left"><strong>ማእረግ:</strong></th>
				<td><input name="title" type="text" size="40" value="${title}"></td>
			</tr>
		<tr>
				<th align="left"><strong>የሰራተኛ ስም:</strong></th>
				<td><input name="fname" type="text" size="40" value="${fname}"></td>
			</tr>
			<tr>
			
				<th align="left"><strong>የአባት ስመ:</strong></th>
				<td><input name="sname" type="text" size="40" value= "${sname}"></td>
			</tr>
			<tr>
				<th align="left"><strong>የአያት ስም:</strong></th>
				<td><input name="lname" type="text" size="40" value="${lname}"></td>
			</tr>
			
			
			<tr>
			
				<th align="left"><strong>ቀን:</strong></th>
				<td><input name="currentDate" type="text" size="40" value="${curdate}"></td>
				</tr>
			<tr>
			
				<th align="left"><strong>እድሜ:</strong></th>
				<td><input name="age" type="text" size="40" value="${age}"></td>
				</tr>
				
				
				<tr></tr>
				<tr>
				<th align="right"></th>
				<td>
				
				<input type="submit" value="       ፈልግ      ">
				<a href="employeeAddress">
				<input type="button" value="    ፋይል ጫን "  name= "employeeAddress"/></a>
				</td>

              
			</tr>
			
		</table>

	</form>
	
</body>
</html>