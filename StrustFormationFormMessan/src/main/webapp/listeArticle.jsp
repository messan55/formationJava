<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>liste des Articles</title>
</head>
<body>
<table>
<tr><th>libelle</th><th>prix</th><th>poids</th></tr>
<s:iterator value="articles">
<tr>
<td><s:property value="libelle"/></td>
<td><s:property value="prix"/></td>
<td><s:property value="poids"/></td>
</tr>
</s:iterator>
</table>
</body>
</html>