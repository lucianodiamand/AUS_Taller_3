
public class Main {

	public static void main(String[] args) {
		Contador contador = new Contador();

		Incrementador inc = new Incrementador(contador);
		Thread tinc = new Thread(inc);
		
		Decrementador dec = new Decrementador(contador);
		Thread tdec = new Thread(dec);
		
		tinc.start();
		tdec.start();
		
		try {
			tinc.join();
			tdec.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		System.out.println(contador.getValor());
	}

}
