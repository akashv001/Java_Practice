package march_practice.basic_java_pgm;

public class pattern_25 {

	public static void main(String[] args) {
		int n = 5;
		int nst = 1;
		int nsp = 4;
		int row = 1;
		int val = 1;
		while (row <= n) {
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}

			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val + "\t");
				val++;
			}

			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}

			System.out.println();
			nsp--;
			row++;
			nst = nst + 2;

		}
	}

}
