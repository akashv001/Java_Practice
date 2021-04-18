package codingNinja.ArrayQues;

public class Rotate_Array {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		RotateArray(arr, 2);
		display(arr);
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void RotateArray(int[] arr, int d) {

		for (int i = 1; i <=d; i++) {
			int temp = arr[0];

			for (int j = 0; j < arr.length-1; j++) {
				arr[j] = arr[j + 1];
			}

			arr[arr.length - 1] = temp;
		}

	}
}