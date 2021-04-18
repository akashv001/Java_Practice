package lecture3;

import java.util.Scanner;

public class arrayops {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
//		int[] arr = takeinput();
//		display(arr);
		int[] arr= {10,20,30,40,50};
		System.out.println("*********");
		System.out.println(maxInarray(arr));
	}

	public static int[] takeinput() {
		System.out.println("what is the size of the array ?");
		int n = s.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the value of " + i + " index");
			arr[i] = s.nextInt();
		}
		return arr;

	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int maxInarray (int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] > max) {
				max = arr[i];
			}
//			else {
//				System.out.println(max);
			
			
		}
		return max;
	}
}