package ar.com.educacionit.universidad.oop.ecommers;

import java.util.Arrays;

public class Musica extends Resultado {

	private String selloDiscografico;
	private String[] lista;
	
	public Musica(String titulo, String imagen, float precio,String autor, String selloDiscografico, String[] lista) {
		super(titulo, imagen, precio);
		this.selloDiscografico = selloDiscografico;
		this.lista = lista;
	}


	public String getSelloDiscografico() {
		return selloDiscografico;
	}

	public String[] getLista() {
		return lista;
	}

	@Override
	public String toString() {
		return "Musica [selloDiscografico=" + selloDiscografico + ", lista=" + Arrays.toString(lista) + "]";
	}
}
