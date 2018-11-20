<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<c:url value="/entrada" var="linkEntradaServlet" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:import url="script_estilos.jsp" />
<title>Cadastrar Novo Usu�rio</title>
</head>
<body>
	<c:import url="logout-parcial.jsp" />
	<br>
	<c:if test="${usuarioLogado.isAdm ==  'TRUE'}">
		<form action="${linkEntradaServlet}" method="post">
			Nome: <input type="text" name="nome" value="${usuario.nome}" /> <br>
			Sobrenome:<input type="text" name="sobrenome"
				value="${usuario.sobrenome}"> <br> Endere�o:<input
				type="text" name="endereco" value="${usuario.endereco}"> <br>
			Login:<input type="text" name="login" value="${usuario.login}">
			<br> Senha:<input type="text" name="senha"
				value="${usuario.senha}"> <br> Confirma Senha:<input
				type="text" name="confirmaSenha" value=""> <br> Perfil
			do Usu�rio: <br> <input type="radio" name="ehAdm" value="1">
			Administrador<br> <input type="radio" name="ehAdm" value="0">
			Cliente<br> <br> <br> Data Nascimento: <input
				type="text" name="data"
				value="<fmt:formatDate value="${usuario.dataNascimento}" pattern="dd/MM/yyyy"/>" />
			<br> <br> <input type="hidden" name="acao"
				value="NovoUsuario"> <input type="submit" />
		</form>
		<c:import url="menuLinks.jsp" />
	</c:if>

	<br>
	<c:import url="menuLinks.jsp" />

</body>
</html>