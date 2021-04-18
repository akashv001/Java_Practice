package recursion_Questions;

public class PDISkip {

	public static void main(String[] args) {
		int n = 5;
		PDIskip(n);
	}

	public static void PDIskip(int n) {
		if (n == 0) {
			return;
		}

		if (n % 2 != 0) {
			System.out.println(n);
			PDIskip(n - 1);
		} else {
			PDIskip(n - 1);
			System.out.println(n);
		}

	}

}
