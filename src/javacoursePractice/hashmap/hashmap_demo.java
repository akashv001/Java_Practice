package javacoursePractice.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap_demo {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		System.out.println(map);
		System.out.println(map.size());

		map.put("India", 100);
		map.put("Australia", 150);
		map.put("england", 200);
		map.put("usa", 250);
		map.put("nepal", 145);
		System.out.println(map);
		System.out.println(map.size());

		map.remove("india");
		System.out.println(map);
		System.out.println(map.remove("india"));
		System.out.println(map.size());

//		System.out.println(map.remove("India"));
		System.out.println(map);
		System.out.println(map.size());

		System.out.println(map.get("India"));
		System.out.println(map.get("usa"));

		System.out.println(map.containsKey("nepal"));
		System.out.println(map.containsKey("usa"));

		System.out.println("***********keys************");
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key);
		}

		System.out.println("****************values********");
		Collection<Integer> values = map.values();
		for (Integer value : values) {
			System.out.println(value);
		}

		System.out.println("**********entryset*********");
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + "=>" + entry.getValue());
		}
	}

}
