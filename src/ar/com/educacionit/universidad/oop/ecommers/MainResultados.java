package ar.com.educacionit.universidad.oop.ecommers;

public class MainResultados {

	public static void main(String[] args) {
		Buscador buscador = new Buscador();// f5|f6

		String claveBuscadaPorElUsuario = "iron man";
		buscador.actualizarClave(claveBuscadaPorElUsuario);
		buscador.buscar();// f5

		System.out.println(
				"Hemos Encontrado " + buscador.getCantidad() + " Resultados Para '" + buscador.obtenerClave() + "'");
		// recorro los resultados

		Resultado[] res = buscador.obtenerResultados();
		for (Resultado resultado : res) {
			System.out.println(resultado);
		}
	}
}
