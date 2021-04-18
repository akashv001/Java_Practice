package recursion_Questions;

public class print_Boardpath {

	public static void main(String[] args) {
//		printBoardpath(0, 10, "");
		System.out.println(countBoardpath(0, 10, ""));
	}

	public static void printBoardpath(int curr, int end, String ans) {
		if (curr > end) {
			return;
		}
		if (curr == end) {
			System.out.println(ans);
			return;
		}

		for (int dice = 1; dice <= 6; dice++) {
			printBoardpath(curr + dice, end, ans + dice);
		}

	}

	public static int countBoardpath(int curr, int end, String ans) {
		if (curr > end) {
			return 0;
		}
		if (curr == end) {
			return 1;
		}
		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count += countBoardpath(curr + dice, end, ans + dice);
		}
		return count;

	}

}
