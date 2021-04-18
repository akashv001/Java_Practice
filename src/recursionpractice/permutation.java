package recursionpractice;

import java.util.ArrayList;

public class permutation {

	public static void main(String[] args) {
		String str = "abc";
		System.out.println(getPermutation(str));
	}

	public static ArrayList<String> getPermutation(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rr = getPermutation(ros);
		for (String rrs : rr) {
			for (int i = 0; i <= rrs.length(); i++) {
				String value = rrs.substring(0, i) + cc + rrs.substring(i);
				mr.add(value);
			}
		}
		return mr;
	}

}
