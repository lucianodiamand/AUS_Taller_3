
public class Cuenta {

	private double saldo;

	public void depositar(double cant) {
		saldo += cant;
	}
	
	public double extraer(double cant) throws SinUnMangoException {
		if (saldo < cant) {
			throw new SinUnMangoException();
		}
		saldo -= cant;
		return cant;
	}
}

