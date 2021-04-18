package recursionpractice;

public class max_of_array {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 50, 30, 40 };
		System.out.println(getmax(arr, 0));
	}

	public static int getmax(int[] arr, int idx) {
		if (idx == arr.length - 1) {
			return arr[idx];
		}

		int max = getmax(arr, idx + 1);
		if (max > arr[idx]) {
			return max;
		} else {
			return arr[idx];
		}

	}
}
