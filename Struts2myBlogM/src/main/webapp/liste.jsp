<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>liste des posts</title>
</head>
<body>
<h2>liste des posts</h2>
<table border="2">
<tr><th>titres</th><th>corps</th><th>dates</th><th>actions</th></tr>
<s:iterator value="posts">
<tr>
<td><s:property value="titre"/></td>
<td><s:property value="corps"/></td>
<td><s:property value="dateCreation"/></td>
<td><s:a href="edit/%{id}" >editer</s:a></td>
</tr>
</s:iterator>
</table>
</body>
</html>
