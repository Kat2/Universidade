<html>
<head>
<title>Buscar Aluno Por Nome</title>
</head>
<body>
<form action="BuscarAlunosPorNomeServlet" method="get">
	<table>
		<tr>
			<td>Nome:</td>		
			<td><input type="text" name="nome"></td>
		</tr>
	</table>
	<input type="submit" value="Buscar">

	<%@ include file="rodape.jsp" %>

</form>
</body>
</html>