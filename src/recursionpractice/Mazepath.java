package recursionpractice;

import java.util.ArrayList;

public class Mazepath {

	public static void main(String[] args) {
		System.out.println(getMazepath(0, 0, 2, 2));
	}

	public static ArrayList<String> getMazepath(int cr, int cc, int er, int ec) {
		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			return br;

		}

		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rrh = getMazepath(cr, cc + 1, er, ec);
		ArrayList<String> rrv = getMazepath(cr + 1, cc, er, ec);
		ArrayList<String> rrd = getMazepath(cr + 1, cc + 1, er, ec);

		for (String rrhs : rrh) {
			mr.add("H" + rrhs);
		}

		for (String rrvs : rrv) {
			mr.add("V" + rrvs);
		}

		for (String rrvd : rrd) {
			mr.add("D" + rrvd);
		}

		return mr;

	}

}
