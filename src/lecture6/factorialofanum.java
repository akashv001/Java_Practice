package lecture6;

public class factorialofanum {

	public static void main(String[] args) {
		int fact;
		fact=fact(4);
		System.out.println(fact);
	}

	public static int fact(int n) {
		int fact = n;
		if (n == 1) {
			return 1;
		}
		fact = fact * fact(n - 1);
		return fact;

	}
}
