package stack_queue;

import java.util.Stack;

public class leetcodeq {

	public static void main(String[] args) {
//		int [] nums1 = {4,1,2};
//		int [] nums2 = {1,3,4,2};
		int[] nums1 = {2,4};
		int [] nums2 = {1,2,3,4};
		int [] ans=nextGreaterElement(nums1,nums2);
		display(ans);
	}
	public static void display(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
	}System.out.println("END");
	}

	 public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
			Stack<Integer> stack = new Stack();
			int [] ans=new int[nums1.length];
			int j=nums1.length-1;
			for (int i = nums2.length - 1; i >= 0; i--) {
				if (stack.size() == 0) {
					ans[nums1.length-1]=-1;
				} else if (nums1[j] < stack.peek() && stack.size() > 0) {
					ans[i]=stack.peek();
				} else if (nums1[j] >= stack.peek() && stack.size() > 0) {
					while (stack.size() > 0 && nums1[j] >= stack.peek()) {
						stack.pop();
					}
					if (stack.size() == 0) {
						ans[i]=-1;
					} else {
						ans[i]=stack.peek();
					}
				}
				stack.push(nums2[i]);
				j--;
			}
			return ans;
		}   
	    }

