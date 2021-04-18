package javacoursePractice.Lecture2;

public class Binary_search {

	public static void main(String[] args) {
           int[] arr= {1,4,7,22,31,43,56,67,75};
           int ans=BinarySearch(arr,75);
           System.out.println(ans);
	}

	public static int BinarySearch(int[] arr, int item) {
		int lo = 0;
		int hi = arr.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (item < arr[mid]) {
				hi = mid - 1;
			} else if (item > arr[mid]) {
				lo = mid + 1;
			}else {
				return mid;
			}
		}
		return -1;

	}

}
