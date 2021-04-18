package recursionpractice;

public class All_Indices {

	public static void main(String[] args) {
		int[] arr1 = { 3, 8, 1, 8, 8, 4 };
		int[] ans = allIndices(arr1, 0, 8, 0);
		display(ans);

	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] allIndices(int[] arr, int si, int data, int count) {
		if (si == arr.length) {
			int[] arr1 = new int[count];
			return arr1;

		}
//		if (arr[si] == data) {
//			count = count + 1;
//		}
//		int[] indices = allIndices(arr, si + 1, data, count);
//		if (si <= arr.length) {
//			if (arr[si] == data) {
//				indices[count - 1] = si;
//
//			} else {
//				return indices;
//			}
//		}
//		return indices;
		int[] indices = null;
		if (arr[si] == data) {
			indices = allIndices(arr, si + 1, data, count + 1);
		} else {
			indices = allIndices(arr, si + 1, data, count);
		}
		if (arr[si] == data) {
			indices[count] = si;
		}
		return indices;

	}

}
