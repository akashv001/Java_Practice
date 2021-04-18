package recursionpractice;

public class countnquuen {

	public static void main(String[] args) {
		boolean[][] board = new boolean[4][4];
//		int ans = countNqueens(board, 0);
//		System.out.println(ans);
		printNqueens(board, 0, "");
	}

	public static int countNqueens(boolean[][] board, int row) {
		if (row == board.length) {
			return 1;
		}
		int count = 0;
		for (int col = 0; col < board[row].length; col++) {
			if (isItSafe(board, row, col)) {
				board[row][col] = true;
				count += countNqueens(board, row + 1);
				board[row][col] = false;
			}
		}
		return count;
	}

	public static void printNqueens(boolean[][] board, int row, String result) {
		if (row == board.length) {
			System.out.println(result);
			return;
		}

		for (int col = 0; col < board[row].length; col++) {
			if (isItSafe(board, row, col)) {
				board[row][col] = true;
				printNqueens(board, row + 1, result + "{" + (row + 1) + "-" + (col + 1) + "}" + ";");
				board[row][col] = false;
			}

		}
	}

	private static boolean isItSafe(boolean[][] board, int row, int col) {
		for (int i = row; i >= 0; i--) {
			if (board[i][col]) {
				return false;
			}
		}
		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j]) {
				return false;
			}
		}
		for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
			if (board[i][j]) {
				return false;
			}
		}
		return true;

	}

}
