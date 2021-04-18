package recursionpractice;

public class lastIndex {

	public static void main(String[] args) {
		int[] arr = { 6, 8, 1, 4, 8, 8, 3, 4 };
		int ans = LastIndex(arr, 0, 8);
		System.out.println(ans);
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
