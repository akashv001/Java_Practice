package javacoursePractice.Lecture1;

import java.util.Scanner;

public class fibonaaci {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		fibonaaci(n);

	}

	public static void fibonaaci(int n) {
		int a = 0;
		int b = 1;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			System.out.println(a);
			sum = a + b;
			a = b;
			b = sum;
		}
	}

}
