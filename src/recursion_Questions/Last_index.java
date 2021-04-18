package recursion_Questions;

public class Last_index {

	public static void main(String[] args) {
		int[] arr = { 6, 8, 1, 1, 8, 3, 4 };
		System.out.println(LastIndex(arr, 0, 8));
	}

	public static int LastIndex(int[] arr, int si, int data) {

		if (si == arr.length) {
			return -1;
		}

		int index = LastIndex(arr, si + 1, data);

		if (index == -1) {
			if (arr[si] == data) {
				return si;
			} else {
				return -1;
			}
		}

		return index;

	}
}
