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
<meta charset="UTF-8">
<link href="gachadesign.css" rel="stylesheet">
<title>webガチャ</title>
</head>
<body>
	<div class="bird"></div>
	<div class="bird -type_2"></div>
	<div class="bird -type_3"></div>
	<div class="font_blue">
		<h1>ガチャ</h1>
	</div>
	<p>ガチャ</p>
	 <table border="2" style="border-collapse: collapse; border-color: blue">
	 	<tr>
	 	<div class="font_blue">
	 		 <th>ID</th>
	 		 <th>レアリティ</th>
	 		 <th>なまえ</th>
	 	</div>
	 	</tr>
	<form action="/gachaweb/sample" method="post">
	<% if(charaList != null) {%>
		<% for(int i = 0; i < charaList.size(); i++) {%>
		<tr>
			<td><%out.print(charaList.get(i).getId().toInt());%>
			<td><%out.print(charaList.get(i).getRerity().toString());%>
			<td><%out.print(charaList.get(i).getName().toString());%><br>
		<%} %>
	<%} %>
	
	</table>
	<button type= 'submit'name= "num" value= "1">1回</button>
	<button type= "submit"name= "num"value= "10">10回</button><br>
	</form>
</body>
</html>