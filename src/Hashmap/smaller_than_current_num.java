package Hashmap;

public class smaller_than_current_num {

	public static void main(String[] args) {
		int[] nums = { 8, 1, 2, 2, 3 };
		int[] ans = smallerNumbersThanCurrent(nums);
		display(ans);
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] smallerNumbersThanCurrent(int[] nums) {

		int[] ans = new int[nums.length ];

		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 1; j < nums.length; j++) {
				if (i != j && nums[j] < nums[i]) {
					count++;
				}
			}
			ans[i] = count;

		}
		return ans;
	}
}
