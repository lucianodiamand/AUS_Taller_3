import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Libro> tree = new TreeSet<>();
		tree.add(new Libro(1000, "1234", "Pedro"));
		tree.add(new Libro(1980, "5431", "Mariana"));
		tree.add(new Libro(1401, "2222", "Marcos"));
		
		for (Libro l : tree) {
			System.out.println(l.getAnio());
		}
	}
}
