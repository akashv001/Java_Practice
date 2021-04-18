package codingNinja.ArrayQues;

import java.util.*;

public class findUnique {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 1, 6, 3, 6, 2 };
		method1(arr);
//		method2(arr);
	}

	public static void method1(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int flag = 0;

			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					flag = 1;
					break;
				}
			}

			if (flag == 0) {
				System.out.println(arr[i]);
			}

		}

	}

	public static void method2(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				int val = map.get(arr[i]);
				val = val + 1;
				map.put(arr[i], val);
			} else {
				map.put(arr[i], 1);
			}
		}

		Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
		for (Map.Entry<Integer, Integer> entry : entries) {
			if (entry.getValue() == 1) {
				System.out.print(entry.getKey() + " ");
			}
		}
	}
}
