
public class OperadorTernario {

	public static void main(String[] args) {
		int a = 10;
		
		int b;
		if (a < 100) {
			b = 5;
		} else {
			b = 0;
		}

		// (cond bool) ? true : false;

		b = a < 100 ? 5 : 0;
	}
	
}
