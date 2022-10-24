
public class CuentaDemo {

	public static void main(String[] args) {
		Cuenta c1 = new Cuenta();
		c1.depositar(1000);
		try {
			c1.extraer(2000);
		} catch (SinUnMangoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fin");
	}
}
