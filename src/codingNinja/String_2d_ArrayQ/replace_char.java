package codingNinja.String_2d_ArrayQ;

public class replace_char {

	public static void main(String[] args) {
		String str = "rahul";
		char c1 = 't', c2 = 'h';
//		ReplaceChar1(str, c1, c2);
		ReplaceChar2(str, c1, c2);

	}

	public static void ReplaceChar1(String str, char c1, char c2) {
		String s = str.replace(c2, c1);
		System.out.println(s);
	}

	public static void ReplaceChar2(String str, char c1, char c2) {
		char[] arr = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == c2) {
				arr[i] = c1;
			} else if (arr[i] == c1) {
				arr[i] = c2;
			}
		}

		System.out.println(arr);
	}

}
