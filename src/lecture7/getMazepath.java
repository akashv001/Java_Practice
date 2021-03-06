package lecture7;

import java.util.ArrayList;

public class getMazepath {

	public static void main(String[] args) {
		System.out.println(getMazepath(0, 0, 2, 2));
	}

	public static ArrayList<String> getMazepath(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rrh = getMazepath(cr, cc + 1, er, ec);
		for (String rrhs : rrh) {
			mr.add("H" + rrhs);
		}
		ArrayList<String> rrv = getMazepath(cr + 1, cc, er, ec);
		for (String rrvs : rrv) {
			mr.add("V" + rrvs);
		}
		return mr;

	}

}
