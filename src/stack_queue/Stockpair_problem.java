package stack_queue;

import java.util.ArrayList;

public class Stockpair_problem {

	public static void main(String[] args) throws Exception {
		int[] arr = { 100, 80, 60, 70, 60, 75, 85 };
//		ArrayList<Integer> ans = new ArrayList<Integer>();
		int[] ans = Stockpair(arr);
		display(ans);
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] Stockpair(int[] arr) throws Exception {
		StackusingArraysGeneric<Integer> stack = new StackusingArraysGeneric<Integer>();
		int[] ans = new int[arr.length];
		ans[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			while (!stack.isEmpty() && arr[stack.top()] <= arr[i]) {
//					 while(stack.top() <= arr[i] && stack.size()>0){
				stack.pop();
			}
			if (stack.isEmpty()) {
				ans[i] = i ;
			} else {
				ans[i] = i - stack.top();
			}
			stack.push(i);
		}
		return ans;
	}
}