package lecture6;

public class printdecreasing {

	public static void main(String[] args) {
//		pd(5);
//		pi(5);
		pdi(5);

	}

	public static void pd(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		pd(n - 1);
	}

	public static void pi(int n) {
		if (n == 0) {
			return;
		}
		pi(n - 1);
		System.out.println(n);

	}

	public static void pdi(int n) {
		if (n == 0) {
			return;
		}

		System.out.println(n);
		pdi(n - 1);
		System.out.println(n);
	}
}