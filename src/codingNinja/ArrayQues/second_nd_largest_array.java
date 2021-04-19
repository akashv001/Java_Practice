package codingNinja.ArrayQues;

import java.util.Arrays;

public class second_nd_largest_array {

	public static void main(String[] args) {
		int[] arr = { 2, 13, 4, 1, 3, 6, 28 };
//		Second_nd_largest1(arr);
//		Second_nd_largest2(arr);
		Second_nd_largest3(arr);
	}

	public static void Second_nd_largest1(int[] arr) {
		Arrays.sort(arr);
		int n = arr.length - 1;

		System.out.println(arr[n - 1]);
	}

	public static void Second_nd_largest2(int[] arr) {
		for (int counter = 0; counter < arr.length; counter++) {
			for (int i = 0; i < arr.length - 1 - counter; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}
			}
		}

		System.out.println(arr[arr.length - 2]);
	}

	public static void Second_nd_largest3(int[] arr) {
//		int[] arr = { 2, 13, 4, 1, 3, 6, 28 };

		int larg = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > larg) {
				second = larg;
				larg = arr[i];
			} else if (arr[i] < larg && arr[i] > second) {
				second = arr[i];
			}
		}
		System.out.println(second);
	}

}
