<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="br.com.tdv.model.Contact"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<%
		List<Contact> list = (List<Contact>) request.getAttribute("list");
		if (list.size() > 0) {
			for (Contact c : list) {
	%>
				<tr>
					<td><%= c.getId() %></td>
					<td><%= c.getNome() %></td>
					<td><%= c.getEndereco() %></td>
					<td><%= c.getTelefone() %></td>
					<td><%= c.getDataNascimento().getTime() %></td>
					<td><%= c.getEmail() %></td>
					<td><a href="controller?logic=AlterContactLogic&id=<%= c.getId() %>">Alterar</a></td>
					<td><a href="delete_contact.jsp?id=<%= c.getId() %>&nome=<%= c.getNome() %>">Excluir</a></td>
				</tr>	
	<%
			}
		} else {
	%>
			<tr>
				<td colspan="6">Lista de contatos está vazia!</td>
			</tr>	
	<%			
		}
	%>
	</table>
</body>
</html>