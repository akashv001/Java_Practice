package javacoursePractice.Lecture2;

import java.util.Scanner;

public class taking_all_input_from_user_in_2d_array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number of rows in array");
		int m=s.nextInt();
		
		int [][] arr=new int[m][];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the number of cols in array for row "+(i+1));
			int n=s.nextInt();
			
			arr[i]=new int[n];
			
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the values of element for the cols "+(j+1));
			    arr[i][j]=s.nextInt();
			}
				
		}
		// 2 2 1 2 3 4
		display(arr);
	}
	
	public static void display(int [][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
