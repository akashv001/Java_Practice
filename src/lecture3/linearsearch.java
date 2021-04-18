package lecture3;

import java.util.Scanner;

public class linearsearch {

	public static void main(String[] args) {
		int[] arr = { 10, 12, 14, 20, 25, 45 };
//		System.out.println(linearsearch(arr));
		System.out.println(binarysearch(arr, 45));
	}

	public static int linearsearch(int[] arr) {
		int i = 0;
		int item = 12;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}

		}
		return -1;

	}

	public static int binarysearch(int[] arr, int item) {
		Scanner s = new Scanner(System.in);

		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] < item) {
				low = mid + 1;
			} else if (arr[mid] > item) {
				high = mid - 1;
			} else {
				return mid;
			}

		}
		return -1;
	}
}