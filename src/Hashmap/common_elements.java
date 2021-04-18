package Hashmap;

import java.util.HashMap;

public class common_elements {

	public static void main(String[] args) {
		int[] arr1 = { 1, 1, 2, 2, 2, 3, 5 };
		int[] arr2 = { 1, 1, 1, 2, 2, 4, 5 };
//		commonElements(arr1, arr2);
		commonElements2(arr1, arr2);

	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println("End");
	}

	public static void commonElements(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int val : arr1) {
			if (hm.containsKey(val)) {
				int one = hm.get(val);
				int two = one + 1;
				hm.put(val, two);
			} else {
				hm.put(val, 1);
			}
		}

		for (int val : arr2) {
			if (hm.containsKey(val)) {
				System.out.println(val);
				hm.remove(val);
			}
		}

	}

	public static void commonElements2(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int val : arr1) {
			if (hm.containsKey(val)) {
				int one = hm.get(val);
				int two = one + 1;
				hm.put(val, two);
			} else {
				hm.put(val, 1);
			}
		}

		for (int val : arr2) {
			if (hm.containsKey(val) && hm.get(val)>0) {
				System.out.println(val);
				int one = hm.get(val);
				int two = one - 1;
				hm.put(val, two);
			}
		}
	}
}
