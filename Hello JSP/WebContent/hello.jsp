<%--Scriplet de Diretivas--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.Date"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Hello JSP</title>
</head>
<body>
	<h1>Hello JSP</h1>
	<%out.println("Felipe Galvão Canalli"); %>
	
	<%-- Scriplet de Expressão --%>
	<p>Data: <%=new Date()%></p>
	
	<%-- Scriplet de Declaração --%>
	<%!int contador=0; %>
	<p>Visitas: <%=contador++%></p>
</body>
</html>