package recursionn;

public class mergeSort {

	public static void main(String[] args) {

		int[] arr = { 10, 5, 20, 25, 30, 15, 50, 35 };
		int[] ans=mergedSort(arr, 0, arr.length - 1);
		
		for(int value:ans) {
			System.out.print(value+" ");
		}
	}

	public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
		int[] merged = new int[arr1.length + arr2.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				merged[k] = arr1[i];
				i++;
				k++;

			} else {
				merged[k] = arr2[j];
				j++;
				k++;
			}

		}

		if (i == arr1.length) {
			while (j < arr2.length) {
				merged[k] = arr2[j];
				j++;
				k++;
			}
		}

		if (j == arr2.length) {
			while (i < arr1.length) {
				merged[k] = arr1[i];
				i++;
				k++;
			}
		}

		return merged;
	}

	public static int[] mergedSort(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int[] br = new int[1];
			br[0] = arr[lo];

			return br;
		}

		int mid = (lo + hi) / 2;

		int[] fh = mergedSort(arr, lo, mid);
		int[] sh = mergedSort(arr, mid + 1, hi);

		int[] merge = mergeTwoSortedArray(fh, sh);

		return merge;

	}
}
