
public class SoloDatosTest {

	public static void main(String[] args) {
		// boolean b = false;
		
		SoloDatos ref = new SoloDatos();
		ref.setB(true);
		System.out.println(ref.isB());
		
		SoloDatos ref2 = new SoloDatos();
		// ref2.b = false;
		ref2.setB(false);
		System.out.println(ref2.isB());
		
		System.out.println("-----------------------");

		String s1 = "Hola";
		String s2 = new String("Hola");
		String s3 = "Hola";
		String s4 = new String("Chau");
		
		System.out.println(s1 == s3);
		System.out.println(s1 == s2);
		System.out.println(s1 == s4);
		
		SoloDatos ref3 = new SoloDatos();
		ref3 = null;
	}

}
