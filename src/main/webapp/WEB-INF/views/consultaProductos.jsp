<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Consulta de productos</title>
	</head>
	<body>
		<%@page import="mx.edu.uacm.progweb.tienda.dominio.Producto, java.util.List" %>
		<h1>Resultado de la consulta de productos totales</h1>
		<%
			List<Producto> productos = (List<Producto>)request.getAttribute("atributoProductos");
		%>
		
		<table>
				<thead>
					<tr>
						<th>Clave</th>
						<th>Nombre</th>
						<th>Precio</th>
						<th>Cantidad</th>
					</tr>
				</thead>
				<tbody>
					<%
					  for (Producto producto: productos) {
					%>
					<tr>
						<td><%=producto.getClave() %></td>
						<td><%=producto.getNombre() %></td>
						<td><%=producto.getPrecio() %></td>
						<td><%=producto.getCantidad() %></td>
					</tr>
					<% } %>
				</tbody>
			</table>
	</body>
</html>