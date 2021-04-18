package heap_practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

class Pair {
	Integer key;
	Integer value;

	public Pair(Integer key, Integer value) {
		this.key = key;
		this.value = value;
	}

	public Integer getKey() {
		return key;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
}

public class k_closest_element {

	public static void main(String[] args) {
		int[] arr = { 5, 6, 7, 8, 9 };
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ans = (kclosest(arr, 3, 7));
		System.out.println(ans);
	}

	public static ArrayList<Integer> kclosest(int[] arr, int k, int x) {
		{
			ArrayList<Integer> ans = new ArrayList<Integer>();
			PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
				public int compare(Pair p1, Pair p2) {
					return p2.getValue().compareTo(p1.getValue());
				}
			});

			for (int i = 0; i < arr.length; i++) {
				pq.add(new Pair(arr[i], Math.abs(arr[i] - x)));

				if (pq.size() > k) {
					pq.poll();
				}
			}
			while (pq.size() > 0) {
				ans.add(pq.peek().key);
				pq.poll();
			}
			return ans;

		}

	}
}
