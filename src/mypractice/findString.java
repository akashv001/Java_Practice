package mypractice;

import java.util.ArrayList;

public class findString {

	public static void main(String[] args) {
		int[] arr = { 2, 8, 7 };
		System.out.println(kidsWithCandies(arr, 1));
	}

	public static int max(int[] candies) {
		int max = candies[0];
		for (int i = 0; i < candies.length; i++) {
			if (candies[i] > max) {
				max = candies[i];
			}
		}
		return max;
	}

	public static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		ArrayList<Boolean> ans = new ArrayList<>();
		    int max=max(candies);
		    for (int i = 0; i < candies.length; i++) {
			if (candies[i] + extraCandies >= max) {
				ans.add(true);
			} else {
				ans.add(false);
			}
		}

		return ans;
	}
}