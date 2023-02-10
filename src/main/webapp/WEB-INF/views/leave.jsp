<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="webapp12.Worker"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Leave form</title>
</head>
<body>
<form method = "post" action="leave">

		<br>
		

		
		<br><br>
                

		<center>
			<h1>ሰራተኛን በማእረግ መፈለጊያ </h1>
		</center>
		<br>
		<table align="center">


		<tr>
				<th align="left">ማአረግ<strong>:</strong></th>
				<td> <select name="title">
				<option value="ዶክተር">ዶክተር</option>
				<option value="ነርሳ">ነርስ</option>
				<option value="አቶ">አቶ</option>
				<option value="ወሮ">ወሮ</option>
				<option value="ወሪት">ወሪት</option>
				
				</select></td>
			
				<th align="right"></th>
				<td>
				
				<input type="submit" value="        Search      ">
				</td>

              
			</tr>
			
		</table>

	</form>
		<div align="center">
        <table border="1" cellpadding="5">
            
            
            <tr>
            	<th>የፋይል ቁጥር</th>
            	 <th>ማእረግ</th>
                 <th>ስም</th>
                 <th>የአባት ስም</th>
              	 <th>የአያት ስም</th>
          		
          		  <th>የትውልድ ዘመን</th>
            
                
            </tr>
        
       <tr>
      
       <%
       List <Worker> pid_list = new ArrayList<Worker>();
  
%>     
  <c:forEach items="${piList}" var="item" >
                <tr>
               
                 <td> ${item.getId()} </td>
                  <td> ${item.getTitle()} </td>
                <td> ${item.getFirstName()} </td>
                <td> ${item.getSecondName()} </td>
                <td> ${item.getLastName()} </td>
                <td> ${item.getAge()} </td>
               
         		 
                </tr>
            </c:forEach>
       

        </table>
        
    </div>

</body>
</html>