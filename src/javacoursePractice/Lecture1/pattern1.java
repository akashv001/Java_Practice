package javacoursePractice.Lecture1;

public class pattern1 {

	public static void main(String[] args) {
		int n = 5;
		int nst = 5;
		int nsp = 0;
		while (n > 0) {
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}

			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}

			System.out.println();

			nst--;
			nsp++;
			n--;
		}

	}

}
