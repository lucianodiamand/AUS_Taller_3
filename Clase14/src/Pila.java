import java.util.ArrayList;
import java.util.List;

public class Pila<T> {

	private List<T> elementos;

	private int cant;
	public Pila(int cant) {
		this.cant = cant;
		elementos = new ArrayList<>(cant);
	}

	public void push(T obj) {
		if (elementos.size() < cant && !elementos.contains(obj)) {
			elementos.add(obj);	
		}
	}

	public T pop() {
		if (elementos.size() >= 1) {
		    return elementos.remove(elementos.size() - 1);
	    }
		return null;
	}

	public int size() {
		return elementos.size();
	}

}
