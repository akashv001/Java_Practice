package javacoursePractice.Searching_Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 88, 11, 44, 99, 33 };
		InsertionSort1(arr);
		display(arr);
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void InsertionSort1(int[] arr) {
		for (int counter = 1; counter < arr.length; counter++) {
			int val = arr[counter];

			int j = counter - 1;
			while (j >= 0 && arr[j] > val) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = val;
		}
	}
}
