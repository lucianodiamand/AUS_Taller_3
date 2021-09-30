
public class Productor extends Thread {

	private Pila pila;
	
	public Productor(Pila pila) {
		this.pila = pila;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			char tmp = (char)((int)(Math.random() * 26) + 'A');
			pila.poner(tmp);
			try {
				Thread.sleep(200 + (int)(Math.random() * 600));
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
