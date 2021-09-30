import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>(20);
		
		for (int i = 0; i < 20; i++) {
			arr.add(String.valueOf(i));
		}
	}
}
