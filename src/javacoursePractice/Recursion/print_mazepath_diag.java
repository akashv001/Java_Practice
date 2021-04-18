package javacoursePractice.Recursion;

public class print_mazepath_diag {

	public static void main(String[] args) {
		printMazepathDiag(0, 0, 2, 2, "");
	}

	public static void printMazepathDiag(int cr, int cc, int er, int ec, String result) {
		if (cr == er && cc == ec) {
			System.out.print(result+" ");
			return;
		}

		if (cr > er || cc > ec) {
			return;
		}

		printMazepathDiag(cr, cc + 1, er, ec, result + "H");
		printMazepathDiag(cr + 1, cc, er, ec, result + "V");
		printMazepathDiag(cr + 1, cc + 1, er, ec, result + "D");

	}

}
