<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ page import ="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style><%@include file="/WEB-INF/views/mystyle.css"%></style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table><tr>
<td align = "left"> <img src="${pageContext.request.contextPath}/resources/img/hararilogo.jpg" width ="320" height ="162"></td>
<td align = "center"><h1>የሀረሪ  ክልል  ጤና  ቢሮ የመዝገብ አያያዝ ዳታቤዝ  </h1><br>
<td align ="right"> <img src="${pageContext.request.contextPath}/resources/img/Harari_Flag.jpg" width ="320" height ="162">  </td>  
</tr></table>
 

<hr/>


<hr />
<br>

<div id ="container">
  <ul>
    <li><a href="employee" >ፋይል መመዝገቢያ</a></li>
 
    <li><a href="employeeEducation">ወጪ ፋይል</a></li>
    <li><a href="employeePro">ተመላሽ ፋይል</a></li>
    
      <li><a href="report">ሪፖርት</a></li>
      
       <li><a href="discontinue">በስም መፈለጊያ</a></li>
         <li><a href="searchStatus">በቁጥር መፈለጊያ</a></li>
   
  </ul>
</div>
</body>
</html>