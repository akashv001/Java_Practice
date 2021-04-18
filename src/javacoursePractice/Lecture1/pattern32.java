package javacoursePractice.Lecture1;

public class pattern32 {

	public static void main(String[] args) {
		int n = 0;
		int row = 8;
		int nst = 1;
		int nsp = 4;
		int val = 1;
		while (n <= row) {
			for (int cst = 1; cst <= nst; cst++) {
				if (cst % 2 != 0) {
					System.out.print(val);
				} else {
					System.out.print("*");
				}
			}

			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			System.out.println();

			if (n < row / 2) {
				nst = nst + 2;
				nsp = nsp - 2;
				val++;
			} else {
				nst = nst - 2;
				nsp = nsp + 2;
				val--;
			}

			n++;
		}

	}

}
