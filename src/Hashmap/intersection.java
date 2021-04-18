package Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class intersection {

	public static void main(String[] args) {
		int[] arr1 = { 5, 1, 3, 4, 7 };
		int[] arr2 = { 2, 4, 3, 5, 7, 10, 15 };
		ArrayList<Integer> list = new ArrayList<>();
//		findIntersection(arr1, arr2);
		list = getIntersection(arr1, arr2);
		System.out.println(list);
	}

	public static void findIntersection(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int val : arr1) {
			map.put(val, 1);
		}

		for (int val : arr2) {
			if (map.containsKey(val)) {
				System.out.print(val + " ");
				map.remove(val);
			}
		}
	}

	public static ArrayList<Integer> getIntersection(int[] arr1, int[] arr2) {
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < arr1.length; i++) {
			map.put(arr1[i], false);
		}

		for (int j = 0; j < arr2.length; j++) {
			if (map.containsKey(arr2[j])) {
				map.put(arr2[j], true);
			}
		}

		Set<Map.Entry<Integer, Boolean>> entries = map.entrySet();
		for (Map.Entry<Integer, Boolean> entry : entries) {
			if (entry.getValue()) {
				list.add(entry.getKey());
			}
		}
		return list;
	}
}
