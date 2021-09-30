
public class Main {

	public static void main(String[] args) {
		Pila pila = new Pila();
		Productor p1 = new Productor(pila);
		Productor p2 = new Productor(pila);
		Consumidor c1 = new Consumidor(pila);
		Consumidor c2 = new Consumidor(pila);
		p1.start();
		p2.start();
		c1.start();
		c2.start();
		System.out.println("Fin");
	}
}
