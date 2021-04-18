package lecture8;

public class printboardpath {

	public static void main(String[] args) {
		printBoardpath(0, 10, "");

	}

	public static void printBoardpath(int curr, int end, String ans) {
		if (curr == end) {
			System.out.println(ans);
			return;
		}
		if (curr > end) {
			return;
		}

		for (int dice = 1; dice <= 6; dice++) {
			printBoardpath(curr + dice, end, ans + dice);
		
		}
	}

}
