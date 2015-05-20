<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="datos.Usuario"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Usuario.jsp</title>
</head>
<body>
	
	<% Usuario usuario=(Usuario)request.getAttribute("usuario"); %>
	<BR>
	Apellido: <%= usuario.getApellido() %><BR>
	Nombre : <%= usuario.getNombre() %><BR>
	DNI : <%= usuario.getDni() %><BR>
	NOMBRE DE USUARIO : <%= usuario.getNombreDeUsuario() %><BR>
	<BR>
	<A href="/HotelSolutionsServlet/index.html">Volver...</A>

</body>
</html>