package javacoursePractice.Lecture1;

public class pattern2 {

	public static void main(String[] args) {
		int n = 0;
		int row = 8;
		int nst = 1;
		int nsp = 4;
		while (n <= row) {
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}

			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			System.out.println();

			if (n < row / 2) {
				nst++;
				nsp--;
			} else {
				nst--;
				nsp++;
			}

			n++;
		}

	}

}
