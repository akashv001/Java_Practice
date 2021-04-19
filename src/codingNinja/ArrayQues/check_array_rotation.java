package codingNinja.ArrayQues;

public class check_array_rotation {

	public static void main(String[] args) {
		int[] arr = { 5, 6, 1, 2, 3, 4 };
//		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int ans = checkArrayRotation(arr);
		System.out.println(ans);
	}

	public static int checkArrayRotation(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return i + 1;
			}
		}
		return 0;
	}

}