package anonimas;

public class Outer {

	public void m2() {
		m3(new MiInterface() {
			public void mi() {
				System.out.println("Este es mimi");
			}
		});
		//m3(new MiSubclase());
	}

	public void m3(MiInterface o) {
		o.mi();
	}

}
