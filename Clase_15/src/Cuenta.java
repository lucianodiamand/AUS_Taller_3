
public class Cuenta {

	private double saldo;
	
	public Cuenta(double saldo) {
		this.saldo = saldo;
	}
	
	public double extraer (double cant) throws SinUnMangoException {
		if (cant > saldo) {
			 SinUnMangoException sume = new SinUnMangoException();
			 throw sume;
		}
		saldo -= cant;
		return cant;
	}
	
	public void depositar (double cant) {
		saldo += cant;
	}
}
