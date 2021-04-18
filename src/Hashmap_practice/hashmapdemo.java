package Hashmap_practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmapdemo {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("USA", 200);
		map.put("UK", 150);
		map.put("India", 300);
		map.put("China", 350);
		map.put("Sweden", 100);
		System.out.println(map);

		System.out.println(map.get("USA"));
		System.out.println(map.get("India"));
		System.out.println(map.get("RSA"));

//    System.out.println(map.remove("USA"));
		System.out.println(map);

		map.put("India", 325);
		System.out.println(map);

		System.out.println(map.containsKey("usa"));
		System.out.println(map.containsKey("USA"));

		System.out.println("********keys*********");
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key);
		}

		System.out.println("*********values*********");
		Collection<Integer> values = map.values();
		for (Integer value : values) {
			System.out.println(value);
		}

		System.out.println("**************entryset******");
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + "=>" + entry.getValue());
		}

	}
}
