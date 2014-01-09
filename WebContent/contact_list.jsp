<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="br.com.tdv.model.Contact"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>   
<jsp:useBean id="contact" class="br.com.tdv.model.Contact"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Contatos</title>
</head>
<body>

	<h1>Lista de Contatos</h1>
	
	<p style="color: red;"><%= request.getParameter("message") == null ? "" : request.getParameter("message") %>
	
	<br/>
	<p><a href="new_contact.jsp">Cadastrar novo</a></p>
	
	<c:forEach items="${list}" var="c">
		${c.nome }
	</c:forEach>
 
	<table border="1">
		<tr>
			<td>ID</td>
			<td>Nome</td>
			<td>Endereco</td>
			<td>Telefone</td>
			<td>Data de Nasc.</td>
			<td>E-mail</td>
			<td></td>
			<td></td>
		</tr>
		<c:forEach items="${list}" var="c">
			<tr>
				<td>${c.id}</td>
				<td>${c.nome}</td>
				<td>${c.endereco}</td>
				<td>${c.telefone}</td>
				<td>${c.dataNascimento.time}</td>
				<td>${c.email}</td>
				<td><a href="controller?logic=AlterContactLogic&id=${c.id}&getOrSet=get">Alterar</a></td>
				<td><a href="delete_contact.jsp?id=${c.id}&nome=${c.nome}">Excluir</a></td>
			</tr>			
		</c:forEach>
	</table>
</body>
</html>