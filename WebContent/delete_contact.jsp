<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exclusão de Contato</title>
</head>
<body>
	<h1>Deseja realmente Excluir contato ?</h1>
	<h3>ID: <%= request.getParameter("id") %></h2>
	<h3>Nome: <%= request.getParameter("nome") %></h2>
	<a href="controller?logic=DeleteContactLogic&id=<%= request.getParameter("id") %>">Confirmar</a>
	<a href="controller?logic=ContactListLogic">Cancelar</a>
</body>
</html>