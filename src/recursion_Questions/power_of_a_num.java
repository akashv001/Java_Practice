package recursion_Questions;

public class power_of_a_num {

	public static void main(String[] args) {
		// x=2 and n=3 2*2*2*1=8
		int x = 5, n = 3;
		System.out.println(Power(x, n));
	}

	public static int Power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int power = x * Power(x, n - 1);
		return power;
	}

}
