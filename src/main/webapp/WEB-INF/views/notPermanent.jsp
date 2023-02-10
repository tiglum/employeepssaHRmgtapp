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
<title>Insert title here</title>
</head>
<body>
<form method = "post" action="permanent">

	<center><h2>ለጡረታ የተቃረቡ ሠራተኞች</h2></center>

		
		<br>
		<table align="center">


			<tr>
			<th align="left"><strong>የዛሬ ቀን:</strong></th>
				<td><input name="cdate" type="text"  value = "yyyy-mm-dd" size="40"></td>
				<th align="right"></th>
				<td>
				
				<input type="submit" value="        Search      ">
				</td>

              
			</tr>
			
		</table>

	</form>
<center>
			
		</center>
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