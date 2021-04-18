package javacoursePractice.Lecture2;

public class Sorting {

	public static void main(String[] args) {
//		int[] arr = { 88, 66, 55, 44, 22 };
//		arr = bubbleSort(arr);

//		arr=SelectionSort(arr);
//		display(arr);

		int[] arr = { 88, 11, 44, 99, 33 };
		InsertionSort(arr);
		display(arr);

	}

	public static void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static int[] bubbleSort(int[] arr) {

		for (int counter = 0; counter < arr.length - 1; counter++) {

			for (int i = 0; i < arr.length - 1 - counter; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		return arr;
	}

	public static int[] SelectionSort(int[] arr) {

		for (int counter = 0; counter < arr.length - 1; counter++) {

			int min = arr[counter];

			for (int i = counter + 1; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					min = i + 1;
				}

				int temp = arr[counter];
				arr[counter] = arr[min];
				arr[min] = temp;
			}

		}

		return arr;
	}

	public static int[] InsertionSort(int[] arr) {

		for (int counter = 1; counter < arr.length; counter++) {

			int val = arr[counter];
			int j = counter - 1;

			while (j >= 0 && arr[j] > val) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = val;
		}
		return arr;

	}

}
