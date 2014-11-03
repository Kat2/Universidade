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
					<option value="Ciência da Computação">Ciência da Computação</option>
					<option value="Informática">Informática</option>
					<option value="Sistemas de Informação">Sistemas de Informação</option>
				</select>
			</td>
		</tr>
	</table>
	<input type="submit" value="Buscar">

	<%@ include file="rodape.jsp" %>

</form>
</body>
</html>