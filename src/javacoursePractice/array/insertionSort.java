package javacoursePractice.array;

public class insertionSort {

	public static void main(String[] args) {
		int[] arr = { 88, 11, 44, 99, 33 };
		int[] ans = InsertionSort(arr);
		display(ans);
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("End");
	}

	public static int[] InsertionSort(int[] arr) {
		int counter = 1;
		int n = arr.length - 1;
		while (counter <= n) {
			int val = arr[counter];

			int j=counter-1;
			while(j>=0 && arr[j]>val) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=val;
			counter++;
		}
		return arr;
	}
}
