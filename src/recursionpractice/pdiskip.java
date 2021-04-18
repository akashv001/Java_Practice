package recursionpractice;

public class pdiskip {
	public static void main(String[] args) {
		int n = 5;
		Pdiskip(n);
	}

	public static void Pdiskip(int n) {
		if (n == 0) {
			return;
		}
		if (n % 2 != 0) {
			System.out.println(n);

		}
		Pdiskip(n - 1);
		if (n % 2 == 0) {
			System.out.println(n);
		}
	}
}