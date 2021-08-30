
public class ArreglosDemo {

	public static void main(String[] args) {
		int [][] bi2 = new int[2][];
		
		for (int i = 0; i < bi2.length; i++) {
			System.out.println(bi2[i]);
		}
		
		String [] arr = { "Hola", "Chau", "Sopa", "Pepe" };
		
		for (String elem : arr) {
			System.out.println(elem);
		}
		
		int [] arr2 = new int[10];
		for (int i : arr2) {
			i = 10;
		}
		
		for (int i : arr2) {
			System.out.println(i);
		}
		
		String [] arr3 = new String[10];
		for (String ring : arr3) {
			ring = "Hola";
		}
		
		for (String ring : arr3) {
			System.out.println(ring);
		}
	}
}
