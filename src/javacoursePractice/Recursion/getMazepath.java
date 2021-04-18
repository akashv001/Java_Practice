package javacoursePractice.Recursion;

import java.util.ArrayList;

public class getMazepath {

	public static void main(String[] args) {

		ArrayList<String> ans = new ArrayList<>();
		ans = getMazepath1(0, 0, 2, 2);
		System.out.println(ans);
	}

	public static ArrayList<String> getMazepath1(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		ArrayList<String> rrh = new ArrayList<>();
		ArrayList<String> rrv = new ArrayList<>();
		ArrayList<String> mr = new ArrayList<>();

		rrh = getMazepath1(cr, cc + 1, er, ec);
		rrv = getMazepath1(cr + 1, cc, er, ec);

		for (String rrhs : rrh) {
			mr.add("H" + rrhs);
		}

		for (String rrvs : rrv) {
			mr.add("V" + rrvs);
		}

		return mr;

	}

}
