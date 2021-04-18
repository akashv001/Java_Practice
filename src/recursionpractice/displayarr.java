package recursionpractice;

public class displayarr {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
//		display(arr, 0);
		displayRev(arr, 0);
	}

	public static void display(int[] arr, int idx) {
		if (idx == arr.length) {
			return;
		}

		System.out.println(arr[idx]);
		display(arr, idx + 1);

	}

	public static void displayRev(int[] arr, int idx) {
		if (idx == arr.length) {
			return;
		}

		displayRev(arr, idx + 1);
		System.out.println(arr[idx]);

	}

}
