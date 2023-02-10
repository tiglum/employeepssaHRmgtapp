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
<form method = "post" action="employeelist">
<table align="center">


<tr>
				<th align="left"><strong>የፋይል ቁጥር:</strong></th>
				<td><input name="id" type="text" size="40"></td>
				<th align="right"></th>
				<td>
				
				<input type="submit" value="        Search      ">
				</td>

              
			</tr>
		</table>
		
	</form>
	<div align="center">
        <table border="1" cellpadding="5">
            <caption>ፋይል ማውረጃ ቅፅ </caption>
            
            <tr>
               
                 <th>የፋይል ቁጥር</th>
                <th>የፋይሉ ስም</th>
                <th>ፋይሉ</th>
              
            </tr>
        
       <tr> 
       <%
       List <Worker> pid_list = new ArrayList<Worker>();
  
%>     
  <c:forEach items="${piList}" var="item" >
                <tr>
                <td> ${item.getId()} </td>
                 <td> ${item.getfileName()} </td>
                <td> ${item.getfile()} </td>	
         		
                </tr>
            </c:forEach>
       

        </table>
        
    </div>

</body>
</html>