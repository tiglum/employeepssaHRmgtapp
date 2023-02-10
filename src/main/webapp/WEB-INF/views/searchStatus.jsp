<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
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
<form method = "post" action="searchStatus">

		<br>
		

		
		<br><br>
                

		<center>
			<h1>Employee Job Status</h1>
		</center>
		<br>
		<table align="center">


			<tr>
				<th align="right"><strong>Employee ID:</strong></th>
				<td><input name="pid" type="text" size="40" value="${id}"></td>
			</tr>
			<tr>
				<th align="right"><strong>Starting Date:</strong></th>
				<td><input name="sdate" type="text"  value = "yyyy-mm-dd" size="40"></td>
			</tr>
			
			<tr>
				<th align="right"><strong>First Name:</strong></th>
				<td><input name="firstName" type="text" size="40" value="${fname}"></td>
			</tr>
			<tr>
				<th align="right"><strong>Second Name:</strong></th>
				<td><input name="secondName" type="text" size="40" value="${sname}"></td>
			</tr>
			
			<tr>
				<th align="right"></th>
				<td>
				
				<input type="submit" value="        Search      ">
				</td>

              
			</tr>
			
		</table>

	</form>
	<div align="center">
        <table border="1" cellpadding="5">
            <caption>List of Employee Leave</caption>
            
            <tr>
                <th>No</th>
                <th>Reason</th>
                <th>Starting Date</th>
                <th>Ending Date</th>
                <th>Number Of Days</th>
                <th>Authorized person</th>
            </tr>
        
       <tr> 
       <%
       List <Status> pid_list = new ArrayList<Status>();
  
%>     
  <c:forEach items="${piList}" var="item" >
                <tr>
                <td> ${item.getIdNumber()} </td>
                 <td> ${item.getReason()} </td>
                <td> ${item.getStartingDate()} </td>	
         		 <td> ${item.getEndingDate()} </td>
                 <td> ${item.getNumberDays()} </td>
                  <td> ${item.getWhoAllowed()} </td>
                </tr>
            </c:forEach>
       

        </table>
        
    </div>

</body>
</html>