package ar.com.educacionit.universidad.oop.polimorfismo;

public class Consola {

	private String serie;
	public String fabricante;
	protected String nombre;
	protected String color;
	protected String anioFabricacion;
	

	public Consola(String serie, String fabricante, String nombre, String color) {
		this.serie = serie;
		this.fabricante = fabricante;
		this.nombre = nombre;
		this.color = color;
	}
	
	public String getNumeroDeSerie() {
		return this.serie;
	}
	
	public String getFabricante() {
		return this.fabricante;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void play() {
		System.out.println("Jugando con la consola!");
	}
}
