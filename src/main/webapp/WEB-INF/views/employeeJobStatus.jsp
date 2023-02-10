<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style><%@include file="/WEB-INF/views/mystyle.css"%></style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


</head>
<body>

<form  method = "post" action="employeeStatus">
		<br>
		<br>
                

		<center>
			<h1>Employee Job Status</h1>
		</center>
		<br>
		<div>
		<table align="center">


			<tr>
				<th align="right"><strong>Employee ID:</strong></th>
				<td><input name="id" type="text" size="40" ></td>
			</tr>
			
			<tr>
				<th align="right"><strong>Reason:</strong></th>
				<td><select name="reason" id = "reason"  onChange="employeStatus();">
   				 <option value="annual">Annual Leave</option>
				<option value="sick">Sick Leave</option>
				<option value="birth">Birth Leave</option>
				<option value="exam">Exam Leave</option>
    
				<option value="marriage">Marriage Leave</option>
				<option value="death">Death Leave</option>
				<option value="absent">Absent</option>
				<option value="accidental">Accidental Leave  </option>
				<option value="transfer">Transfer </option>
				<option value="penality">Penalty </option>
				<option value="retired">Retired</option>
    
				<option value="job Discontinuity">Job Discontinuity</option>
				

				</select>
			</tr>
			<tr>
			<tr>
				<th align="right"><strong>Starting Date:</strong></th>
				<td><input name="startingDate" type="text"  value = "yyyy-mm-dd" size="40"></td>
			</tr>
			<tr>
			<tr>
				<th align="right"><strong>Ending Date:</strong></th>
				<td><input name="endingDate" type="text"  value = "yyyy-mm-dd" size="40"></td>
			</tr>
			<tr>
				<th align="right"><strong>Number of Days:</strong></th>
				<td><input name="numberOfDays" type="text" size="40" Id = "nd" value = "${numd}"></td>
			</tr>
			
			<tr>
				<th align="right"><strong>The person who allowed:</strong></th>
				<td><input name="whoAllowed" type="text" size="40"></td>
			</tr>
			
			<tr>
				<th align="right"></th>
				<td>
				
				<input type="submit" value=" Submit     ">
				<a href="searchStatus">
				<input type="button" value="Serach Status"  name= "searchStatus"/></a>
				<a href="annual">
				<input type="button" value="Calculate Annual Leave"  name= "annual"/></a>
				</td>

              
			</tr>
			
		</table>
</div>

	</form>

	

			
	
	

</body>
</html>