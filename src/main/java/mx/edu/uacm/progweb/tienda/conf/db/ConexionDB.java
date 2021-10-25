package mx.edu.uacm.progweb.tienda.conf.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
	
	public static Connection con;
	public static String base_datos_nombre = "d9i2uvjudfm7e1";
	public static String usuario = "vxrndkgxiuzvhg";
	public static String passw = "b4ddce1fa0f99b1372467d43bff725fe65c1903ea5ffa77236ba56b7d9862945";
	public static String url = "jdbc:postgresql://ec2-52-70-107-254.compute-1.amazonaws.com:5432/" + base_datos_nombre;
	
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
