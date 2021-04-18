package javacoursePractice.Recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans = fact(n);
		System.out.println(ans);
	}

	public static int fact(int n) {
		if (n == 1) {
			return 1;
		}
		int fact = 0;
		fact = n * fact(n - 1);
		return fact;
	}

}
