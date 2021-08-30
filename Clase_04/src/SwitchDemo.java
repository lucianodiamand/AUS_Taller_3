
public class SwitchDemo {

	public static void main(String[] args) {
		
		// byte, short, int, String, char, enum
		char op = 'e';
		switch (op) {
		case 'a':
			System.out.println("a");
			break;
		case 'b':
			System.out.println("b");
			break;
		default:
			System.out.println("es otro");
		case 'c':
			System.out.println("c");
			break;
		case 'd':
			System.out.println("d");
			break;
		}

		String s = "Hola";
		switch (s) {
		case "Chau":
		case "Sopa":
		case "Pepe":
		}
	}
}
