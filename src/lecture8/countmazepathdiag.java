package lecture8;

public class countmazepathdiag {

	public static void main(String[] args) {
		System.out.println(countMazepathdiag(0, 0, 2, 2));
	}

	public static int countMazepathdiag(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}

		int a = +countMazepathdiag(cr, cc + 1, er, ec);
		int b = +countMazepathdiag(cr + 1, cc, er, ec);
		int c = +countMazepathdiag(cr + 1, cc + 1, er, ec);
		int count = a + b + c;

		return count;
	}

}
