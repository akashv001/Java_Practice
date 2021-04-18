package recursion_Questions;

public class print_count_mazepath {

	public static void main(String[] args) {

//		printMazepath(0, 0, 2, 2, "");
		System.out.println(countMazepath(0, 0, 2, 2, ""));
	}

	public static void printMazepath(int cc, int cr, int er, int ec, String ans) {

		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}

		printMazepath(cc + 1, cr, er, ec, ans + "H");
		printMazepath(cc, cr + 1, er, ec, ans + "V");

	}

	public static int countMazepath(int cc, int cr, int er, int ec, String ans) {

		if (cr == er && cc == ec) {
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}

		int count = 0;
		count += countMazepath(cc + 1, cr, er, ec, ans + "H");
		count += countMazepath(cc, cr + 1, er, ec, ans + "V");
		return count;
	}
}
