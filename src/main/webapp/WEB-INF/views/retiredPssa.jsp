<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="webapp12.Status"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method = "post" action="retired">

		<br>
		

		
		<br><br>
                

		<center>
			<h2>ገቢ ወጪ ሪፖርት</h2>
		</center>
		<br>
		<table align="center">


			
			<tr>
				<th align="right"><strong>የሰራተኛው የፋይል ቁጥር:</strong></th>
				<td><input name="hhid" type="text"   size="40"></td>
		
		
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
                <th>የወጣበት ቀን</th>
                <th>ወጪ የተደረገለት</th>
              <th>ወጪ የተደረገበት ምክንያት</th>
                <th>የተመለሰበት ቀን</th>
                   <th>የተመለሰበት ክፍል</th>
               
            </tr>
        
       <tr> 
       <%
       List <Status> pid_list = new ArrayList<Status>();
  
%>     
  <c:forEach items="${piList}" var="item" >
                <tr>
                <td> ${item.getIdNumber()} </td>
                 <td> ${item.getStartingDate()} </td>
                <td> ${item.gettowhom()} </td>	
         		   <td> ${item.getReason()} </td>	 
                 <td> ${item.getEndingDate()} </td>
                 <td> ${item.getfromWhom()} </td>	
                 
                </tr>
            </c:forEach>
       

        </table>
        
    </div>

</body>
</html>