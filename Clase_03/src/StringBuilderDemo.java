
public class StringBuilderDemo {

	public static void main(String[] args) {
		String s = "";
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			s = s + "Hola" + i + " ";
		}
		long end = System.currentTimeMillis();
		System.out.println("Tiempo: " + (end - start) + "ms");
		
		StringBuilder sb = new StringBuilder();
		start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			sb.append("Hola");
			sb.append(i);
			sb.append(" ");
		}
		String resul = sb.toString();
		end = System.currentTimeMillis();
		System.out.println("Tiempo: " + (end - start) + "ms");
		
		if (s.equals(resul)) {
			System.out.println("TODO OK");
		} else { 
			System.out.println("TODO MAL");
	    }
		
	}
}
