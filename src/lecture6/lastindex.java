package lecture6;

public class lastindex {

	public static void main(String[] args) {
		int[] p = { 3, 8, 1, 8, 8, 7, 3 };
		int a = lastindex(p, 0, 8);
		System.out.println(a);
	}

	public static int lastindex(int[] arr, int si, int data) {
		if (si == arr.length) {
			return -1;
		}
		int index = lastindex(arr, si + 1, data);
		if (index == -1) {
			if (arr[si] == data) {
				return si;
			} else {
				return -1;
			}
		} else {
			return index;
		}

	}

}
