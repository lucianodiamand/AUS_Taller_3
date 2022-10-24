import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> mapa = new HashMap<>();

		mapa.put("Uno", 1);
		mapa.put("Dos", 2);

		System.out.println(mapa.size());

		mapa.put("Dos", 3);

		for (String key : mapa.keySet()) {
			System.out.println(mapa.get(key));
		}
		
		System.out.println(mapa.get("Tres"));
		
	}
}
