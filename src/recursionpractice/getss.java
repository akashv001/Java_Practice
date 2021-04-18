package recursionpractice;

import java.util.ArrayList;

public class getss {

	public static void main(String[] args) {
		String str = "abc";
		System.out.println(getSs(str));
	}

	public static ArrayList<String> getSs(String str) {
		if (str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> myResult = new ArrayList<>();
		ArrayList<String> recResult = getSs(ros);
		for (int i = 0; i < recResult.size(); i++) {
			myResult.add(recResult.get(i));
			myResult.add(cc + recResult.get(i));
		}
		return myResult;

	}

}
