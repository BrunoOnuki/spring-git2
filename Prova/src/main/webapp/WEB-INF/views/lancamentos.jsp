<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>
		Lista de Lan�amentos
	</h1>
	
	<th>
		<tr>
			<td>ID</td>
			<td>Data</td>
			<td>Descri��o</td>
			<td>Tipo</td>
		</tr>
		<c:forEach items="${lancamentos} var="lancamento">
			<tr>
				<td>${lancamento.id}</td>
				<td>${lancamento.data}</td>
				<td>${lancamento.descricao}</td>
				<td>${lancamento.tipo}</td>
			</tr>
		</c:forEach>
	</th>
	
</body>
</html>