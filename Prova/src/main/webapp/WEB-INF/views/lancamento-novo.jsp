<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	
	<h1> Inserir Lancamento </h1>
	<form:form modelAttibute="lancamentomv">
		<form:label path="lancamento.dataLancamento"> Data do Lançamento </form:label>
		<form:input path="lancamento.dataLancamento" type="date"/>  
		
		<form:label path="lancamento.descricao"> Descrição </form:label>
		<form:input path="lancamento.descricao"/>
		
		<form:label path="lancamento.valor"> Valor </form:label>
		<form:input path="lancamento.valor"/>
			
		<form:label path="lancamento.tipo"> Tipo </form:label>
		<form:select path="lancamento.tipo">
			<form:option value="Entrada"> Entrada </form:option>
			<form:option value="Saida"> Saida </form:option>
		</form:select>
		
		<input type="submit" value="salvar"/>
		
	</form:form>
</body>
</html>