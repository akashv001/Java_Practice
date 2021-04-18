package lecture8;

public class countMazepath {

	public static void main(String[] args) {

		System.out.println(printMazepath(0, 0, 2, 2));
	}

	public static int printMazepath(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}
//		int count=0;
//		count+=printMazepath(cr, cc + 1, er, ec);
//		count+=printMazepath(cr + 1, cc, er, ec);
		int ch=printMazepath(cr, cc + 1, er, ec);
		int cv=printMazepath(cr + 1, cc, er, ec);
	    int total=ch+cv;
		return total;

	}
}
