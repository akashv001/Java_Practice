package javacoursePractice.Recursion;

public class printboardpath {

	public static void main(String[] args) {
//		printBoardpath(0, 10, "");
		int ans = countBoardpath(0, 10);
		System.out.println(ans);
	}

	public static void printBoardpath(int cur, int end, String result) {
		if (cur == end) {
			System.out.println(result);
			return;
		}

		if (cur > end) {
			return;
		}

		for (int dice = 1; dice <= 6; dice++) {
			printBoardpath(cur + dice, end, result + dice);
		}
	}

	public static int countBoardpath(int cur, int end) {
		if (cur == end) {
			return 1;
		}

		if (cur > end) {
			return 0;
		}

		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count += countBoardpath(cur + dice, end);
		}

		return count;
	}
}