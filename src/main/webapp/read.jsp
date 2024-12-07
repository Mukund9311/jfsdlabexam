<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JFSD</title>
</head>
<body>
	<h2>Student details</h2>
	<%@ page import="java.util.*" %>
	<%@ page import="model.Client" %>
	
	<%
		@SuppressWarnings("unchecked")
			   List<Client> slist =(List<Client>) request.getAttribute("studentlist");
		%>
	<table border="1">
		<tr>
			<th>Student ID</th>
			<th>Student Name</th>
			<th>Department</th>			
		</tr>
	<%
	for(Client S : slist) {
	%>
		<tr>
			<td> <%= S.getSid() %> </td>
			<td> <%= S.getSname() %></td>
			<td> <%= S.getSdept() %></td>
		</tr>
	<% } %>
	</table>   
	
</body>
</html>