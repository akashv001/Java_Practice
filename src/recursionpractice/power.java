package recursionpractice;

import java.util.Scanner;

public class power {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of which u want to calculate the power ");
		int x = s.nextInt();
		System.out.println("Enter the power upto which u want to calculate the number ");
		int n = s.nextInt();
		int ans = Power(x, n);
		System.out.println(ans);
	}

	public static int Power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int ans = x * Power(x, n - 1);
		return ans;
	}

}
