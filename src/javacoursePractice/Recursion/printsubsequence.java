package javacoursePractice.Recursion;

public class printsubsequence {

	public static void main(String[] args) {
		printSubsequences("abc", "");
	}

	public static void printSubsequences(String str, String result) {
		if (str.length() == 0) {
			System.out.print(result+" ");
			return;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);

		printSubsequences(ros, result);
		printSubsequences(ros, result + cc);
	}

}
