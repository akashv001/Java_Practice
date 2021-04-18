package oopspractice;

public class pattern {

	public static void main(String[] args) {
		int nst = 5;
		int n = 5;
		int row = 0;
		int nsp = 4;
		int nspp = 0;

		while (row < 2 * n - 1) {
			for (int csp = 1; csp <= nspp; csp++) {
				System.out.print(" ");
			}

			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}

			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}

			System.out.println();

			if (row <= n - 1) {
				nst--;
				nspp = nspp + 2;
				nsp--;
			} else {
				nsp++;
				nspp = nspp - 2;
				nst++;
			}

			row++;

		}

	}

}
