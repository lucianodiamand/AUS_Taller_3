
public class SoloDatosTest2 {

	public static void main(String[] args) {
		int i;
		// System.out.println(i);

		SoloDatos s1 = new SoloDatos();
		System.out.println(s1.getI()); // -> 0
		System.out.println(s1.isB()); // -> false
		System.out.println(s1.getD()); // -> 0.0
		System.out.println(s1.getC()); // -> '\0'
		System.out.println(s1.getS()); // -> null
	}

}
