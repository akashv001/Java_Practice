package javacoursePractice.Recursion;

public class AllIndices {

	public static void main(String[] args) {
		int[] arr = { 3, 8, 1, 8, 8, 4 };
		int[] ans = allIndices(arr, 0, 8, 0);
		display(ans);
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] allIndices(int[] arr, int si, int data, int count) {
		if (si == arr.length) {
			int[] res = new int[count];
			return res;
		}

		int[] ans;
		if (arr[si] == data) {
			ans = allIndices(arr, si + 1, data, count + 1);
		} else {
			ans = allIndices(arr, si + 1, data, count);
		}

		if (arr[si] == data) {
			ans[count] = si;
			count--;
		}

		return ans;
	}

}