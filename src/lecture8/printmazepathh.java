package lecture8;

public class printmazepathh {

	public static void main(String[] args) {
		printMazepath(0, 0, 2, 2, "");
	}

	public static void printMazepath(int cr, int cc, int er, int ec, String str) {
		if (cr == er && cc == ec) {
			System.out.println(str);
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}
		printMazepath(cr, cc + 1, er, ec, str + "H");
		printMazepath(cr + 1, cc, er, ec, str + "V");
		

	}
}
