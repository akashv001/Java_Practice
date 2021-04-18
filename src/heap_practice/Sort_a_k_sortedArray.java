package heap_practice;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Sort_a_k_sortedArray {

	public static void main(String[] args) {
		int[] arr = { 6, 5, 3, 2, 8, 10, 9 };
		System.out.println(kSortedArray(arr, 3));
	}

	public static ArrayList<Integer> kSortedArray(int[] arr, int k) {
		PriorityQueue<Integer> min_heap = new PriorityQueue<Integer>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			min_heap.add(arr[i]);
			if (min_heap.size() > k) {
				ans.add(min_heap.peek());
				min_heap.poll();
			}
		}
		while (min_heap.size() > 0) {
			ans.add(min_heap.peek());
			min_heap.poll();
		}

		return ans;
	}
}
