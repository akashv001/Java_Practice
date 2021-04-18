package recursion_Questions;

public class Print_Count_mazepathDiag {

	public static void main(String[] args) {

		printMazepathdiag(0, 0, 2, 2, "");
		System.out.println(countMazepathdiag(0, 0, 2, 2, ""));
	}

	public static void printMazepathdiag(int cc, int cr, int er, int ec, String ans) {

		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}

		printMazepathdiag(cc + 1, cr, er, ec, ans + "H");
		printMazepathdiag(cc, cr + 1, er, ec, ans + "V");
		printMazepathdiag(cc + 1, cr + 1, er, ec, ans + "D");

	}

	public static int countMazepathdiag(int cc, int cr, int er, int ec, String ans) {

		if (cr == er && cc == ec) {
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}

		int count = 0;
		count += countMazepathdiag(cc + 1, cr, er, ec, ans + "H");
		count += countMazepathdiag(cc, cr + 1, er, ec, ans + "V");
		count += countMazepathdiag(cc + 1, cr + 1, er, ec, ans + "D");
		return count;
	}
}
