package codingNinja.ArrayQues;

public class sort_0_1_2 {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 0, 2, 0, 0, 1, 2, 1, 0, 1, 2, 0 };
		// 0, 1, 2, 0, 2, 0, 0, 1, 2, 1
//		int[] ans = Sort_0_1_2_method1(arr);
//		int[] ans = Sort_0_1_2_method2(arr);
		Sort_0_1_2_method3(arr);
		display(arr);
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] Sort_0_1_2_method1(int[] arr) {
//		int[] arr = { 0, 1, 2, 0, 2, 0, 1 };

		int[] temp = new int[arr.length];

		int nz = 0;
		int nt = arr.length - 1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				temp[nz] = arr[i];
				nz++;
			} else if (arr[i] == 2) {
				temp[nt] = arr[i];
				nt--;
			}
		}

		for (int i = nz; i <= nt; i++) {
			temp[i] = 1;
		}

		arr = temp;
		return arr;

	}

	public static int[] Sort_0_1_2_method2(int[] arr) {
		int i, cnt0 = 0, cnt1 = 0, cnt2 = 0;

		for (i = 0; i < arr.length; i++) {
			switch (arr[i]) {
			case 0:
				cnt0++;
				break;

			case 1:
				cnt1++;
				break;

			case 2:
				cnt2++;
				break;

			}
		}

		i = 0;

		while (cnt0 > 0) {
			arr[i] = 0;
			i++;
			cnt0--;
		}

		while (cnt1 > 0) {
			arr[i] = 1;
			i++;
			cnt1--;
		}

		while (cnt2 > 0) {
			arr[i] = 2;
			i++;
			cnt2--;
		}

		return arr;

	}

	public static void Sort_0_1_2_method3(int[] arr) {

		int i = 0, nz = 0, nt = arr.length - 1;

		while (i < arr.length && i <= nt) {
			if (arr[i] == 0) {
				int temp = arr[i];
				arr[i] = arr[nz];
				arr[nz] = temp;
				i++;
				nz++;
			} else if (arr[i] == 2) {
				int temp = arr[i];
				arr[i] = arr[nt];
				arr[nt] = temp;
				nt--;
			} else {
				i++;
			}
		}
	}

}