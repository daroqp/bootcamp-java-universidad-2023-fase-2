package ar.com.educacionit.universidad.oop.polimorfismo;

public final class Xbox extends Consola {

	private boolean tieneConexionAInternet;
	private String[] puertosUSB;
	private int memoria;
	private boolean digital;
	private DiscoExterno discoExterno;
	
	//la play debe tener su constructor 
	// debe llamar al del padre
	public Xbox(String serie, String color, boolean tieneConexionAInternet, int memoria, boolean digital) {
		
		// super hace referencia al padre de la clase
		super(serie, "Microsoft", "Xbox" , color);
		
		// seteos de la propia clase
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

	public boolean isDigital() {
		return digital;
	}
}
