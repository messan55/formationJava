<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="inclusion.jspf" %>
<title>Test session</title>
</head>
<body>
<jsp:include page="Header.jsp" >
	<jsp:param value="bonjour Mr Gnemegna" name="message"/>
</jsp:include>

<h2>compteur de la session <%= session.getAttribute("compteur") %></h2>
<h2>identifiant de la session <%= session.getId() %></h2>
<form action="IndexServlet" method="post">
<input type="hidden" name="action" value="reinitialiser" />
<input type="submit" value="reinitialiser la session" />
</form>
</body>
</html>