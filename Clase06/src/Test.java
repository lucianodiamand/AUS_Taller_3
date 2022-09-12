
public class Test {

	public static void main(String[] args) {
		A a1 = new A(4);
		A a2 = new A(4);
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		B b = new B(6);
		
		System.out.println(a1);
	}
}
