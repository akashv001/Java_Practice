package recursionn;

import java.util.ArrayList;

public class getPermutation {

	public static void main(String[] args) {

		System.out.println(getP("abc"));

	}

	public static ArrayList<String> getP(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rr = new ArrayList<>();
		ArrayList<String> mr = new ArrayList<>();

		rr = getP(ros);

		for (String rrs : rr) {
			for (int i = 0; i <= rrs.length(); i++) {
				String ans = rrs.substring(0, i) + cc + rrs.substring(i);
				mr.add(ans);
			}
		}

		return mr;

	}

}
