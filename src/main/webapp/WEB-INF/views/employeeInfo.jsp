 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
<style><%@include file="/WEB-INF/views/mystyle.css"%></style>
<style type="text/css">
@import "jquery.calendars.picker.css";
/* Or use these for a ThemeRoller theme
@import "themes16/southstreet/ui.all.css";
@import "ui-southstreet.datepick.css";
*/

</style>
<script type="text/javascript" src="jquery-1.4.2.js"></script>
<script type="text/javascript" src="jquery.calendars.js"></script>
<script type="text/javascript" src="jquery.calendars.plus.js"></script>
<script type="text/javascript" src="jquery.calendars.picker.js"></script>


<script type="text/javascript" src="jquery.calendars.ethiopian.js"></script>
<script type="text/javascript" src="jquery.calendars.ethiopian-am.js"></script>
<script type="text/javascript" src="jquery.calendars.picker-am.js"></script>
<script type="text/javascript">
$(function() {
//	$.calendars.picker.setDefaults({renderer: $.calendars.picker.themerollerRenderer}); // Requires jquery.calendars.picker.ext.js
var calendar = $.calendars.instance('ethiopian','am');
  $('.calendarspicker').calendarsPicker({
    calendar: $.calendars.instance('ethiopian', 'am'),
    disableInput: true
  });
	
	$('#popupDatepicker').calendarsPicker({calendar: calendar});
	$('#inlineDatepicker').calendarsPicker({calendar: calendar,onSelect: showDate});
});


</script>
   
</head>
<body>


	<form method = "post" action="employee">
		<br>
		 <div><jsp:include page="Inside.jsp" /></div>


		<center>
			<h1>ፋይል መመዝገቢያ ፎርም</h1><br><br><br>
		</center>
		<div class="WEB-INF">
		<table align="center">

			
			<tr>
				<th align="left"><strong>የፋይል ቁጥር:</strong></th>
				<td><input name="id" type="text" size="40"></td>
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
				<td><input name="dateOfBirth"  type= "text" size="40"   id="popupDatepicker"></td> 
				
             </tr>
             <tr>
			
				<th align="left"><strong>የቅጥር ዘመን:</strong></th>
				<td><input name="dateOfHiring"  type= "text" size="40" ></td> 
				
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
				
				<input type="submit" value="መዝግብ "></td>
				<td>
				
				<a href="employeeSearch">
				<input type="button" value=" ፈልግ   "  name= "employeeSearch"/></a>
				
				<a href="annual">
				<input type="button" value=" አድስ   "  name= "annual"/></a>
				</td>


			</tr>
		</table>
</div>
<center><h2>${emptyId}</h2>
<h2>${emptyFname}</h2>
<h2>${emptySname}</h2>
<h2>${emptyLname}</h2>
<h2>${emptyAge}</h2>

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