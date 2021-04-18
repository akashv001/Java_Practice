package recursionn;

public class printBoardp {

	public static void main(String[] args) {

//		printBoardpath(0, 10, "");
		int ans = countBoardpath(0, 10);
		System.out.println(ans);
	}

	public static void printBoardpath(int curr, int end, String res) {
		if (curr == end) {
			System.out.print(res + " ");
			return;
		}

		if (curr > end) {
			return;
		}

		for (int dice = 1; dice <= 6; dice++) {
			printBoardpath(curr + dice, end, res + dice);
		}
	}

	public static int countBoardpath(int curr, int end) {
		if (curr == end) {
			return 1;
		}

		if (curr > end) {
			return 0;
		}

		int count = 0;

		for (int dice = 1; dice <= 6; dice++) {
			count += countBoardpath(curr + dice, end);
		}

		return count;
	}

}