
public class Productor extends Thread {

	private Pila pila;

	public Productor(Pila pila) {
		this.pila = pila;
	}

	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			char aleatorio = (char)((int) (Math.random() * 26) + 'A');
			pila.push(aleatorio);
//			try {
//			    Thread.sleep((int)(Math.random() * 600));
//			} catch (InterruptedException ex) { }
		}
	}
}
