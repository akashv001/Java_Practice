package stack_queue;

import java.util.ArrayList;
import java.util.Collections;

public class nextGreatNum {

	public static void main(String[] args) throws Exception {
		int[] arr = { 1, 3, 2, 4 };
		ArrayList ans = nextSmaller(arr);
		Collections.reverse(ans);
		System.out.println(ans);
//		ArrayList ans = nextLeftSmaller(arr);
//		System.out.println(ans);

	}

	public static ArrayList<Integer> nextGreater(int[] arr) throws Exception {
		StackusingArrays stack = new StackusingArrays();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i = arr.length - 1; i >= 0; i--) {
			if (stack.size() == 0) {
				ans.add(-1);
			} else if (arr[i] < stack.top() && stack.size() > 0) {
				ans.add(stack.top());
			} else if (arr[i] >= stack.top() && stack.size() > 0) {
				while (arr[i] >= stack.top() && stack.size() > 0) {
					stack.pop();
				}
				if (stack.size() == 0) {
					ans.add(-1);
				} else {
					ans.add(stack.top());
				}
			}
			stack.push(arr[i]);
		}
		return ans;
	}

	public static ArrayList<Integer> nextLeftGreater(int[] arr) throws Exception {
		StackusingArrays stack = new StackusingArrays();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (stack.size() == 0) {
				ans.add(-1);
			} else if (stack.top() > arr[i] && stack.size() > 0) {
				ans.add(stack.top());
			} else if (stack.top() <= arr[i] && stack.size() > 0) {
				while (stack.size() > 0 && stack.top() <= arr[i]) {
//					 while(stack.top() <= arr[i] && stack.size()>0){
					stack.pop();
				}
				if (stack.size() == 0) {
					ans.add(-1);
				} else {
					ans.add(stack.top());
				}
			}
			stack.push(arr[i]);
		}
		return ans;
	}

	public static ArrayList<Integer> nextLeftSmaller(int[] arr) throws Exception {
		StackusingArrays stack = new StackusingArrays();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (stack.size() == 0) {
				ans.add(-1);
			} else if (stack.top() < arr[i] && stack.size() > 0) {
				ans.add(stack.top());
			} else if (stack.top() >= arr[i] && stack.size() > 0) {
				while (stack.size() > 0 && stack.top() >= arr[i]) {
//					 while(stack.top() <= arr[i] && stack.size()>0){
					stack.pop();
				}
				if (stack.size() == 0) {
					ans.add(-1);
				} else {
					ans.add(stack.top());
				}
			}
			stack.push(arr[i]);
		}
		return ans;
	}

	public static ArrayList<Integer> nextSmaller(int[] arr) throws Exception {
		StackusingArrays stack = new StackusingArrays();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i = arr.length - 1; i >= 0; i--) {
			if (stack.size() == 0) {
				ans.add(-1);
			} else if (stack.top() < arr[i] && stack.size() > 0) {
				ans.add(stack.top());
			} else if (stack.top() >= arr[i] && stack.size() > 0) {
				while (stack.size() >0  && stack.top() >= arr[i]) {
					stack.pop();
				}
				if (stack.size() == 0) {
					ans.add(-1);
				} else {
					ans.add(stack.top());
				}
			}
			stack.push(arr[i]);
		}
		return ans;
	}
}