<%@ page contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1" %>

<html>
<head>
<title>Cadastrar Aluno</title>
</head>
<body>
<form action="CadastrarAlunoServlet" method="get">
	<table>
		<tr>
			<td>Matricula:</td>		
			<td><input type="text" name="matricula"></td>
		</tr>
		<tr>
			<td>Nome:</td>		
			<td><input type="text" name="nome"></td>
		</tr>
		<tr>
			<td>E-mail</td>
			<td><input type="text" name="email"></td>
		</tr>
		<tr>
			<td>Curso</td>
			<td>
				<select name="curso">
					<option value="Ciência da Computação">Ciência da Computação</option>
					<option value="Informática">Informática</option>
					<option value="Sistemas de Informação">Sistemas de Informação</option>
				</select>
			</td>
		</tr>
	</table>
	<input type="submit" value="Cadastrar">

	<%@ include file="rodape.jsp" %>

</form>
</body>
</html>

















