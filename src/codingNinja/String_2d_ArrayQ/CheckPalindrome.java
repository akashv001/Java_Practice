package codingNinja.String_2d_ArrayQ;

public class CheckPalindrome {

	public static void main(String[] args) {
		String str = "malayalam";
//		isPalindrome1(str);

		char[] arr = str.toCharArray();
		Boolean ans = isPalindrome2(arr);
		System.out.println(ans);
	}

	public static void isPalindrome1(String str) {
		StringBuilder revString = new StringBuilder();

		for (int i = str.length() - 1; i >= 0; i--) {
			char cc = str.charAt(i);

			revString.append(cc);
		}

		String ans = revString.toString();

		System.out.println(ans.equals(str));
	}

	public static boolean isPalindrome2(char[] arr) {
		int n = arr.length;
		for (int i = 0, j = n - 1; i < n && j >= 0; i++, j--) {
			if (arr[i] != arr[j]) {
				return false;
			}
		}
		return true;
	}

}
