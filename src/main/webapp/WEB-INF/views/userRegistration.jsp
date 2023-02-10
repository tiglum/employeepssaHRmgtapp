<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style><%@include file="/WEB-INF/views/mystyle.css"%></style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form method = "post" action="UserRegistration">
<br><br>
<center> <h1>የተጠቃሚ መመዝገቢያ ፎርም</h1> </center>
<br><br>
<table align = "center">

<tr>
<th align = "right"><strong>  ስም:</strong></th>
 <td><input name="fname" type="text" size = "40"></td> 
</tr>
<tr>
<th align = "right"><strong> የአባት ስም:</strong></th>
 <td><input name="sname" type="text" size = "40"></td> 
</tr>
<tr>
<th align = "right"><strong>የመጠቀሚያ ስም:</strong></th>
 <td><input name="uname" type="text" size = "40"></td> 
</tr>
<tr>
<th align = "right" ><strong>የሚስጥር ቁጥር:</strong></th>

<td><input name="upass" type="password" size ="40"> </td>
</tr>
<tr>
<th align = "right"><strong>የተጠቃሚው አይነት:</strong></th>
  <td><select name="utype">
    <option value="admin">Admin</option>
    
<option value="user">User</option>
<option value="executive">Executive</option>

</select>

</td> 
</tr>
<tr>
<td colspan = "4" align = "right">
<input type="submit" value="ፍጠር"> </td>


</tr>
 







</table>

<center><h2> ${success}</h2></center>
<center><h2> ${failer}</h2></center>


</form>


</body>
</html>