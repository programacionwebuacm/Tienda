package mx.edu.uacm.progweb.tienda.dao;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductoDAOTest {
	
	@Test
	public void debeRegistrarProducto() {
		System.out.println("> Entrando a debeRegistrarProducto <");
		ProductoDAO dao = new ProductoDAO();
		
		boolean estaInsertadoRegistro = dao.registrar(60, "Spikes", Double.valueOf("800"), 10);
		
		assertTrue(estaInsertadoRegistro);
		
	}

}
