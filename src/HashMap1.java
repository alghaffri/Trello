import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = {"Atyab", "Fatima", "Saeed", "Malak", "Fatima", "Daniyal", "Abdullah", "Abdullah"	};

				// Create  HashMap 

				Map<String, Integer> namesHashMap = new HashMap<>();


				for (String name : names) {

			

				if (!namesHashMap.containsKey(name)) {

				namesHashMap.put(name, 1);

				}

				

				else {

				namesHashMap.put(name, namesHashMap.get(name) + 1);

				}

				}

	

				for (Map.Entry<String, Integer> enter : namesHashMap.entrySet()) {

				System.out.println(enter.getKey() + ": " + enter.getValue());

				}

				}

				}