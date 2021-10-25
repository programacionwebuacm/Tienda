package mx.edu.uacm.progweb.tienda.conf.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
	
	public static Connection con;
	public static String base_datos_nombre = "";
	public static String usuario = "";
	public static String passw = "";
	public static String url = "" + base_datos_nombre;
	
	//More Unit
	//Ctrl + J
	public static Connection obtenerConexion() {
		
		//me sirve para cargar el driver para la conexion de la bd
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url, usuario, passw);
			
		} catch (ClassNotFoundException e) {
			System.out.println("No se encontro la clase");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Excepcion de SQL");
			e.printStackTrace();
		}
		
		
		return con;
	}
	
	public static void cerrar() {
		
			try {
				if(con != null)
					con.close();
			} catch (SQLException e) {
				System.out.println("Error: No se logro cerrar la conexion: " + e);
				
			}
		
	}
	
}
