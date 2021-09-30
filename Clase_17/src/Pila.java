
public class Pila {

	private char [] elementos;
	
	private int indice;

	public Pila () {
		elementos = new char[10];
	}
	
	public synchronized void poner(char elemento) {
		elementos[indice++] = elemento;
		notifyAll();
	}
	
	public synchronized char sacar() {
		while (indice == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return elementos[--indice];
	}
	
	public int size() {
		return indice;
	}
}
