
public class ContadorDeInstanciasTest {

	public static void main(String[] args) {
		ContadorDeInstancias c1 = new ContadorDeInstancias();
		ContadorDeInstancias c2 = new ContadorDeInstancias();
		ContadorDeInstancias c3 = new ContadorDeInstancias();
		ContadorDeInstancias c4 = new ContadorDeInstancias();
		ContadorDeInstancias c5 = new ContadorDeInstancias();
		ContadorDeInstancias c6 = new ContadorDeInstancias();
		System.out.println(ContadorDeInstancias.getCantInstancias());
		System.out.println(c4.getId());
	}

}
