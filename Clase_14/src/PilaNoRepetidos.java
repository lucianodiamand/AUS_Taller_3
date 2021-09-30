
public class PilaNoRepetidos<T> extends Pila<T> {

	@Override
	public void push(T elemento) {
		if (!this.elementos.contains(elemento)) {
			super.push(elemento);
		}
	}

}
