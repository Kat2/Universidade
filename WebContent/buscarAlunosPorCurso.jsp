<html>
<head>
<title>Buscar Alunos Por Curso</title>
</head>
<body>
<form action="BuscarAlunosPorCursoServlet" method="get">
	<table>
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
	<input type="submit" value="Buscar">

	<%@ include file="rodape.jsp" %>

</form>
</body>
</html>