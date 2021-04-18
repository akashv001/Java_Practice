package questions_450;

public class min_max {
// q2 find the max and min element  in the array
		public static void main(String[] args) {
			int[] arr = { 2, 3, -1, 5, -4,9 };
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] <= min) {
					min = arr[i];
				}
				if (arr[i] >= max) {
					max = arr[i];
				}
			}
			System.out.println(min);
			System.out.println(max);
		}

	}
