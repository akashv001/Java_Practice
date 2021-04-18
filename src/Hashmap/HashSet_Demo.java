package Hashmap; // main features is this only contains unique elements.

import java.util.HashMap;
import java.util.HashSet;

public class HashSet_Demo {
	public static void main(String[] args) {
		int[] arr = { 5, 10, 1, 3, 9, 2, 8, 0, 7, 10, 2, 1, 0, 99 };
//		hashmap(arr);
//		unique_elements(arr);
		System.out.println(HashwithSet( arr));

	}

	public static void hashmap(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				int ov = map.get(arr[i]);
				int nv = ov + 1;
				map.put(arr[i], nv);
			} else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
		System.out.println(map.size());

	}

	public static void unique_elements(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}

		System.out.println(set);
		System.out.println(set.size());
	}

	public static boolean HashwithSet(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				int ov = map.get(arr[i]);
				int nv = ov + 1;
				map.put(arr[i], nv);
			} else {
				map.put(arr[i], 1);
			}
		}

		HashSet<Integer> set = new HashSet(map.values());
		return map.size() == set.size();
	}
}
