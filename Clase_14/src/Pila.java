import java.util.LinkedList;
import java.util.List;

public class Pila<T> {

	protected List<T> elementos;

	public Pila() {
		elementos = new LinkedList<>();
	}

	public T pop() {
		if (size() == 0) {
			return null;
		}
		return elementos.remove(size() - 1);
	}

	public void push(T elemento) {
		elementos.add(elemento);
	}

	public int size() {
		return elementos.size();
	}
	
}
