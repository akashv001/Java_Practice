package javacoursePractice.Recursion;

import java.util.ArrayList;

public class getSubsequences {

	public static void main(String[] args) {
		String str = "abc";
		ArrayList<String> ans = new ArrayList<>();
		ans = getSS(str);
		System.out.println(ans);

	}

	public static ArrayList<String> getSS(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rr = new ArrayList<>();
		ArrayList<String> mr = new ArrayList<>();

		rr = getSS(ros);

		for (String rrs : rr) {
			mr.add(rrs);
			mr.add(cc + rrs);

		}

		return mr;
	}

}