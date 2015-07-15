<%@page import="java.awt.Dimension"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="style/<%= request.getAttribute("style") %>" type="text/css" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>triangle</title>
</head>
<body>

<h2 id="titrePage">triangle de taille <%= request.getAttribute("dimension") %></h2>
<a href="index.html">retour au formulaire</a>
<table>
<% 
int t = (int)request.getAttribute("dimension");
for(int ligne = 0; ligne < t; ligne++) { %>
<tr>
	<% for(int colonne = 0; colonne < t - ligne; colonne++) { %>	
		<td class="cellule"><%= (ligne == 0 || colonne == 0 || colonne == t - ligne - 1)? '*' : ' ' %></td>
	<% } %>
</tr>
<% 
} %>
</table>


</body>
</html>