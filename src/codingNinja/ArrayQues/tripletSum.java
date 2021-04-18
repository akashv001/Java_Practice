package codingNinja.ArrayQues;

import java.util.HashSet;

public class tripletSum {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
//		TripletSum(arr, 12);
		TripletSum2(arr, 12);

	}

	public static void TripletSum(int[] arr, int targetSum) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					int ans = arr[i] + arr[j] + arr[k];
					if (targetSum - ans == 0) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
					}
				}
			}
		}
	}

	public static void TripletSum2(int[] arr, int targetSum) {
		for (int i = 0; i < arr.length; i++) {
			HashSet<Integer> map = new HashSet<>();

			for (int j = i + 1; j < arr.length; j++) {
				int sum = targetSum - (arr[i] + arr[j]);

				if (map.contains(sum)) {
					System.out.println(arr[i] + " " + arr[j] + " " + sum);
				} else {
					map.add(arr[j]);
				}
			}
		}
	}

}
