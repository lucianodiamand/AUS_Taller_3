
/*
 * Incialización peresoza (Lazy initialization)
 */
public class Forma3 {

	private Integer i;
	
	public Forma3() {
		System.out.println(i);
	}

	public Integer getI() {
		if (i == null) {
			i = 7;
		}
		return i;
	}

}
