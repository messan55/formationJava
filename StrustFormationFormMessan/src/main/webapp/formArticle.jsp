<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>edition article</title>
</head>
<body>
<h2>edition article</h2>
<s:form action="enregistrer" method="post">
	<s:textfield name="libelle" label="nom de l'articlee"></s:textfield>
	<s:textfield name="prix" label="prix de l'articlee" value="0.0"></s:textfield>
	<s:textfield name="poids" label="poids de l'articlee" value="0.0"></s:textfield>
	<s:submit value="sauver"/>
</s:form>
</body>
</html>