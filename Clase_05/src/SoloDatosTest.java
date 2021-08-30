
class SoloDatosTest {

	public static void main(String[] args) {
		SoloDatos s1; // defino la referencia
		s1 = new SoloDatos();
		
		s1.setI(1);
		System.out.println(s1.getI());
		
		SoloDatos s2 = new SoloDatos();
		s2.setI(2);
		System.out.println(s2.getI());
		
		SoloDatos s3 = new SoloDatos();
		SoloDatos.setJ(3);
		System.out.println(SoloDatos.getJ());
		
		System.out.println(SoloDatos.getJ());
		
	}
}
