package javacoursePractice.Lecture1;

import java.util.Scanner;

public class Array_ops {

	public static void main(String[] args) {
		int[] arr = takeInput();
		display(arr);

	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("End");
	}

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array?");
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the value for the index " + i);
			arr[i] = s.nextInt();
		}
		return arr;
	}

}
