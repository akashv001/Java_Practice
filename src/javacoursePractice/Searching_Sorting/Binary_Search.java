package javacoursePractice.Searching_Sorting;

public class Binary_Search {

	public static void main(String[] args) {
		int[] arr = { 5, 7, 10, 12, 15, 20, 27, 31, 36, 42, 55, 58, 60, 65, 70, 80 };
		int ans = BinarySearch(arr, 60);
		System.out.println(ans);
	}

	public static int BinarySearch(int[] arr, int item) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (item > arr[mid]) {
				low = mid + 1;
			} else if (item < arr[mid]) {
				high = mid - 1;
			} else {
				return mid;
			}
		}

		return -1;
	}

}