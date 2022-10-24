import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();

		set.add(6);
		set.add(7);
		set.add(8);

		System.out.println(set.size());

		for (Integer i : set) {
			System.out.println(i);
		}

		set.remove(7);

		for (Integer i : set) {
			System.out.println(i);
		}

		set.add(6);
		set.add(8);

		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer elem = it.next();
			System.out.println(elem);
		}

		System.out.println("--------------------------");
		System.out.println(set.size());
	}
}
