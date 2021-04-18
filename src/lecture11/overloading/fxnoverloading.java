package lecture11.overloading;

public class fxnoverloading {
	public static void main(String[] args) {
		System.out.println(sum(2, 4));
		System.out.println(sum(2, 4, 1));
		System.out.println(sum(2.2, 5.2));
		System.out.println(sum(2.2, 5.0));
		System.out.println(sum(2, "a"));
		System.out.println(sum(1, 2, 0, 3, 4, 5));
		int[] arr = { 1, 2, 3, 4 };
		System.out.println(sum(arr));// type of variable arguments
	}

	public static int sum(int a, int b) {
		return a + b;
	}

//	public static void sum(int a,int b) { overloading is not poosible on the basis of return type
//		System.out.println(a+b);
//	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static double sum(double a, double b) {
		return a + b;
	}

	public static int sum(int a, String b) {
		return a;
	}

	public static int sum(int... args) {
		int sum = 0;
		for (int value : args) {
			sum = sum + value;
		}
		return sum;
	}

}
