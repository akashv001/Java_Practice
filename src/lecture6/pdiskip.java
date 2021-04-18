package lecture6;

public class pdiskip {

	public static void main(String[] args) {
		pdiskip(5);

	}

	public static void pdiskip(int n) {
		if (n == 0) {
			return;
		}
		if (n % 2 == 0) {
			pdiskip(n - 1);
			System.out.println(n);
		} else {
			System.out.println(n);
			pdiskip(n - 1);
		}
	}
}
