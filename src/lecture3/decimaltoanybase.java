package lecture3;

import java.util.Scanner;

public class decimaltoanybase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int snum = s.nextInt();
		int sb = s.nextInt();
		int deci = decimaltoanybase(snum, sb);
		System.out.println(deci);

	}

	public static int decimaltoanybase(int snum, int sb) {
		int ans = 0;
		int multi = 1;
		while (snum != 0) {
			int rem = snum % 5;
			ans = ans + (rem * multi);
			snum = snum / 5;
			multi = multi * sb;
		}
		return ans;

	}

}
