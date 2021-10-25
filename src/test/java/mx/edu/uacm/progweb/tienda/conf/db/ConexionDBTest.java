package mx.edu.uacm.progweb.tienda.conf.db;

import java.sql.Connection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConexionDBTest {
	
	@Test
	public void debeObtenerConexionDB() {
		System.out.println("> Entrando al metodo debeObtenerConexionDB <");
		Connection con = ConexionDB.obtenerConexion();
		
		//aserciones, son confirmaciones, aseveraciones
		
		//afirma que el objeto conexion no es nulo
		//More Unit 
		//Ctrl + r
		assertNotNull(con);
	}

}
