package recursionpractice;

import java.util.ArrayList;

public class get_stair_path {

	public static void main(String[] args) {
//		ArrayList<String> ans = new ArrayList<>();
//		ans = getsStairPath(4, 0);
//		System.out.println(ans);
		
		printStairpath(4,0,"");
	}

	public static ArrayList<String> getsStairPath(int cl, int el) {

		if (cl == el) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		if (el > cl) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rr = new ArrayList<>();

		for (int i = 1; i <= 3; i++) {
			rr = getsStairPath(cl - i, el);
			for (String rrs : rr) {
				mr.add(rrs + i);
			}
		}

		return mr;

	}

	public static void printStairpath(int cl, int el, String res) {
		if (cl == el) {
			System.out.println(res);
			return;
		}

		if (cl < el) {
			return;
		}

		for (int i = 1; i <= 3; i++) {
			printStairpath(cl - i, el, res + i);
		}

	}
}
