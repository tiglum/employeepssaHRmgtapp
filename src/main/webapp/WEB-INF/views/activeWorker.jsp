<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="webapp12.Worker"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style><%@include file="/WEB-INF/views/mystyle.css"%></style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
</head>
<body>
<center>
			<h1>ገቢ</h1>
		</center>
	
<form method = "post" action="active">

	

		
		<br>
		<table align="center">



	<tr>
				<th align="left"><strong>የፋይል ቁጥር:</strong></th>
				<td><input name="id" type="text" size="40" value="${hhid}"></td>
			</tr>
			<tr>
			<tr>
				<th align="left"><strong>ገቢ የተደረገበት ቀን:</strong></th>
				<td><input name="datein" type="text" size="40"></td>
			</tr>
			<tr>
			<tr>
				<th align="left"><strong>የመጣበት ክፍል:</strong></th>
				<td><input name="whichoffice" type="text" size="40"></td>
			</tr>






			<tr>
			<td>
				
				<input type="submit" value="        አስገባ     ">
				</td>

             
			
		</table>

	</form>
</body>
</html>