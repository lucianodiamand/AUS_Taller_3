
public class Incrementador implements Runnable {

	public Contador contador;

	public Incrementador(Contador contador) {
		this.contador = contador;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 200000; i++) {
			contador.inc();
		}
	}

}
