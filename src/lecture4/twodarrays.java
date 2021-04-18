package lecture4;

import java.util.Scanner;

public class twodarrays {
	static Scanner s=new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
//		int[][]arr;
		System.out.println(arr);
		display(arr);
//		arr[0][2] = 30;
//		arr[2][1] = 10;
		System.out.println("*************");
		inputvalues(arr);
		display(arr);
		System.out.print(arr);

	}
	public static void inputvalues(int[][]arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("enter the values of index "+j );
				 arr[i][j]=s.nextInt();
			}	
	}}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
