package recursion_Questions;

import java.util.ArrayList;

public class get_boardpath {

	public static void main(String[] args) {
		ArrayList<String> ans = new ArrayList<>();
		ans = getboardpath(0, 10);
		System.out.println(ans);
	}

	public static ArrayList<String> getboardpath(int cr, int er) {
		if (cr > er) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		if (cr == er) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rr = new ArrayList<>();

		for (int dice = 1; dice <= 6; dice++) {
			rr = getboardpath(cr + dice, er);

			for (String rrs : rr) {
				mr.add(dice + rrs);
			}
		}

		return mr;
	}
}
