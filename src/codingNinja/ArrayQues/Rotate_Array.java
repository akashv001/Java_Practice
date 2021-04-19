package codingNinja.ArrayQues;

public class Rotate_Array {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
//		RotateArray(arr, 2);
		RotateArray2(arr, 3);
		display(arr);
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void RotateArray(int[] arr, int d) {

		for (int i = 1; i <= d; i++) {
			int temp = arr[0];

			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}

			arr[arr.length - 1] = temp;
		}

	}

	public static void RotateArray2(int[] arr, int d) {
		int[] temp = new int[d];

		for (int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}

		for (int i = d; i < arr.length; i++) {
			arr[i - d] = arr[i];
		}

		int j = arr.length - d;
		for (int i = 0; i < temp.length; i++) {
			arr[j] = temp[i];
			j++;
		}

	}
}