
public class Consumidor extends Thread {

	private Pila pila;
	
	public Consumidor(Pila pila) {
		this.pila = pila;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			char tmp = pila.sacar();
			System.out.println(tmp);
			try {
				Thread.sleep(400 + (int)(Math.random() * 600));
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
