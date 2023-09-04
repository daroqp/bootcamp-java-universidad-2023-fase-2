package ar.com.educacionit.universidad.oop.ecommers;

import java.util.Scanner;

public class MainBuscador {

	public static void main(String[] args) {

		Buscador buscador = new Buscador();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Buscar ....");
		String claveBuscadoPorElUsuario = teclado.next();
		
		buscador.actualizarClave(claveBuscadoPorElUsuario);
		buscador.buscar();
		System.out.println(buscador);

		teclado.close();
	}

}
