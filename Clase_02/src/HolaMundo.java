
public class HolaMundo {

	public static void main(String[] args) {
		System.out.println("Hola Mundo!");
		
		int i = 1;
		double d = 32.4;
		
		String s = new String("Hola");
		System.out.println(s);
		
		String s2 = "Hola";
		System.out.println(s2);
		
		String s3 = s2;
		
		String s4 = "Hola";
		
		boolean b1 = s2 == s4;
		System.out.println(b1);
		
		boolean b2 = s.equals(s4);
		System.out.println(b2);
	
	}
}
