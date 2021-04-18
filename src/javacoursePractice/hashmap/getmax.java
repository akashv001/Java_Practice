package javacoursePractice.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class getmax {

	public static void main(String[] args) {
		String ans = "aabbaaabcdda";
		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < ans.length(); i++) {
			char cc = ans.charAt(i);

			if (map.containsKey(cc)) {
				int val = map.get(cc);
				val = val + 1;
				map.put(cc, val);
			} else {
				map.put(cc, 1);
			}
		}

		int max = 0;
		char maxChar = '\0';

		Set<Map.Entry<Character, Integer>> entries = map.entrySet();
		for (Map.Entry<Character, Integer> entry : entries) {
			if (max < entry.getValue()) {
				max = entry.getValue();
				maxChar = entry.getKey();
			}
		}
		System.out.println(maxChar);

	}

}
