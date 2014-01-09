<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Novo Contato</title>
</head>
<body>
	<h1>Novo Contato</h1>
	<br/>
	<form action="controller">
		<input type="hidden" name="logic" value="NewContactLogic">	
		<label>Nome</label>
		<input type="text" name="nome"><br/>
		<label>Endereço</label>
		<input type="text" name="endereco"><br/>
		<label>Telefone</label>
		<input type="text" name="telefone"><br/>
		<label>E-mail</label>
		<input type="email" name="email"><br/>
		<label>Data de nasc.</label>
		<input type="date" name="dataNascimento"><br/>
		<input type="submit" value="Salvar">
	</form>
	<br/>
	<p><a href="controller?logic=ContactListLogic"><<< Voltar </a>
</body>
</html>