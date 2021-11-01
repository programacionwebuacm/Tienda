package mx.edu.uacm.progweb.tienda.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.edu.uacm.progweb.tienda.dominio.Producto;
import mx.edu.uacm.progweb.tienda.service.ProductoService;

@WebServlet(name = "consultarTodos", urlPatterns = {"/consultarTodos"})
public class ConsultasTodosController extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ProductoService productoService = new ProductoService();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("> Entrando a ConsultasTodosController.doGet <");
		
		List<Producto> productos = productoService.consultarProductosTodos();
		
		request.setAttribute("atributoProductos", productos);
		
		request.getRequestDispatcher("/WEB-INF/views/consultaProductos.jsp").forward(request, response);
		
	}

}
