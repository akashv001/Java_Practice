package recursionpractice;

public class printBoardpath {

	public static void main(String[] args) {
//		printboardpath(0, 10, "");
		int ans = countboardpath(0, 10, "");
		System.out.println(ans);
	}

	public static void printboardpath(int curr, int end, String ans) {
		if (curr > end) {
			return;
		}

		if (curr == end) {
			System.out.println(ans + " ");
			return;
		}

		for (int dice = 1; dice <= 6; dice++) {
			printboardpath(curr + dice, end, ans + dice);

		}
	}

	public static int countboardpath(int curr, int end, String ans) {
		if (curr > end) {
			return 0;
		}

		if (curr == end) {
//			System.out.println(ans + " ");
			return 1;
		}
		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count += countboardpath(curr + dice, end, ans + dice);

		}
		return count;
	}
}