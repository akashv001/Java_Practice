package lecture9;

public class coinpermutation {

	static int count = 0;

	public static void main(String[] args) {
		coinPermutation(new int[] { 2, 3, 5, 6 }, 10, "");
	}

	public static void coinPermutation(int[] denom, int amount, String ans) {
		if (amount == 0) {
			count++;
			System.out.println(count + "." + ans);
			return;
		}
		for (int i = 0; i < denom.length; i++) {
			if (amount >= denom[i])
				coinPermutation(denom, amount - denom[i], ans + denom[i]);
		}
	}
}
