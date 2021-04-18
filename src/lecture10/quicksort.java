package lecture10;

public class quicksort {

	public static void main(String[] args) {
		int[] p = { 20, 10, 30, 50, 60, 5, 80, 25 };

		quickSort(p, 0, p.length - 1);
		for (int val : p) {
			System.out.print(val + " ");
		}
	}

	public static void quickSort(int[] arr, int lo, int hi) {
		if (lo >= hi) {
			return;
		}

//		1  Partitioning
		int mid = (lo + hi) / 2;
		int pivot = arr[mid];
		int left = lo;
		int right = hi;
		while (left <= right) {
			while (arr[left] < pivot) {
				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}

			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;

			}
		}

		// smaller ones

		quickSort(arr, lo, right);
		quickSort(arr, left, hi);

	}

}
