
public class Lampara {

	private int color;

	private boolean prendida;

	public Lampara() {
		this.color = 0;		
	}

	public Lampara(int color) {
		System.out.println("Estoy en lampara");
		prendida = false;
		this.color = color;
	}

	public void on() {
		prendida = true;
	}
	
	public void off() {
		prendida = false;
	}
	
	public boolean isPrendida() {
		return prendida;
	}
}
