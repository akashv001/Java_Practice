package javacoursePractice.array;

import java.util.Scanner;

public class taking_input_2d_arr {

	public static void main(String[] args) {
		int[][] arr = takeInput();
		display(arr);
	}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows in array");
		int m = s.nextInt();
		System.out.println("Enter the number of cols in array");
		int n = s.nextInt();
		int[][] ans = new int[m][n];

		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[i].length; j++) {
				System.out.println("Enter the value of " + i + j + "th" + " Element");
				ans[i][j] = s.nextInt();
			}
		}
		return ans;

	}

}
