<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<title>Resultado consulta</title>
	</head>
	<body>
	<%@page import="mx.edu.uacm.progweb.tienda.dominio.Producto, java.util.ArrayList" %>
		<h1>Resultado de la consulta</h1>
		<%
			Producto producto = (Producto)request.getAttribute("atributoProducto");
		%>
		
		<table>
				<tbody>
					<tr>
						<td>Clave:</td>
						<td><%=producto.getClave()%></td>
					</tr>
					<tr>
						<td>Nombre:</td>
						<td><%=producto.getNombre()%></td>
					</tr>
					<tr>
						<td>Precio:</td>
						<td><%=producto.getPrecio()%></td>
					</tr>
					<tr>
						<td>Cantidad:</td>
						<td><%=producto.getCantidad()%></td>
					</tr>
				</tbody>
			</table>
	</body>
</html>