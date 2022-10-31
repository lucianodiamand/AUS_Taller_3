package innermember;

public class OuterDemo {

	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner ref1 = o.new Inner();
		ref1.m1();
	}

}
