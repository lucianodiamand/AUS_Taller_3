
public class Ordenador {

	private Ordenador() {
		// Clase helper
	}
	
	public static void ordenar(Ordenable[] ordenables) {
		for (int i = 0; i < ordenables.length - 1; i++ ) {
			for (int j = i; j < ordenables.length; j++) {
				if (ordenables[i].compareTo(ordenables[j]) < 0) {
					Ordenable tmp = ordenables[i];
					ordenables[i] = ordenables[j];
					ordenables[j] = tmp;
				}
			}
		}
	}

}
