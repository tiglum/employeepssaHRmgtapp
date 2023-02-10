<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import ="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style><%@include file="/WEB-INF/views/mystyle.css"%></style>
<title>Insert title here</title>
</head>
<body>
<table><tr>
<td align = "left"> <img src="${pageContext.request.contextPath}/resources/img/hararilogo.jpg" width =auto height ="162"></td>
<td align = "center"> <img src="${pageContext.request.contextPath}/resources/img/harari33.png" width =auto height ="162"></td>
<td align ="right"> <img src="${pageContext.request.contextPath}/resources/img/moh1.jpg" width =auto height ="162">  </td>  
</tr></table>


<hr />

<hr />
<center><h1> ሪፖርት</h1></center>
<br>
<table align= "center">
   <tr><td><a href="permanent"><h2>ለጡረታ የደረሱ ሰራተኞች</h2></a></td></tr>
    <tr><td><a href="leave"><h2>ሰራተኛን በማእረግ መፈለጊያ</h2></a></td></tr>
    
      <tr><td><a href="retired"><h2>ገቢ ወጪ ሪፖርት</h2></a></td></tr>
      <tr><td><a href="penalityPssa"><h2>ሠራተኛን በእድሜ መፈለጊያ</h2></a></td></tr>
      <tr><td><a href="promot"><h2>ሠራተኛን በስራ ልምድ መፈለጊያ</h2></a></td></tr>
    
</table>
</body>
</html>