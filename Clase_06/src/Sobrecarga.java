
public class Sobrecarga {

	public static void main(String[] args) {
		Sobrecarga s = new Sobrecarga();
		s.sumar(1, 2);
		s.sumar(1,  2, 3);
	}
	
	public int sumar(int a, int b) {
		System.out.println("Suma 2");
		return a + b;
	}
	
	public int sumar(int a, int b, int c) {
		System.out.println("Suma 3");
		return a + b + c;
	}
	
}
