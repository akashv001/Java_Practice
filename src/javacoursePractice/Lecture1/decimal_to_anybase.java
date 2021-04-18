package javacoursePractice.Lecture1;

import java.util.Scanner;

public class decimal_to_anybase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans = decimaltoAnybase(n, 10, 5);
		System.out.println(ans);

	}

	public static int decimaltoAnybase(int n, int sb, int db) {
		int ans = 0;
		int multi = 1;
		while (n != 0) {
			int rem = n % db;
			ans += rem * multi;
			multi *= sb;
			n = n / 5;
		}
		return ans;
	}

}
