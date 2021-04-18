package codingNinja.ArrayQues;

public class push_0_to_end {

	public static void main(String[] args) {
		int[] arr = { 2, 0, 4, 1, 3, 0, 28 };
//		PushZeroToEnd(arr);
//      display(arr);
		int[] ans = PushZerotoend(arr);
		display(ans);
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void PushZeroToEnd(int[] arr) {
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[k] = arr[i];
				k++;
			}
		}

		for (int i = k; i < arr.length; i++) {
			arr[i] = 0;
		}

	}

	public static int[] PushZerotoend(int[] arr) {
		int[] temp = new int[arr.length];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				temp[k] = arr[i];
				k++;
			}
		}

		for (int i = k; i < arr.length; i++) {
			temp[i] = 0;
		}

		arr = temp;
		return arr;
	}

}
