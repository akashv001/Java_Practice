package lecture3;

public class bubblesort {

	public static void main(String[] args) {
		int[] arr = { 88, 77, 65, 43, 22 };
		bubblesort(arr);
		display(arr);
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int bubblesort(int[] arr) {
		int counter = 0;
		while (counter < arr.length - 1) {
			int j = 0;
			while (j < arr.length - 1 - counter) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
				j++;
			}
			counter++;
		}

		return -1;
	}
}