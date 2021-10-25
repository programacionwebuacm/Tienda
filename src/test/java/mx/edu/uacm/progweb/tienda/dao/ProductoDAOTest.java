package mx.edu.uacm.progweb.tienda.dao;

import org.junit.jupiter.api.Test;

import mx.edu.uacm.progweb.tienda.dominio.Producto;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ProductoDAOTest {
	
	@Test
	public void debeRegistrarProducto() {
		System.out.println("> Entrando a debeRegistrarProducto <");
		ProductoDAO dao = new ProductoDAO();
		
		boolean estaInsertadoRegistro = dao.registrar(30, "Pesas", Double.valueOf("600"), 8);
		
		assertTrue(estaInsertadoRegistro);
		
	}
	
	@Test
	public void debeObtenerProducto() {
		System.out.println("> Entrando a debeObtenerProducto <");
		ProductoDAO dao = new ProductoDAO();
		
		Producto productoHallado = dao.consultar(25, "Tapetes Yoga");
		
		//asercion me permite verificar que efectivamente obtuvo el objeto
		assertNotNull(productoHallado);
		
	}
	
	@Test
	public void noDebeObtenerProducto() {
		System.out.println("> Entrando a noDebeObtenerProducto <");
		ProductoDAO dao = new ProductoDAO();
		
		Producto productoHallado = dao.consultar(-100, "Tapetes Yoga");
		
		//asercion me permite verificar que efectivamente no se obtuvo el producto, es decir es nulo
		assertNull(productoHallado);
		
	}

}
