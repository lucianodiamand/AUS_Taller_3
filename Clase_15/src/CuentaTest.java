
public class CuentaTest {

	public static void main(String[] args) {
		Cuenta c = new Cuenta(1000);
		try {
			c.extraer(100);
		} catch (SinUnMangoException e) {
//			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
