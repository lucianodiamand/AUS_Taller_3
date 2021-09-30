import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> arr = new ArrayList<>();
		arr.add("Hola");
		arr.add("Sopa");
		arr.add("Chau");
		System.out.println(arr.size());
		arr.remove("Sopa");
		// arr.add(new Integer(3));
		arr.add(1, "Hola");
		System.out.println(arr.size());
		arr.set(2, "Otro");
		
		for (String string : arr) {
			System.out.println(string);
		}
		
		String s = arr.get(1);
	}
	
}
