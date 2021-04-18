package javacoursePractice.Searching_Sorting;

public class Selection_Sort {

	public static void main(String[] args) {
		int[] arr = { 88, 11, 44, 99, 55 };
		SelectionSort(arr);
		display(arr);
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void SelectionSort(int[] arr) {
		for (int counter = 0; counter < arr.length - 1; counter++) {
			int min = counter;

			for (int j = counter + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}

			int temp = arr[counter];
			arr[counter] = arr[min];
			arr[min] = temp;
		}
	}
}