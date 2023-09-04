package ar.com.educacionit.universidad.oop.polimorfismo;

public class MainConsola {

	public static void main(String[] args) {

		Play play = new Play("123", "gris", 1, false, 32, false);
		Play play2 = new Play("12345", "negro", 2, false, 64, false);
		Play play5 = new Play("123456", "blanco", 5, true, 64, true);

		Xbox xbox = new Xbox("4322", "negro", true, 500, true);
				
//		play.play();
//		play2.play();
//		play5.play();
//		xbox.play();
		
		Consola[] consolas = new Consola[] {play, play2, play5, xbox};
		
		for(Consola consola : consolas) {
			consola.play();
			
			if(consola instanceof Play p) {
				p.getFabricante();
			}
			
			if(consola instanceof Xbox x) {
				x.getFabricante();
			}
		}
	}

}
