package javacoursePractice.Searching_Sorting;

public class Linear_Search {

	public static void main(String[] args) {
		int[] arr = { 20, 30, 50, 35, 40 };
		int ans = LinearSearch(arr, 100);
		System.out.println(ans);
	}

	public static int LinearSearch(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}
		}
		return -1;
	}

}
