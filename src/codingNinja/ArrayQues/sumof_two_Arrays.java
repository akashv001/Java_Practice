package codingNinja.ArrayQues;

public class sumof_two_Arrays {

	public static void main(String[] args) {
		int[] arr1 = { 2, 9, 9 };
		int[] arr2 = { 7, 8, 5 };
		int[] ans = SumOfTwoArrays(arr1, arr2);
		display(ans);
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] SumOfTwoArrays(int[] arr1, int[] arr2) {
		int[] temp = new int[arr1.length + 1];

		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int k = temp.length - 1;
		int carry = 0;

		while (i >= 0 && j >= 0 && k >= 0) {
			int sum = arr1[i] + arr2[j] + carry;
			temp[k] = sum % 10;
			carry = sum / 10;
			i--;
			j--;
			k--;
		}

		while (i < 0 && j >= 0) {
			int sum = arr2[j] + carry;
			temp[k] = sum % 10;
			carry = sum / 10;
			j--;
			k--;
		}

		while (j < 0 && i >= 0) {
			int sum = arr1[i] + carry;
			temp[k] = sum % 10;
			carry = sum / 10;
			i--;
			k--;
		}

		if (carry == 1) {
			temp[k] = 1;
		} else {
			temp[k] = 0;
		}

		return temp;

	}

}