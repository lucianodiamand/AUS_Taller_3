import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();

		// lista.ensureCapacity(20);

		lista.add("Hola");
		// lista.add(Integer.valueOf(1));
		lista.add("Chau");

		// lista.trimToSize();

		for (int i = 0; i < lista.size(); i++) {
	    	System.out.println(lista.get(i).toUpperCase());
		}

		System.out.println("Size: " + lista.size());

		lista.remove(0);

		lista.add("Chau");
		lista.add("Chau");
	
		System.out.println("----------------------");
		for (Object object : lista) {
			System.out.println(object);
		}

		//System.out.println(lista.get(0));
	}
}
