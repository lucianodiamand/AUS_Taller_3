package innerstatic;

public class OuterDemo {

	public static void main(String[] args) {
		//Outer o = new Outer();
		//o.m2();

		Outer.Inner ref1 = new Outer.Inner();
		ref1.m1();
	}

}
