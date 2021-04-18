package march_practice.basic_java_pgm;

import java.util.Scanner;

public class check_prime {

	public static void main(String[] args) {
		System.out.println("Enter the number of which you want to check the prime or not?");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean ans = checkPrime(n);
		System.out.println(ans);

	}

	public static boolean checkPrime(int n) {
		boolean ans = true;
		for (int i = 2; i <= n - 1; i++) {
			if (n % i == 0) {
				ans = false;
				break;
			} else {
				ans = true;
			}
		}

		if (ans == true) {
			return true;
		} else {
			return false;
		}
	}

}
