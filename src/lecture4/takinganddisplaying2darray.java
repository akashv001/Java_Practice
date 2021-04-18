package lecture4;

import java.util.Scanner;

public class takinganddisplaying2darray {
	public static void main(String[] args) {
		int[][] arr = takeinput();
		display(arr);

	}

	public static int[][] takeinput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int rows = s.nextInt();
		int[][] arr = new int[rows][];
		for (int row = 0; row < rows; row++) {
			System.out.println("Enter the colums for row " + row);
			int cols = s.nextInt();
			arr[row] = new int[cols];
			for (int col = 0; col < cols; col++) {
				System.out.print("Enter the values of row " + row + " and colums " + col);
				arr[row][col] = s.nextInt();
			}
			System.out.println(" ");

		}
		return arr;

	}

	public static void display(int[][] arr) {
		for (int rows = 0; rows < arr.length; rows++) {
			for (int cols = 0; cols < arr[rows].length; cols++) {
				System.out.print(arr[rows][cols]+" ");
			}
			System.out.println(" ");
		}
	}
}
