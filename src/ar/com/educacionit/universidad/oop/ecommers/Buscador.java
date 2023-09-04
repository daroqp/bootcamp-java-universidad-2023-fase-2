package ar.com.educacionit.universidad.oop.ecommers;

import java.util.Arrays;

public class Buscador {

	private String clave;
	private Resultado[] resultados;
	
	public Buscador() {
		this.clave = "";
		this.resultados = new Resultado[0];
	}
		
	public String obtenerClave() {
		return this.clave;
	}
	
	public void actualizarClave(String clave) {
		if(clave == null) {
			this.clave = "";
		} else {
			this.clave = clave;
		}
	}
	
	public Resultado[] obtenerResultados() {
		return this.resultados;
	}
	
	private void actualizarResultados(Resultado[] resultados) {
		if(resultados == null) {
			this.resultados = new Resultado[0];
		} else {
			this.resultados = resultados;
		}
	}
	
	public void buscar() {
		
		if( claveVacio() ) {
			return;
		}
		
		// vamos a simular que la consulta obtiene 3 resultados;
		// creando 3 resultados
		Resultado res1 = new Libro("Iron Man", "htpp://bla.com.ar/img1.jpg", 3000.32f, "Brian ADAM","123342", "sinopsis 123", 199);
		Resultado res2 = new Musica("Iron Man 2", "htpp://bla.com.ar/img1.jpg", 3000.32f, "Brian ADAM", "sello discografico", new String[] {"disc 1", "disc 2"});
		Resultado res3 = new Pelicula("Iron Man 3", "htpp://bla.com.ar/img1.jpg", 3000.32f, "Brian Algo", "warner", "blue ray");
		
		agregarResultado(res1);
		agregarResultado(res2);
		agregarResultado(res3);
	}
	
	private boolean claveVacio() {
		return "".equals(this.clave.trim());
	}

	private void agregarResultado(Resultado res) {
		Resultado[] aux = new Resultado[this.resultados.length + 1];
		
		for(int i = 0; i < this.resultados.length; i++) {
			aux[i] = this.resultados[i];
		}
		
		aux[this.resultados.length] = res;
				
		actualizarResultados(aux);
	}
	
	public int getCantidad() {
		return this.resultados.length;
	}

	@Override
	public String toString() {
		return "Buscador [clave=" + clave + ", resultados=" + Arrays.toString(resultados) + "]";
	}
}










