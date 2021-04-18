package codingNinja.ArrayQues;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayIntersection {

	public static void main(String[] args) {
		int[] arr1 = { 2, 6, 8, 5, 4, 3 };
		int[] arr2 = { 2, 3, 4, 7 };
//		Intersection1(arr1, arr2);
		Intersection2(arr1, arr2);

	}

	public static void Intersection1(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(arr1[i] + " ");
				}
			}
		}
	}

	public static void Intersection2(int[] one, int[] two) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < one.length; i++) {
			map.put(one[i], 1);
		}

		for (int i = 0; i < two.length; i++) {
			if (map.containsKey(two[i])) {
				int val = map.get(two[i]);
				val = val + 1;
				map.put(two[i], val);
			} else {
				map.put(two[i], 1);
			}
		}

		Set<Map.Entry<Integer, Integer>> entries = map.entrySet();

		for (Map.Entry<Integer, Integer> entry : entries) {
			if (entry.getValue() > 1) {
				System.out.print(entry.getKey() + " ");
			}
		}

		System.out.println("End");
	}
}