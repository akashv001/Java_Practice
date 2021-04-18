package recursionn;

import java.util.ArrayList;

public class getBoardPath {

	public static void main(String[] args) {

		System.out.println(getBoardpath(0, 10));

	}

	public static ArrayList<String> getBoardpath(int start, int end) {

		if (start == end) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		if (start > end) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();

		for (int dice = 1; dice <= 6; dice++) {
			ArrayList<String> rr = getBoardpath(start + dice, end);

			for (String rrs : rr) {
				mr.add(dice + rrs);
			}
		}

		return mr;
	}
}
