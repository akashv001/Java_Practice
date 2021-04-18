package questions_450;

public class kth_max_and_min {

	public static void main(String[] args) {
		int[] arr = { 7, 10, 4, 3, 20, 15 };
		System.out.println(" Kth min is :" + minSort(arr, 3));
		System.out.println(" Kth Max is :" + maxSort(arr, 2));
//		display(arr);
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

	public static int minSort(int[] arr, int k) {
		for (int counter = 0; counter < arr.length - 1; counter++) {
			int min = counter;
			for (int j = counter + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}

			}
			int temp = arr[counter];
			arr[counter] = arr[min];
			arr[min] = temp;
		}
		return arr[k - 1];
	}

	public static int maxSort(int[] arr, int k) {
		for (int counter = 0; counter < arr.length - 1; counter++) {
			int max = counter;
			for (int j = counter + 1; j < arr.length; j++) {
				if (arr[j] > arr[max]) {
					max = j;
				}

			}
			int temp = arr[counter];
			arr[counter] = arr[max];
			arr[max] = temp;
		}
		return arr[k - 1];
	}

}