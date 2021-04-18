package recursionpractice;

public class printmazepath {

	public static void main(String[] args) {
//		printMazepath(0, 0, 2, 2, "");
		int ans = countMazepath(0, 0, 2, 2);
		System.out.println(ans);
		printMazepathdiag(0, 0, 2, 2, "");
		int ans1 = countMazepathdiag(0, 0, 2, 2);
		System.out.println(ans1);
	}

	public static void printMazepath(int cr, int cc, int er, int ec, String ans) {
		if (cr > er || cc > ec) {
			return;
		}
		if (cr == er && cc == ec) {
			System.out.println(ans);
		}

		printMazepath(cr, cc + 1, er, ec, ans + "H");
		printMazepath(cr + 1, cc, er, ec, ans + "V");

	}

	public static int countMazepath(int cr, int cc, int er, int ec) {
		if (cr > er || cc > ec) {
			return 0;
		}
		if (cr == er && cc == ec) {
			return 1;
		}
		int count = 0;
		count += countMazepath(cr, cc + 1, er, ec);
		count += countMazepath(cr + 1, cc, er, ec);
		return count;
	}

	public static void printMazepathdiag(int cr, int cc, int er, int ec, String ans) {
		if (cr > er || cc > ec) {
			return;
		}
		if (cr == er && cc == ec) {
			System.out.println(ans);
		}

		printMazepathdiag(cr, cc + 1, er, ec, ans + "H");
		printMazepathdiag(cr + 1, cc, er, ec, ans + "V");
		printMazepathdiag(cr + 1, cc + 1, er, ec, ans + "D");
	}

	public static int countMazepathdiag(int cr, int cc, int er, int ec) {
		if (cr > er || cc > ec) {
			return 0;
		}
		if (cr == er && cc == ec) {
			return 1;
		}
		int count = 0;
		count += countMazepathdiag(cr, cc + 1, er, ec);
		count += countMazepathdiag(cr + 1, cc, er, ec);
		count += countMazepathdiag(cr + 1, cc + 1, er, ec);

		return count;
	}

}
