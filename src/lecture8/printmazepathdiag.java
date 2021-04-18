package lecture8;

public class printmazepathdiag {

	public static void main(String[] args) {
		printMazepathdiag(0, 0, 2, 2, "");

	}

	public static void printMazepathdiag(int cr, int cc, int er, int ec, String str) {
		if (cr == er && cc == ec) {
			System.out.println(str);
		}

		if (cr > er || cc > ec) {
			return;
		}

		printMazepathdiag(cr, cc + 1, er, ec, str + "H");
		printMazepathdiag(cr + 1, cc, er, ec, str + "V");
		printMazepathdiag(cr + 1, cc + 1, er, ec, str + "D");
	}

}
