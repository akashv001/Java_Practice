package codingNinja.ArrayQues;

public class findSumPair {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 6, 2, 5, 4, 3, 2, 4 };
		TargetSumPair1(arr, 7);
	}

	public static void TargetSumPair1(int[] arr, int sum) {
		for (int i = 0; i < arr.length; i++) {
			int remSum = sum - arr[i];
			for (int j = i+1; j < arr.length; j++) {
				if (i != j && remSum == arr[j]) {
					System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}
	}

}
