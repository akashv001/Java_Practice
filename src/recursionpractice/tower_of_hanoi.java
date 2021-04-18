package recursionpractice;

import java.util.Scanner;

public class tower_of_hanoi {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int s = scn.nextInt();
		int d = scn.nextInt();
		int h = scn.nextInt();
		toh(n, s, d, h);
	}

	public static void toh(int n, int s, int d, int h) {
		if (n == 0) {
			return;
		}

		toh(n - 1, s, h, d);
		System.out.println(n + "[" + s + "=>" + d + "]");
		toh(n - 1, h, d, s);
	}

}
