package javacoursePractice.Lecture1;

import java.util.Scanner;

public class prime_no {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		isPrime(n);

	}

	public static void isPrime(int n) {
		boolean flag = true;

		for (int i = 2; i < n - 1; i++) {
			if (n % i == 0) {
				flag = false;
			}
		}

		if (flag == true) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		}
	}

}
