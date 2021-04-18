package javacodepractice.recursion;

public class factorial {

	public static void main(String[] args) {
//		int ans=fact(4);
//		System.out.println(ans);

//		fact1(0);
//		int ans = power(2, 6);
//		System.out.println(ans);

		int[] arr = { 6, 8, 1, 1, 8, 3, 4 };
		int ans = lastIndex(arr, 0, 8);
		System.out.println(ans);

	}

	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}

		int fact = 0;
		fact = n * fact(n - 1);
		return fact;
	}

	public static void fact1(int n) {
		if (n == 0) {
			return;
		}

		int fact = 0;
		fact = n * fact(n - 1);
		System.out.println(fact);

	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int power = 0;
		power = x * power(x, n - 1);

		return power;
	}

	public static int lastIndex(int[] arr, int si, int data) {
		if (si == arr.length) {
			return -1;
		}

		int index=lastIndex(arr,si+1,data);
		
		if(index==-1) {
			if(arr[si]==data) {
				return si;
			}else {
				return -1;
			}
		}else {
			return index;
		}
	}
}
