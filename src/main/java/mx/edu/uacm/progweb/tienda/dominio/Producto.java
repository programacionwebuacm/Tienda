package mx.edu.uacm.progweb.tienda.dominio;

public class Producto {
	
	private int clave;
	private String nombre;
	private Double precio;
	private int cantidad;
	
	public Producto() {
		
	}
	
	public Producto(int clave, String nombre, Double precio, int cantidad) {
		super();
		this.clave = clave;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	public int getClave() {
		return clave;
	}
	public void setClave(int clave) {
		
		this.clave = clave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		//TODO logica para aumentar el precio en un 10%
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Producto [clave=" + clave + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad
				+ "]";
	}
	
	

}
