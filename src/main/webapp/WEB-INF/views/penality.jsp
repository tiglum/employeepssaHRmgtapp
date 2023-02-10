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
<form method = "post" action="promot">

		<br>
		

		
		<br><br>
                

		<center>
			<h2>ሰራተኛን በስራ ልምድ መፈለገያ</h2>
		</center>
		<br>
		<table align="center">


			<tr>
				<th align="right"><strong>የዛሬ ቀን:</strong></th>
				<td><input name="cdate" type="text"   size="40"></td>
			</tr>
			<tr>
				<th align="right"><strong>ከ:</strong></th>
				<td><input name="fage" type="text"   size="40"></td>
			</tr>
			<tr>
				<th align="right"><strong>እስከ:</strong></th>
				<td><input name="sage" type="text"   size="40"></td>
			
				<td>
				
				<input type="submit" value="        ፈልግ      ">
				</td>

              
			</tr>
			
		</table>

	</form>
	<div align="center">
        <table border="1" cellpadding="5">
           
            <tr>
                <th>ፋይል ቁጥር</th>
                   <th>ማእረግ</th>
                <th>ስም</th>
                <th>የአባት ስም</th>
                <th>የአያት ስም</th>
               
                 <th>የትውልድ ዘመን</th>
                  <th>እድሜ</th>
                <th>የቅጥር ዘመን</th>
                 <th>የስራ ልምድ</th>
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
                <td>${item. getLastName()}	</td>
         		 <td> ${item.getBirth()} </td>
                 <td> ${item.getAge()} </td>
                   <td> ${item.getHiringDate()} </td>
                   <td> ${item.getExperience()} </td>
                 
                </tr>
            </c:forEach>
       

        </table>
        
    </div>

</body>
</html>