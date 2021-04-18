package javacoursePractice.Lecture1;

public class GCD {

	public static void main(String[] args) {

//		GCD(60, 36);
		int ans=reverseNum(7452);
		System.out.println(ans);
	}

	public static void GCD(int p, int q) {
		int rem = 0;
		while (p % q != 0) {
			rem = p % q;
			p = q;
			q = rem;
		}
		System.out.println(q);
	}
	

	public static int reverseNum(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = sum * 10 + rem;
			n=n/10;
		}
		return sum;
	}
}
