package recursion_Questions;

public class factorial_of_a_num {

	public static void main(String[] args) {
// 5*4*3*2*1=120
		int n = 5;
		System.out.println(fact(n));
	}

	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		int fact = n * fact(n - 1);
		return fact;
	}

}
