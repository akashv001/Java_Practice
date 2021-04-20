package codingNinja.String_2d_ArrayQ;

public class reverseStr {

	public static void main(String[] args) {
		String str = "Aerray";
//		ReverseString(str);
		ReverseString2(str);
	}

	public static void ReverseString(String str) {
		char[] arr = new char[str.length()];

		int j = arr.length - 1;
		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);

			if (j >= 0) {
				arr[j] = cc;
				j--;
			}
		}

		System.out.println(String.valueOf(arr));
	}

	public static void ReverseString2(String str) {
		char[] arr = str.toCharArray();
		int i = 0;
		int j = arr.length - 1;

		while (i < j) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			i++;
			j--;
		}

		System.out.println(arr);
	}

}
