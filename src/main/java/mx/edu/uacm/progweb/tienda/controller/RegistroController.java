package mx.edu.uacm.progweb.tienda.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.edu.uacm.progweb.tienda.service.ProductoService;

@WebServlet(name = "registro", urlPatterns = { "/registrar" })
public class RegistroController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ProductoService productoService = new ProductoService();

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("> Entrando a doPost de RegistroController <");

		int clave = Integer.parseInt(request.getParameter("clave"));
		String nombre = request.getParameter("nombre");
		Double precio = Double.parseDouble(request.getParameter("precio"));
		int cant = Integer.parseInt(request.getParameter("cant"));
		
		boolean esExitoso = productoService.registrarProducto(clave, nombre, precio, cant);
		if(esExitoso) {
			
			request.getRequestDispatcher("/WEB-INF/views/registroGuardado.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("/WEB-INF/views/errorEnRegistro.jsp").forward(request, response);
		}
		
		
	}

}
