package javacoursePractice.array;

public class selection_sort {

	public static void main(String[] args) {
		int[] arr = { 88, 11, 44, 99, 55 };
		int[] ans = SelectionSort(arr);
		display(ans);
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("End");
	}

	public static int[] SelectionSort(int[] arr) {
		int counter = 0;
		int n = arr.length - 1;

		while (counter < n) {
			int min = counter;
			for (int i = counter+1; i < arr.length; i++) {
				if (arr[min] > arr[i]) {
					min = i;
				}

			}
			int temp = arr[counter];
			arr[counter] = arr[min];
			arr[min] = temp;
			counter++;
		}
		return arr;
	}
}
