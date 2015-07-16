<%@page import="com.loncoto.webfirstjdbc.beans.Client"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="style/style.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>liste des clients</title>
</head>
<body>
<h3>Liste des clients</h3>
<table border="1">
<tr><th>noms</th><th>emails</th><th>soldes</th><th>actions</th></tr>
<%
	List<Client> clients = (List<Client>)request.getAttribute("clients");
	for (Client c : clients){ %>
	<tr>
	<td><%= c.getNom()%></td>
	<td><%= c.getEmail()%></td>
	<td><%= c.getSolde()%></td>
	<td>
	<form action="ClientServlet" method="post">
		<input type="hidden" name="id" value='<%= c.getId() %>' />
		<input type="hidden" name="action" value='editer' />
		<input type="submit" value="edition" />
	</form>
	<form action="ClientServlet" method="post">
		<input type="hidden" name="id" value='<%= c.getId() %>' />
		<input type="hidden" name="action" value='supprimer' />
		<input type="submit" value="suppression" />
	</form>
	</td>
	</tr>		
<% } %>
	<form action="ClientServlet" method="post">
		<input type="hidden" name="action" value='creer' />
		<input type="submit" value="ajout" />
	</form>

</table>
</body>
</html>