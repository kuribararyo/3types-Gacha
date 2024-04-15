<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="entity.Character"%>
<%@page import="java.util.List" %>
<%@ page import="service.process"%>
<%@ page import="sample_main.sample"%>

<% List<Character> charaList = (List<Character>)request.getAttribute("gacha"); %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>webガチャ</title>
</head>
<body>
	<h1>ガチャ</h1>
	<p>結果<p>
	<% if(charaList != null) {%>
	<% for(int i = 0; i < charaList.size(); i++) {%>
	<tr>
		<td><%out.print(charaList.get(i).getId().toInt());%>
		<td><%charaList.get(i).getRerity().toString();%>
		<td><%charaList.get(i).getName().toString();%>
	<%} %>
	<%} %>
	
	</p>
</body>
</html>