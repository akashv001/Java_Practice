package recursionpractice;

public class printsubsequences {

	public static void main(String[] args) {
//		printsubSequences("abc", "");
		printPermutation("abc" , "");
	}

	public static void printsubSequences(String str, String result) {
		if (str.length() == 0) {
			System.out.print(result + " ");
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		printsubSequences(ros, result);
		printsubSequences(ros, result + cc);
	}

	public static void printPermutation(String str, String result) {
		if (str.length() == 0) {
			System.out.print(result+" ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			printPermutation(ros, result + cc);
		}
	}
}
