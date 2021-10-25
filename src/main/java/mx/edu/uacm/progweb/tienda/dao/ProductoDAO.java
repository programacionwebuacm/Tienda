package mx.edu.uacm.progweb.tienda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import mx.edu.uacm.progweb.tienda.conf.db.ConexionDB;
import mx.edu.uacm.progweb.tienda.dominio.Producto;

public class ProductoDAO {
	
	private Producto productoHallado;
	private int clav,cant;
	private String nom;
	private Double precio;
	private Connection conn = null;
	//Creacion de consultas mediante cadenas
	private Statement stm;
	//Creacion de consultas parametrizadas
	private PreparedStatement pstm;
	private ResultSet productoresSet;

	public boolean registrar(int clave, String nombre, Double precio, int cant) {
		
		System.out.println("> Entrando al metodo ProductoDAO.registrar <");
				
		int resultInsert = 0;
		
		try {
			conn = ConexionDB.obtenerConexion();
			stm = conn.createStatement();
			
			/*resultInsert = stm.executeUpdate("insert into producto values(" 
					+ clave + ", '" 
					+ nombre + "', " 
					+ precio + ", " 
					+ cant + ");");*/
			
			// --- Ejemplo de prepared stament ---
			
			String consulta = "insert into producto(clave, nombre, precio, cantidad) values(?, ?, ?, ?)";
			pstm = conn.prepareStatement(consulta);
			//binding (vinculación del valor y la posicion)
			pstm.setInt(1, clave);
			pstm.setString(2, nombre);
			pstm.setDouble(3, precio);
			pstm.setInt(4, cant);
			
			resultInsert = pstm.executeUpdate();
			
			
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
	
	public Producto consultar(int clave, String nombre) {
		
		System.out.println("> Entrando al metodo ProductoDAO.consultar <");
		
		
		try {
			conn = ConexionDB.obtenerConexion();
			stm  = conn.createStatement();
			
			productoresSet = stm.executeQuery("select * from producto where clave='" + clave +"' and nombre='" + nombre.trim() + "'");
			
			if(!productoresSet.next()) {
				System.out.println("No se encontro el registro");
				ConexionDB.cerrar();
				return null;
			} else {
				System.out.println("Se encontro el registro");
				clav = productoresSet.getInt("clave");
				nom = productoresSet.getString("nombre");
				precio = productoresSet.getDouble("precio");
				cant = productoresSet.getInt("cantidad");
				
				productoHallado = new Producto(clav, nom, precio, cant);
				
				ConexionDB.cerrar();
				return productoHallado;
				
			}
				
			
		} catch (SQLException e) {
			System.out.println("Error al consultar el producto en bd: " + e);
			return null;
		}

	}
	
}
