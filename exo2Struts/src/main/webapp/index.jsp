<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>hello</title>
</head>
<body>
<h2><s:property value="message" /> </h2>

<s:form action="Hello" method="post" >
	<s:textfield name="nom" label="votre nom" />
	<s:textfield name="motdepasse" label="votre mot de passe" />
	<s:submit />
</s:form>

</body>
</html>