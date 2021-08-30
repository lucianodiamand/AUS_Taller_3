
public class OperadoresDemo {

	public static void main(String[] args) {
		// Operadores Logicos
		int a = 5;
		int b = 6;
		
		boolean b1 = terminoA() | terminoB();
		
		boolean b2 = terminoA() & terminoB();
		
		String s = null;
		if (s != null && s.trim().equals("")) {
			System.out.println("Esta vacio!");
		}
	}

	private static boolean terminoB() {
		System.out.println("TerminoB");
		return false;
	}

	private static boolean terminoA() {
		System.out.println("TerminoA");
		return false;
	}
	
	
}
