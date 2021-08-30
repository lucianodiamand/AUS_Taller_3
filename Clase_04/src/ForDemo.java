
public class ForDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if (i == 50) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("sigue por aca");
		
		este: for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				if ( i + 1 == j) {
					continue este;
				}
			}
		}
	}
}
