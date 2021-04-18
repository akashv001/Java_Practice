package javacodepractice.recursion;

public class AllIndices {

	public static void main(String[] args) {
		int[] arr = { 3, 8, 1, 8, 8, 4 };
		int[] ans = Allindices(arr, 8, 0, 0);
		display(ans);
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("End");
	}

	public static int[] Allindices(int[] arr, int data, int si, int count) {
		if (si == arr.length) {
			int[] br = new int[count];
			return br;
		}

		int[] mr = null;
		if (arr[si] == data) {
			mr = Allindices(arr, data, si + 1, count + 1);
		} else {
			mr = Allindices(arr, data, si + 1, count);

		}
		if (arr[si] == data) {
			mr[count] = si;
			count--;
		}

		return mr;

	}
}
