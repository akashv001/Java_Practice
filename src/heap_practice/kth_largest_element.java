package heap_practice;

import java.util.PriorityQueue;

public class kth_largest_element {

	public static void main(String[] args) {
    int [] arr= {7,10,4,3,20,15};
    int k=3;
    System.out.println(kLargest(arr,k));
	}

	public static int kLargest(int [] arr, int k) {
		PriorityQueue<Integer> min_heap =new PriorityQueue<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			min_heap.add(arr[i]);
	      
			if(min_heap.size()>k) {
				min_heap.poll();
			}
		}
		return min_heap.peek();
	}
}
