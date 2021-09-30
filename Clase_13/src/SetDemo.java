import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> arr = new HashSet<String>();
		arr.add("Hola");
		arr.add("Hola");
		arr.add("Hola");
		
		System.out.println(arr.size());
		
		arr.remove("Hola");
		
		System.out.println(arr.size());
		
		arr.add("Uno");
		arr.add("Dos");
		arr.add("Tres");
		arr.add("Cuatro");
		arr.add("Cinco");
		
		for (String string : arr) {
			System.out.println(string);
		}
		
		// String s = arr.get(1);
		//arr.set(1, "Chau");
		//arr.add(1, "Chau");
	}
}
