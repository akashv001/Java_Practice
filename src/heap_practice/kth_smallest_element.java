package heap_practice;

import java.util.Collections;
import java.util.PriorityQueue;

public class kth_smallest_element {

	public static void main(String[] args) {
		int[] arr = { 7, 10, 4, 3, 20, 15 };
		int k = 3;
//		int ans = ksmallest(arr, k);
//		System.out.println(ans);
		System.out.println(ksmallest(arr, k));
	}

	public static int ksmallest(int[] arr, int k) {
		PriorityQueue<Integer> max_heap = new PriorityQueue<Integer>(Collections.reverseOrder());

		for (int i = 0; i < arr.length; i++) {
			max_heap.add(arr[i]);

			if (max_heap.size() > k) {
				max_heap.poll();
			}
		}
		return max_heap.peek();
	}
}
