package lecture3;

public class insertionsort {

	public static void main(String[] args) {
		int[] arr = { 99,88,77,66,55 };
		insertionsort(arr);
		display(arr);

	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void insertionsort(int[] arr) {
		for (int counter = 1; counter <= arr.length-1; counter++) {
			int val = arr[counter];
			int j = counter - 1;
			while (j>=0 && arr[j] > val) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = val;
		}
	}

}
