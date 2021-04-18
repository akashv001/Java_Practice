package lecture4;

public class wavewiseprint {

	public static void main(String[] args) {
		int[][] arr = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 }, { 90, 100, 110, 120 }, { 130, 140, 150, 160 } };
		printrowwise(arr);
	}

	public static void printrowwise(int[][] arr) {
		for (int rows = 0; rows < arr.length; rows++) {
			if (rows % 2 == 0) {
				for (int cols = 0; cols < arr[rows].length; cols++) {
					System.out.print(arr[rows][cols] + " ");
				}
			} else {
				for (int cols = arr[rows].length - 1; cols >= 0; cols--) {
					System.out.print(arr[rows][cols] + " ");
				}
			}

		}
		System.out.print("End");
	}

}
