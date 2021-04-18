package javacoursePractice.Lecture2;

public class Anybase_decimal {

	public static void main(String[] args) {
//		int ans = toDecimal(100000, 2);
//		System.out.println(ans);
		int ans = toAnybase(32, 10, 2);
		System.out.println(ans);
	}

	public static int toDecimal(int n, int src) {
		int sum = 0;
		int power = 1;

		while (n != 0) {
			int rem = n % 10;
			sum = sum + rem * power;
			power = power * src;
			n = n / 10;

		}

		return sum;
	}

	public static int toAnybase(int n, int src, int dest) {
		int sum = 0;
		int power = 1;

		while (n != 0) {
			int rem = n % dest;
			sum = sum + rem * power;
			power = power * src;
			n = n / dest;

		}
		return sum;

	}

}
