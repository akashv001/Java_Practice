package lecture6;

public class firstindex {

	public static void main(String[] args) {
		int[] arr = { 6, 8, 1, 1, 8, 3, 4 };
		int p;
		p = firstIndex(arr, 0, 3);
		System.out.println(p);
	}

	public static int firstIndex(int[] arr, int si, int data) {
		if (si == arr.length) {
			return -1;
		}
		if (arr[si] == data) {
			return si;
		}

		int f = firstIndex(arr, si + 1, data);
		return f;
	}

}
