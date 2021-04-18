package Hashmap;

import java.util.HashMap;

public class highFrequencyChar {

	public static void main(String[] args) {
		String str = "abrakadabra";
		HighFrequency(str);
	}

	public static void HighFrequency(String str) {
		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				int of = map.get(ch);
				int nf = of + 1;
				map.put(ch, nf);
			} else {
				map.put(ch, 1);
			}
		}
		char mfc = str.charAt(0);
		for (Character key : map.keySet()) {
			if (map.get(key) > mfc) {
				mfc = key;
			}
		}
		System.out.println(mfc);
	}
}