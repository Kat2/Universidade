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
					<option value="Ci�ncia da Computa��o">Ci�ncia da Computa��o</option>
					<option value="Inform�tica">Inform�tica</option>
					<option value="Sistemas de Informa��o">Sistemas de Informa��o</option>
				</select>
			</td>
		</tr>
	</table>
	<input type="submit" value="Cadastrar">

	<%@ include file="rodape.jsp" %>

</form>
</body>
</html>

















