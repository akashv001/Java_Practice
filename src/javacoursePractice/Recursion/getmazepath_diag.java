package javacoursePractice.Recursion;

import java.util.ArrayList;

public class getmazepath_diag {

	public static void main(String[] args) {

		ArrayList<String> ans = new ArrayList<>();
		ans = getMazepathDiag(0, 0, 2, 2);
		System.out.println(ans);

	}

	public static ArrayList<String> getMazepathDiag(int cr, int cc, int er, int ec) {
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
		ArrayList<String> rrd = new ArrayList<>();
		ArrayList<String> mr = new ArrayList<>();

		rrh = getMazepathDiag(cr, cc + 1, er, ec);
		rrv = getMazepathDiag(cr + 1, cc, er, ec);
		rrd = getMazepathDiag(cr + 1, cc + 1, er, ec);

		for (String rrhs : rrh) {
			mr.add("H" + rrhs);
		}

		for (String rrvs : rrv) {
			mr.add("V" + rrvs);
		}

		for (String rrds : rrd) {
			mr.add("D" + rrds);
		}

		return mr;

	}

}