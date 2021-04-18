package javacoursePractice.Recursion;

public class printMazepath {

	public static void main(String[] args) {
//		PrintMazepath(0, 0, 2, 2, "");
		int ans=countMazepath(0, 0, 2, 2);
		System.out.println(ans);
	}

	public static void PrintMazepath(int cr, int cc, int er, int ec, String result) {
		if (cr == er && cc == ec) {
			System.out.println(result);
			return;
		}

		if (cr > er || cc > ec) {
			return;
		}

		PrintMazepath(cr, cc + 1, er, ec, result + "H");
		PrintMazepath(cr + 1, cc, er, ec, result + "V");

	}

	public static int countMazepath(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}

		int count = 0;
		count += countMazepath(cr, cc + 1, er, ec);
		count += countMazepath(cr + 1, cc, er, ec);
		return count;
	}
}
