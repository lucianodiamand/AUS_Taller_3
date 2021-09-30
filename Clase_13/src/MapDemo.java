import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> mapa = new HashMap<>();
		mapa.put("Tres", Integer.valueOf(3));
		mapa.put("Uno", Integer.valueOf(1));
		mapa.put("Dos", Integer.valueOf(2));
		
		System.out.println(mapa.get("Dos"));
		System.out.println(mapa.get("Cuatro"));
		
		System.out.println(mapa.size());
		
		Set<String> claves = mapa.keySet();
		for (String clave : claves) {
			Integer elemento = mapa.get(clave);
			System.out.println(elemento);
		}
	}
}
