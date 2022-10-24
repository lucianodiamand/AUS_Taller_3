
public class ProductorConsumidorDemo {

	public static void main(String[] args) {
		Pila p = new Pila();
		Productor p1 = new Productor(p);
		Productor p2 = new Productor(p);
		Consumidor c1 = new Consumidor(p);
		Consumidor c2 = new Consumidor(p);
		p1.start();
		p2.start();
		c1.start();
		c2.start();
	}

}
