package Hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Codingblocks {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("USA", 200);
		map.put("UK", 150);
		map.put("India", 300);
		map.put("China", 350);
		map.put("Sweden", 100);
		System.out.println(map);

		map.put("japan", 100);
		System.out.println(map);

		System.out.println(map.get("India"));
		System.out.println(map.get("rsa"));

		System.out.println(map.remove("USA"));
		System.out.println(map.containsKey("USA"));
		System.out.println(map.containsKey("India"));

		System.out.println("*********getting keys************");

		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key);
		}

		System.out.println("********getting values*********");

		Collection<Integer> values = map.values();
		for (Integer value : values) {
			System.out.println(value);
		}

		System.out.println("*********Entry Set*************");

		Collection<Map.Entry<String, Integer>> entries = map.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + "=>" + entry.getValue());
		}

		String str = "aaabbccddbba";
		System.out.println(maxfrequencyCharacter(str));
	}

	public static Character maxfrequencyCharacter(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			if (map.containsKey(cc)) {
				int ov = map.get(cc);
				int nv = ov + 1;
				map.put(cc, nv);
			} else {
				map.put(cc, 1);
			}
		}
		int max = 0;
		char maxchar = '\0';
		Set<Map.Entry<Character, Integer>> entries = map.entrySet();
		for (Map.Entry<Character, Integer> entry : entries) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				maxchar = entry.getKey();
			}
		}
		return maxchar;
	}
}
