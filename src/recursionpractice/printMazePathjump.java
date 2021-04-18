package recursionpractice;

import java.util.Scanner;

public class printMazePathjump {

	public static void main(String[] args) {
		int m, n;
		Scanner s = new Scanner(System.in);
		m = s.nextInt();
		n = s.nextInt();
		printmazePath(1, 1, m, n, "");
	}

	public static void printmazePath(int cr, int cc, int er, int ec, String res) {
		if (cr > er || cc > ec) {
			return;
		}

		if (cr == er && cc == ec) {
			System.out.println(res);
			return;
		}

		for (int i = 1; i <= er - cr; i++) {
			printmazePath(cr, cc + i, er, ec, res + "h" + i);
		}

		for (int i = 1; i <= ec - cc; i++) {
			printmazePath(cr + i, cc, er, ec, res + "v" + i);
		}

		for (int i = 1; i <= er - cr && i <= ec - cc; i++) {
			printmazePath(cr + i, cc + i, er, ec, res + "d" + i);
		}

	}
}
