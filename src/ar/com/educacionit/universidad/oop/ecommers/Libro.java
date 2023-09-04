package ar.com.educacionit.universidad.oop.ecommers;

public class Libro extends Resultado {

	private String isbn;
	private String sinopsis;
	private int numeroPagias;
	
	public Libro(String titulo, String imagen, float precio) {
		super(titulo, imagen, precio);
	}

	public Libro(String titulo,
			String imagen,
			float precio,
			String autor,
			String isbm,
			String sinopsis,
			int numeroPaginas) {
		super(titulo, imagen, precio, autor);
		this.isbn = isbm;
		this.sinopsis = sinopsis;
		this.numeroPagias = numeroPaginas;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public int getNumerosPagias() {
		return numeroPagias;
	}
}
