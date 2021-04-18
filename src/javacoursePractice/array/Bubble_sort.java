package javacoursePractice.array;

public class Bubble_sort {

	public static void main(String[] args) {
		int[] arr = { 88, 66, 55, 44, 22 };
		int[] ans = BubbleSort(arr);
		display(ans);
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("End");
	}

	public static int[] BubbleSort(int[] arr) {
		int n = arr.length - 1;
		int counter = 0;
		while (counter < n) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			counter++;
		}
		return arr;
	}
}
