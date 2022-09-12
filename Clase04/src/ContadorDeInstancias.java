
public class ContadorDeInstancias {

	private static int cont;

	private int id;

	// Bloque de inicializacion estatica
	static {
		cont = 5;
	}

	public ContadorDeInstancias() {
		id = ++cont;
	}

	public int getId() {
		return id;
	}
	
	public static int getCantInstancias() {
		return cont;
	}

}
