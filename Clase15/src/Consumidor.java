public class Consumidor extends Thread {

	private Pila pila;

	public Consumidor(Pila pila) {
		this.pila = pila;
	}

	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			char caracter = this.pila.pop();
			System.out.println(caracter);
//			try {
//				Thread.sleep((int) (Math.random() * 600) + 200);
//			} catch (InterruptedException ex) {
//			}
		}
	}
}
