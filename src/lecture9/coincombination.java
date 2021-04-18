package lecture9;

public class coincombination {

	public static void main(String[] args) {
		coinCombination(new int[] { 2, 3, 5, 6 }, 10, "", 0);
	}

	public static void coinCombination(int[] denom, int amount, String ans, int ldIdx) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = ldIdx; i < denom.length; i++) {
			if (amount >= denom[i])
				coinCombination(denom, amount - denom[i], ans + denom[i], i);
		}
	}
}
