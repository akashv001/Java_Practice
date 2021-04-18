package recursionpractice;

public class firstIndex {

	public static void main(String[] args) {
		int[] arr = { 6, 8, 1, 1, 8, 3, 4 };
		int ans = FirstIndex(arr, 0, 1);
		System.out.println(ans);
	}

	public static int FirstIndex(int[] arr, int si, int data) {
		if (si == arr.length) {
			return -1;
		}
		if (arr[si] == data) {
			return si;
		} else {

			int Firstindex = FirstIndex(arr, si + 1, data);
			return Firstindex;

		}
	}
}