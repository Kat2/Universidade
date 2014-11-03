<%@ page contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1" %>
<%@ page import="java.util.*, bean.Aluno" %>
<html>
<head>
<title>Lista de Alunos</title>
</head>
<body>

<%@ include file="cabecalho.jsp" %>

<table border='1'>
	<tr>
		<th>Matricula</th>
		<th>Nome</th>
		<th>Email</th>
		<th>Curso</th>
	<tr>
	<%
		// Busca o atributo lista de alunos no request
		List<Aluno> alunos = (List) request.getAttribute("alunos");
	
		if(alunos != null) {
			// Percorre a lista de alunos criando as linhas da tabela
			for (Iterator iterator = alunos.iterator(); iterator.hasNext();) {
				Aluno aluno = (Aluno) iterator.next();
	%>
			<tr>
				<td><%= aluno.getMatricula() %></td>
				<td><%= aluno.getNome() %></td>
				<td><%= aluno.getEmail() %></td>
				<td><%= aluno.getCurso() %></td>
			</tr>
	  		<%}%>
	  <%}%>
</table>

<%@ include file="rodape.jsp" %>

</body>
</html>












