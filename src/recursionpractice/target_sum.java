package recursionpractice;

public class target_sum {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 50, 30, 50 };
		targetsum(arr, 0, "", 0, 70);
	}

	public static void targetsum(int[] arr, int idx, String set, int sos, int tar) {
		if (idx == arr.length - 1) {
			if (sos == tar) {
				System.out.println(sos);
			}
			return;
		}

		targetsum(arr, idx + 1, set + arr[idx] + ",", sos + arr[idx], tar);
		targetsum(arr, idx + 1, set, sos, tar);
	}
}
