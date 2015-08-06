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
<h2>liste des interventions</h2>
<table border="1">
<tr><th>date</th><th>memo</th><th>status</th><th>action</th></tr>
<s:iterator value="interventions">
<tr>
<td><s:property value="dateplanification"/></td>
<td><s:property value="memo"/></td>
<td><s:property value="statuts"/></td>
</tr>
</s:iterator>
</table>
</body>
</html>