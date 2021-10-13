
public class Decrementador implements Runnable {

	public Contador contador;

	public Decrementador(Contador contador) {
		this.contador = contador;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 200000; i++) {
			contador.dec();
		}
	}

}
