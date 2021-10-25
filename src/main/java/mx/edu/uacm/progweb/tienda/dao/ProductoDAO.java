package mx.edu.uacm.progweb.tienda.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import mx.edu.uacm.progweb.tienda.conf.db.ConexionDB;

public class ProductoDAO {

	public boolean registrar(int clave, String nombre, Double precio, int cant) {
		
		Connection conn = null;
		Statement stm;
		
		
		int resultInsert = 0;
		
		try {
			conn = ConexionDB.obtenerConexion();
			stm = conn.createStatement();
			
			resultInsert = stm.executeUpdate("insert into producto values(" 
					+ clave + ", '" 
					+ nombre + "', " 
					+ precio + ", " 
					+ cant + ");");
			
			if(resultInsert != 0) {
				ConexionDB.cerrar();
				return true;
			} else {
				ConexionDB.cerrar();
				return false;
			}
				
			
		} catch (SQLException e) {
			System.out.println("Error al insertar producto en bd: " + e);
			
			return false;
		}
		
		
	}
}
