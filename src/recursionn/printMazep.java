package recursionn;

public class printMazep {

	public static void main(String[] args) {

//		printMazepath(0, 0, 2, 2, "");
		int ans = countMazepathdiag(0, 0, 2, 2);
		System.out.println(ans);

	}

	public static void printMazepath(int cr, int cc, int er, int ec, String res) {

		if (cr == er && cc == ec) {
			System.out.print(res + " ");
			return;
		}

		if (cr > er || cc > ec) {
			return;
		}

		printMazepath(cr + 1, cc, er, ec, res + "V");
		printMazepath(cr, cc + 1, er, ec, res + "H");
		printMazepath(cr + 1, cc + 1, er, ec, res + "D");
	}

	public static int countMazepathdiag(int cr, int cc, int er, int ec) {

		if (cr == er && cc == ec) {
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}

		int count = 0;
		count += countMazepathdiag(cr + 1, cc, er, ec);
		count += countMazepathdiag(cr, cc + 1, er, ec);
		count += countMazepathdiag(cr + 1, cc + 1, er, ec);

		return count;
	}

}
