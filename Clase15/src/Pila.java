
public class Pila {

	private static final int CANT = 4;

	private char [] elements;
	
	private int index;

	public Pila() {
		this.elements = new char[CANT];
	}
	
	public synchronized void push(char tmp) {
		while (this.index == CANT) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.elements[index++] = tmp;
		this.notify();
	}
	
	public synchronized char pop() {
		while(this.index == 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notify();
		return this.elements[--index];
	}

}
