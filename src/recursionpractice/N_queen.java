package recursionpractice;

import java.util.Scanner;

public class N_queen {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][] chess = new int[n][n];
		printNqueens(chess, "", 0);
	}

	public static void printNqueens(int[][] chess, String qsf, int row) {
		if (row == chess.length) {
			System.out.println(qsf);
			return;
		}
		for (int col = 0; col < chess.length; col++) {
			if (isItSafeplaceforQueen(chess, row, col) == true) {
				chess[row][col] = 1;
				printNqueens(chess, qsf + row + "-" + col + ",", row + 1);
				chess[row][col] = 0;
			}
		}
	}

	public static boolean isItSafeplaceforQueen(int[][] chess, int row, int col) {
		for (int i = row - 1, j = col; i >= 0; i--) {
			if (chess[i][j] == 1) {
				return false;
			}
		}

		for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
			if (chess[i][j] == 1) {
				return false;
			}
		}

		for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
			if (chess[i][j] == 1) {
				return false;
			}
		}
		return true;

	}

}