package codingNinja.ArrayQues;

public class Sort_0_1 {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1 };
//		Sort0_1_1st(arr);
		sort2(arr);
	}

	public static void Sort0_1_1st(int[] arr) {
		int low = 0;
		int high = arr.length - 1;

		while (low < high) {
			if (arr[low] < arr[high]) {
				low++;
			} else if (arr[high] >= arr[low]) {
				high--;
			} else {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
			}
		}

		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

	public static void sort2(int[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j++;
			}
		}
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

}
