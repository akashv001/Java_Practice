package codingNinja.String_2d_ArrayQ;

public class find_length_of_String {

	public static void main(String[] args) {
		String str = "akash";
//		LengthOfString1(str);

		char[] arr = str.toCharArray();
		int ans = LengthOfString2(arr);
		System.out.println(ans);

	}

	public static void LengthOfString1(String str) {
		System.out.println(str.length());
	}
	

	public static int LengthOfString2(char[] arr) {
		int cnt = 0;

		for (int i = 0; i < arr.length && arr[i] != '\0'; i++) {
			cnt++;
		}

		return cnt;
	}

}
