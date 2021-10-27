package mx.edu.uacm.progweb.tienda.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.edu.uacm.progweb.tienda.dominio.Producto;
import mx.edu.uacm.progweb.tienda.service.ProductoService;

@WebServlet(name = "consultar", urlPatterns = {"/consultar"})
public class ConsultaController extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ProductoService productoService = new ProductoService();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("> Entrando a ConsultaController.doGet <");
		
		int clave = Integer.parseInt(request.getParameter("clave"));
		String nombre = request.getParameter("nombre");
		
		Producto producto = productoService.consultarProducto(clave, nombre);
		
		request.setAttribute("atributoProducto", producto);
		
		request.getRequestDispatcher("/WEB-INF/views/resultadoConsulta.jsp").forward(request, response);
		
	}

}
