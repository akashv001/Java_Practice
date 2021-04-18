package javacoursePractice.Recursion;

import java.util.ArrayList;

public class getBoardpath1 {

	public static void main(String[] args) {
		ArrayList<String> ans = new ArrayList<>();
		ans = getBoardpath(0, 10);
		System.out.println(ans);
	}

	public static ArrayList<String> getBoardpath(int curr, int end) {
		if (curr == end) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		if (curr > end) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();

		for (int dice = 1; dice <= 6; dice++) {
			ArrayList<String> rr = getBoardpath(curr + dice, end);

			for (String rrs : rr) {
				mr.add(dice + rrs);
			}
		}

		return mr;

	}

}
