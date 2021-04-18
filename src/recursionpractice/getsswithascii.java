package recursionpractice;

import java.util.ArrayList;

public class getsswithascii {
	public static void main(String[] args) {
		String str = "abc";
		System.out.println(getSsAscii(str));
	}

	public static ArrayList<String> getSsAscii(String str) {
		if (str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		int cc1 = cc;

		ArrayList<String> myResult = new ArrayList<>();
		ArrayList<String> recResult = getSsAscii(ros);

		for (int i = 0; i < str.length(); i++) {
			myResult.add(recResult.get(i));
			myResult.add(cc + recResult.get(i));
			myResult.add(cc1 + recResult.get(i));
		}
		return myResult;

	}

}
