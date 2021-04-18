package recursion_Questions;

import java.util.ArrayList;

public class get_Mazepath {

	public static void main(String[] args) {
		ArrayList<String> ans = new ArrayList<>();
//		ans = getBoardpath(0, 0, 2, 2);
		ans = getBoardpathdiag(0, 0, 2, 2);
		System.out.println(ans);
	}

	public static ArrayList<String> getBoardpath(int cr, int cc, int er, int ec) {

		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		if (cc == ec && cr == er) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		ArrayList<String> rrh = new ArrayList<>();
		ArrayList<String> rrv = new ArrayList<>();

		rrh = getBoardpath(cr, cc + 1, er, ec);
		rrv = getBoardpath(cr + 1, cc, er, ec);

		ArrayList<String> mr = new ArrayList<>();
		for (String rrhs : rrh) {
			mr.add(rrhs + "H");
		}
		for (String rrhs : rrv) {
			mr.add(rrhs + "V");
		}

		return mr;
	}

	public static ArrayList<String> getBoardpathdiag(int cr, int cc, int er, int ec) {

		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		if (cc == ec && cr == er) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		ArrayList<String> rrh = new ArrayList<>();
		ArrayList<String> rrv = new ArrayList<>();
		ArrayList<String> rrd = new ArrayList<>();

		rrh = getBoardpathdiag(cr, cc + 1, er, ec);
		rrv = getBoardpathdiag(cr + 1, cc, er, ec);
		rrd = getBoardpathdiag(cr + 1, cc + 1, er, ec);

		ArrayList<String> mr = new ArrayList<>();
		for (String rrhs : rrh) {
			mr.add(rrhs + "H");
		}
		for (String rrhs : rrv) {
			mr.add(rrhs + "V");
		}
		for (String rrhs : rrd) {
			mr.add(rrhs + "D");
		}

		return mr;
	}
}
