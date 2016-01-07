<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="cloudBurners.BurnerController" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- 
Copyright 2016 the project authors as listed in the AUTHORS file.
All rights reserved. Use of this source code is governed by the
license that can be found in the LICENSE file.
-->

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cloud Burner Tenants</title>
</head>
<body>
<h1>
	Cloud Burner-Tenants Controller
</h1>
<table border="1" cellspacing="5" cellpadding="5">
<tr>
	<th>
		Burner
	</th>
	<th>
		Status
	</th>
	<th>
		Options
	</th>
	<th>
		Action
	</th>
</tr>
<tr style="background:<%= BurnerController.isUp(0)?"lightblue":"pink"%>">
	<td>
		CPU
	</td>
	<td>
		<%= BurnerController.isUp(0)?"ON":"OFF" %>
	</td>
	<td>
		<form action="updateOptions.jsp">
			<input type="hidden" name="burnerId" value="0"/>
			Threads: 
			<input type="number" name="nThreads" value="<%= BurnerController.burnerOptions[0].nThreads%>"/>
			</br>
			</br>
			<input type="submit" value="Update"/>
		</form>
	</td>
	<td>
		<form action="toggle.jsp">
			<input type="hidden" name="burnerId" value="0"/>
			<input type="submit" value="Toggle ON/OFF"/>
		</form>
	</td>
</tr>
<tr style="background:<%= BurnerController.isUp(1)?"lightblue":"pink"%>">
	<td>
		Cache
	</td>
	<td>
		<%= BurnerController.isUp(1)?"ON":"OFF" %>
	</td>
	<td>
	<form action="updateOptions.jsp">
			<input type="hidden" name="burnerId" value="1"/>
			Threads: 
			<input type="number" name="nThreads" value="<%= BurnerController.burnerOptions[1].nThreads%>"/>
			</br>
			Buffer Size:
			<input type="number" name="totalSize" value="<%= BurnerController.burnerOptions[1].totalSize%>"/>
			</br>
			Line Size:
			<input type="number" name="componentSize" value="<%= BurnerController.burnerOptions[1].componentSize%>"/>
			</br>
			</br>
			<input type="submit" value="Update"/>
		</form>
	</td>
	<td>
		<form action="toggle.jsp">
			<input type="hidden" name="burnerId" value="1"/>
			<input type="submit" value="Toggle ON/OFF"/>
		</form>
	</td>
</tr>
<tr style="background:<%= BurnerController.isUp(2)?"lightblue":"pink"%>">
	<td>
		Memory
	</td>
	<td>
		<%= BurnerController.isUp(2)?"ON":"OFF" %>
	</td>
	<td>
	<form action="updateOptions.jsp">
			<input type="hidden" name="burnerId" value="2"/>
			Threads: 
			<input type="number" name="nThreads" value="<%= BurnerController.burnerOptions[2].nThreads%>"/>
			</br>
			Buffer Size:
			<input type="number" name="totalSize" value="<%= BurnerController.burnerOptions[2].totalSize%>"/>
			</br>
			Page Size:
			<input type="number" name="componentSize" value="<%= BurnerController.burnerOptions[2].componentSize%>"/>
			</br>
			</br>
			<input type="submit" value="Update"/>
		</form>
	</td>
	<td>
		<form action="toggle.jsp">
			<input type="hidden" name="burnerId" value="2"/>
			<input type="submit" value="Toggle ON/OFF"/>
		</form>
	</td>
</tr>
<tr style="background:<%= BurnerController.isUp(3)?"lightblue":"pink"%>">
	<td>
		Disk
	</td>
	<td>
		<%= BurnerController.isUp(3)?"ON":"OFF" %>
	</td>
	<td>
		<form action="updateOptions.jsp">
			<input type="hidden" name="burnerId" value="3"/>
			Threads: 
			<input type="number" name="nThreads" value="<%= BurnerController.burnerOptions[3].nThreads%>"/>
			</br>
			</br>
			<input type="submit" value="Update"/>
		</form>
	</td>
	<td>
		<form action="toggle.jsp">
			<input type="hidden" name="burnerId" value="3"/>
			<input type="submit" value="Toggle ON/OFF"/>
		</form>
	</td>
</tr>
<tr style="background:<%= BurnerController.isUp(4)?"lightblue":"pink"%>">
	<td>
		Network
	</td>
	<td>
		<%= BurnerController.isUp(4)?"ON":"OFF" %>
	</td>
	<td>
	<form action="updateOptions.jsp">
			<input type="hidden" name="burnerId" value="4"/>
			Threads: 
			<input type="number" name="nThreads" value="<%= BurnerController.burnerOptions[4].nThreads%>"/>
			</br>
			Drain Name:
			<input type="text" name="url" value="<%= BurnerController.burnerOptions[4].url%>"/>
			</br>
			Drain Port:
			<input type="number" name="port" value="<%= BurnerController.burnerOptions[4].port%>"/>
			</br>
			Message Length:
			<input type="number" name="componentSize" value="<%= BurnerController.burnerOptions[4].componentSize%>"/>
			</br>
			</br>
			<input type="submit" value="Update"/>
		</form>
	</td>
	<td>
		<form action="toggle.jsp">
			<input type="hidden" name="burnerId" value="4"/>
			<input type="submit" value="Toggle ON/OFF"/>
		</form>
	</td>
</tr>
</table>
</body>
</html>