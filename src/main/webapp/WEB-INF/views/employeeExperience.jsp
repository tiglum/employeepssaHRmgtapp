<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style><%@include file="/WEB-INF/views/mystyle.css"%></style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form method = "post" action="employeeExperience">
		<br>
		<br><br>
                

		<center>
			<h1>ወጪ</h1>
		</center>
		<br><br>
		<table align="center">


			<tr>
				<th align="left"><strong>የፋይል ቁጥር:</strong></th>
				<td><input name="id" type="text" size="40" value="${hhid}"></td>
			</tr>
			<tr>
			<tr>
				<th align="left"><strong>ወጪ የተደረገበት ቀን:</strong></th>
				<td><input name="dateout" type="text" size="40"></td>
			</tr>
			<tr>
			<tr>
				<th align="left"><strong>ወጪ የሚደረግለት ክፍል:</strong></th>
				<td><input name="whichoffice" type="text" size="40"></td>
			</tr>
			<tr>
			<tr>
				<th align="left"><strong>ምክንያት:</strong></th>
				<td><textarea  name = "raeson" rows= "4"  cols = "40">  </textarea></td>
			</tr>
			
		
			<tr>
				
				<td align="left"><input type="submit" value="   መዝግብ     ">
				</td>

				<td align="Right"><input type="Reset" value="   ተወው     ">
				</td>

			</tr>
			
		</table>


	</form>
</body>
</html>