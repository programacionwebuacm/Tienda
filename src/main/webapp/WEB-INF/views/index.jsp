<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Inicio</title>
</head>
<body>
	<div id="contenedor">

		<form name="formulario1" id="formulario1" method="post"
			action="/registrar">
			<h1>Hola! Proporciona los datos del producto</h1>

			<table>
				<tbody>
					<tr>
						<td>Clave:</td>
						<td><input type="text" name="clave" /></td>
					</tr>
					<tr>
						<td>Nombre:</td>
						<td><input type="text" name="nombre" /></td>
					</tr>
					<tr>
						<td>Precio:</td>
						<td><input type="text" name="precio" /></td>
					</tr>
					<tr>
						<td>Cantidad:</td>
						<td><input type="text" name="cant" /></td>
					</tr>
				</tbody>
			</table>
			<input type="submit" value="Registrar">

		</form>
		<form name="formulario2" id="formulario2" action="/consultarTodos" method="get">
			<input type="submit" value="consultarTodos" />
		</form>
	</div>


</body>
</html>