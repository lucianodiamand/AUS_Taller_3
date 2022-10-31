package method;

public class Outer {

	public void m2() {
		class Inner {
			public void m1() {
				// this.c1 = 4;
			}
		}
		Inner i = new Inner();
		i.m1();
	}

	public void m3() {
		// Inner i3 = new Inner();
	}
}
