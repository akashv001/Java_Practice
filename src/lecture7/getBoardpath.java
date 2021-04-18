package lecture7;

import java.util.ArrayList;

public class getBoardpath {

	public static void main(String[] args) {
		System.out.println(getboardpath(0, 10));
	}

	public static ArrayList<String> getboardpath(int curr, int end) {
		if (curr == end) {
			ArrayList<String> br = new ArrayList<>();
			br.add(" \n");
			return br;
		}
		if (curr > end) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();
		for (int dice = 1; dice <= 6; dice++) {
			ArrayList<String> rr = getboardpath(curr + dice, end);

			for (String rrs : rr) {
				mr.add(dice + rrs);
			}
		}
		return mr;

	}
}