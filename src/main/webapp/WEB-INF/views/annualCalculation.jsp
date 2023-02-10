<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style><%@include file="/WEB-INF/views/mystyle.css"%></style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  method = "post" action="annual">
		<br>
		<br>
                

		<center>
			<h1>Employee number of annual leave day's Calculator </h1>
		</center>
		<br>
		
		<table align="center">
<tr>
				<th align="right"><strong>Employee ID:</strong></th>
				<td><input name="pid" type="text" size="40" value="${eid}"></td>
			</tr>
			
			<tr>
				<th align="right"><strong>Current Date:</strong></th>
				<td><input name="sdate" type="text" size="40" value="${sdate}" ></td>
			</tr>
				<tr>
				<th align="right"><strong>From When:</strong></th>
				<td><input name="stdate" type="text" size="40" value="${stadate}" ></td>
			</tr>
			
			<tr>
				<th align="right"><strong>First Name:</strong></th>
				<td><input name="firstName" type="text" size="40" value="${fname}"></td>
			</tr>
			<tr>
				<th align="right"><strong>Second Name:</strong></th>
				<td><input name="secondName" type="text" size="40" value="${mname}"></td>
			</tr>
			<tr>
				<th align="right"><strong>Number Of Days:</strong></th>
				<td><input name="secondName" type="text" size="40" value="${numd}"></td>
			</tr>
			
			<tr>
				<th align="right"></th>
				<td>
				
				<input type="submit" value="        Calculate     ">
				</td>

              
			</tr>
			
		</table>

	</form>

</body>
</html>