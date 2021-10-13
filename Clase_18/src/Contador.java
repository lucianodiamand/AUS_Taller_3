
public class Contador {

	private int valor;
	
	public void inc() {
		synchronized(this) {
			valor++;
		}
	}
	
	public void dec() {
		synchronized(this) {
			valor--;
		}
	}
	
	public int getValor() {
		return valor;
	}

}
