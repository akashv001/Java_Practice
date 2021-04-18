package recursionpractice;

import java.util.Scanner;

public class Knights_tour {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = s.nextInt();
		int col = s.nextInt();

		int[][] chess = new int[n][n];
		KnightTour(chess, row, col, 1);
		System.out.println("****************");
		System.out.println(KnightTours(chess, row, col, 1));
	}

	public static void displayBoard(int[][] chess) {
		for (int i = 0; i < chess.length; i++) {
			for (int j = 0; j < chess[0].length; j++) {
				System.out.print(chess[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
	}

	public static void KnightTour(int[][] chess, int row, int col, int move) {
		if (row < 0 || col < 0 || row >= chess.length || col >= chess.length || chess[row][col] > 0) {
			return;
		} else if (move == chess.length * chess.length) {
			chess[row][col] = move;
			displayBoard(chess);
			chess[row][col] = 0;
			return;
		}

		chess[row][col] = move;
		KnightTour(chess, row - 2, col + 1, move + 1);
		KnightTour(chess, row - 1, col + 2, move + 1);
		KnightTour(chess, row + 1, col + 2, move + 1);
		KnightTour(chess, row + 2, col + 1, move + 1);
		KnightTour(chess, row + 2, col - 1, move + 1);
		KnightTour(chess, row + 1, col - 2, move + 1);
		KnightTour(chess, row - 1, col - 2, move + 1);
		KnightTour(chess, row - 2, col - 1, move + 1);
		chess[row][col] = 0;
	}
	
	public static int KnightTours(int[][] chess, int row, int col, int move) {
		if (row < 0 || col < 0 || row >= chess.length || col >= chess.length || chess[row][col] > 0) {
			return 0;
		} else if (move == chess.length * chess.length) {
			return 1;
		}
        
		int count=0;
		chess[row][col] = move;
		count+=KnightTours(chess, row - 2, col + 1, move + 1);
		count+=KnightTours(chess, row - 1, col + 2, move + 1);
		count+=KnightTours(chess, row + 1, col + 2, move + 1);
		count+=KnightTours(chess, row + 2, col + 1, move + 1);
		count+=KnightTours(chess, row + 2, col - 1, move + 1);
		count+=KnightTours(chess, row + 1, col - 2, move + 1);
		count+=KnightTours(chess, row - 1, col - 2, move + 1);
		count+=KnightTours(chess, row - 2, col - 1, move + 1);
		chess[row][col] = 0;
		
		return count;
	}

}
