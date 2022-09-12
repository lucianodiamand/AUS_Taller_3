
public class A {

	private int valor;
	
	public A(int valor) {
		System.out.println("Estoy en el constructor de A");
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Soy A y tengo el valor " + valor;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (!(obj instanceof A)) {
	    	return false;
	    }
	    if (null == obj) {
	    	return false;
	    }
	    A tmp = (A) obj;
	    return tmp.valor == valor;
	}

	
}
