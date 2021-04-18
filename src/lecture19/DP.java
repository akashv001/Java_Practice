package lecture19;

public class DP {
	public static long start;
	public static long end;

	public static void startAlgo() {
		start = System.currentTimeMillis();
	}

	public static long endAlgo() {
		end = System.currentTimeMillis();
		return end - start;
	}

	public static void main(String[] args) {
		int n = 30;
		int[] strg = new int[n + 1];
//		startAlgo();
//		System.out.println(fib(n));
//		System.out.println("Fib of normal " + endAlgo() + " ms ");
//		startAlgo();
//		System.out.println(fibrs(n, strg));
//		System.out.println("Fib of Recursive strg " + endAlgo() + " ms ");
//
//		startAlgo();
//		System.out.println(fibis(n));
//		System.out.println("Fib of Iterative strg " + endAlgo() + " ms ");

//		startAlgo();
//		System.out.println(cbp(0, n));
//		System.out.println("count board path Normal " + endAlgo() + " ms ");
//
//		startAlgo();
//		System.out.println(cbpRS(0, n, strg));
//		System.out.println("count board path Recursive Storage " + endAlgo() + " ms ");
//
//		startAlgo();
//		System.out.println(cbpIS(0, n));
//		System.out.println("count board path Iterative Storage " + endAlgo() + " ms ");
//		String str1 = "abbg";
//		String str2 = "agbg";
		String str1 = "abcdabcfjfjfjdeghjklaghjh";
		String str2 = "abcdefeadvdabcflghgghjh";
		startAlgo();
		System.out.println(lcs(str1, str2));
		System.out.println("lcs Normal took time " + endAlgo() + " ms ");

		startAlgo();
		System.out.println(lcsI(str1, str2));
		System.out.println("lcs Iterative took time " + endAlgo() + " ms ");
	}

	public static int fib(int n) {
		if (n == 1) {
			return 1;
		}
		if (n == 0) {
			return 0;
		}

		int fnm1 = fib(n - 1);
		int fnm2 = fib(n - 2);
		int fn = fnm1 + fnm2;
		return fn;
	}

	public static int fibrs(int n, int[] strg) {
		if (n == 1) {
			return 1;
		}
		if (n == 0) {
			return 0;
		}
		if (strg[n] != 0) {
			return strg[n];
		}

		int fnm1 = fibrs((n - 1), strg);
		int fnm2 = fibrs((n - 2), strg);
		int fn = fnm1 + fnm2;
		strg[n] = fn;
		return fn;
	}

	public static int fibis(int n) {
		int[] strg = new int[n + 1];

		// seed
		strg[0] = 0;
		strg[1] = 1;
		for (int i = 2; i <= n; i++) {
			strg[i] = strg[i - 1] + strg[i - 2];
		}
		return strg[n];

	}

	public static int cbp(int curr, int end) {
		if (curr == end) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count += cbp(curr + dice, end);
		}
		return count;
	}

	public static int cbpRS(int curr, int end, int[] strg) {
		if (curr == end) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		if (strg[curr] != 0) {
			return strg[curr];
		}
		int count = 0;

		for (int dice = 1; dice <= 6; dice++) {
			count += cbpRS(curr + dice, end, strg);
		}
		strg[curr] = count;
		return count;
	}

	public static int cbpIS(int curr, int end) {
		int[] strg = new int[end + 1];
		// seed
		strg[end] = 1;
		for (int i = end - 1; i >= 0; i--) {
			int count = 0;
			for (int dice = 1; dice <= 6 && dice + i < strg.length; dice++) {
				count += strg[dice + i];
			}
			strg[i] = count;
		}
		return strg[curr];
	}

	public static int lcs(String str1, String str2) {
		if (str1.length() == 0 || str2.length() == 0) {
			return 0;
		}
		int count = 0;
		String ros1 = str1.substring(1);
		String ros2 = str2.substring(1);
		if (str1.charAt(0) == str2.charAt(0)) {
			count = 1 + lcs(ros1, ros2);
		} else {
			int f1 = lcs(ros1, str2);
			int f2 = lcs(str1, ros2);
			count = Math.max(f1, f2);
		}
		return count;
	}

	public static int lcsI(String str1, String str2) {
		int[][] strg = new int[str1.length() + 1][str2.length() + 1];
		// seed
		strg[str1.length()][str2.length()] = 0;
		for (int i = str1.length(); i >= 0; i--) {
			for (int j = str2.length(); j >= 0; j--) {
				if (i == str1.length() || j == str2.length()) {
					strg[i][j] = 0;
					continue;
				}
				if (str1.charAt(i) == str2.charAt(j)) {
					strg[i][j] = 1 + strg[i + 1][j + 1];
				} else {
					strg[i][j] = Math.max(strg[i + 1][j], strg[i][j+1]);
				}
			}
		}
		return strg[0][0];
	}

}