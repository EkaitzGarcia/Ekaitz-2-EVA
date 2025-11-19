package models;

public class Producto {
	
	private String nombre;
	private double precio;
	private int stock;
	
	//Getters
	public String getNombre() {
		return nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public int getStock() {
		return stock;
	}
	
	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	//Constructor vacío
	public Producto() {
		
	}
	
	//Constructor lleno
	public Producto(String nombre, double precio, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Precio: " + precio + ", Stock: " + stock + ".";
	}
}
