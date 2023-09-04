package ar.com.educacionit.universidad.oop.ecommers;

public class Resultado {
	private String titulo;
	private String imagen;
	private float precio;
	private String autor;
	
	
	public Resultado(String titulo, String imagen, float precio) {
		super();
		this.titulo = titulo;
		this.imagen = imagen;
		this.precio = precio;
	}
	public Resultado(String titulo, String imagen, float precio, String autor) {
		super();
		this.titulo = titulo;
		this.imagen = imagen;
		this.precio = precio;
		this.autor = autor;
	}

	public String obtenerImagen() {
		return this.imagen;
	}
	
	public void actualizarImagen(String nuevaImagen) {
		
		if(nuevaImagen == null) {
			this.imagen = "http:/sitio.com.ar/img.jpg";
		} else {
			this.imagen = nuevaImagen;
		}
	}

	public String obtenerTitulo() {
		return this.titulo;
	}
	
	public float obtenerPrecio() {
		return this.precio;
	}
	
	public void actulizarPrecio(float nuevoPrecio) {
		if( nuevoPrecio < 0) {
			this.precio = 0;
		} else {
			this.precio = nuevoPrecio;
		}
	}

	public String obtenerAutor() {
		return this.autor;
	}
	@Override
	public String toString() {
		return "Resultado [titulo=" + titulo + ", imagen=" + imagen + ", precio=" + precio + ", autor=" + autor + "]";
	}
	
	
}
