package ar.com.educacionit.universidad.oop.polimorfismo;

public class Play extends Consola {

	private boolean tieneConexionAInternet;
	private String[] puertosUSB;
	private int memoria;
	private boolean digital;
	private int version;
	private DiscoExterno discoExterno;
	
	//la play debe tener su constructor 
	// debe llamar al del padre
	public Play(String serie, String color, int version, boolean tieneConexionAInternet, int memoria, boolean digital) {
		
		// super hace referencia al padre de la clase
		super(serie, "Sony", "Play " + version, color);
		
		// seteos de la propia clase
		this.version = version;
		this.tieneConexionAInternet = tieneConexionAInternet;
		this.digital = digital;
	}

	public DiscoExterno getDiscoExterno() {
		return discoExterno;
	}

	public void setDiscoExterno(DiscoExterno discoExterno) {
		this.discoExterno = discoExterno;
	}

	public boolean isTieneConexionAInternet() {
		return tieneConexionAInternet;
	}

	public String[] getPuertosUSB() {
		return puertosUSB;
	}

	public int getMemoria() {
		return memoria;
	}

	public int getVersion() {
		return version;
	}

	public boolean isDigital() {
		return digital;
	}
	@Override
	public void play() {
		System.out.println("Jugando con la play");
	}
}
