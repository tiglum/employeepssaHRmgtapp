<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
<style><%@include file="/WEB-INF/views/mystyle.css"%></style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 

    <link type="text/css" href="/WEB-INF/style/main.css" rel="stylesheet" />

<link type="text/css" href="/WEB-INF/style/ui.calendars.picker.css" />

 <script src="https://jquery.calendars.ethiopian.min.js"></script>
<script src="https://jquery.calendars.min.js"></script>

<script src="https://jquery.calendars.ethiopian.js"></script>
<script src="https://jquery.calendars.js"></script>
<script src="https://jquery-1.4.2.js"></script>
 
 <script>
 
 $(function(){ $("#calendarspicker").calendarsPicker({ calendar: $.calendars.instance('ethiopian', 'am') }); });
  </script>


</head>
<body>


	<form method = "post" action="annual">
		<br>
		 <div><jsp:include page="Inside.jsp" /></div>


		<center>
			<h1>ፋይል ማደሻ ፎርም</h1><br><br><br>
		</center>
		<div class="WEB-INF">
		<table align="center">

			
			<tr>
				<th align="left"><strong>የፋይል ቁጥር:</strong></th>
				<td><input name="pid" type="text" size="40"></td>
		</tr>
		<tr>
				<th align="left"><strong>የስራተኛው ስም:</strong></th>
				<td><input name="fname" type="text" size="40"></td>
			</tr>
			<tr>
			
				<th align="left"><strong>የአባት ስም:</strong></th>
				<td><input name="sname" type="text" size="40"></td>
			</tr>
			<tr>
				<th align="left"><strong>የአያት ስም:</strong></th>
				<td><input name="lname" type="text" size="40"></td>
			</tr>
			
			<tr>
			
				<th align="left"><strong>የልደት ቀን:</strong></th>
				<td><input name="dateOfBirth"  type= "text" size="40"  ></td> 
				
             </tr>
             <tr>
			
				<th align="left"><strong>የቅጥር ዘመን:</strong></th>
				<td><input name="dateOfHiring"  type= "text" size="40"  ></td> 
				
             </tr>
 
			<tr>
				<th align="left">ማአረግ<strong>:</strong></th>
				<td> <select name="jobTitle">
				<option value="ዶክተር">ዶክተር</option>
				<option value="ነርሳ">ነርስ</option>
				<option value="አቶ">አቶ</option>
				<option value="ወሮ">ወሮ</option>
				<option value="ወሪት">ወሪት</option>
				
				</select>
	            </td>
			</tr>
			
			
				<tr></tr>
				<tr>
				
				<td align = "center">
				
				<input type="submit" value="አድስ "></td>
				

			</tr>
		</table>
</div>
<center><h2>${emptyId}</h2>
<h2>${emptyFname}</h2>
<h2>${emptySname}</h2>
<h2>${emptyLname}</h2>
<h2>${emptyAge}</h2>
<h2>${emptySex}</h2>
<h2>${emptyBirth}</h2>
<h2>${emptyJobType}</h2>
<h2>${emptyJobLevel}</h2>
<h2>${emptyHiringType}</h2>
<h2>${emptyGroup}</h2>
<h2>${emptyIntialS}</h2>
<h2>${emptyHiringDate}</h2></center>
	</form>



</body>
</html>