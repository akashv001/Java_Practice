package Data_Structures.Stack;

import java.util.*;

public class Nearest_Larger_element_right {

	public static void main(String[] args) {
		int [] arr= {3,0,0,2,4,8};
		int [] ans=NearestLarger(arr);
		
		for(int val:ans) {
			System.out.print(val+" ");
		}

	}
	
	public static int[] NearestLarger(int [] arr) {
		Stack<Integer> st=new Stack<>();
		
		int [] ans=new int[arr.length];
		int j=arr.length-1;
		
		for(int i=arr.length-1;i>=0;i--) {
			
			if(st.size()==0) {
				ans[j]=-1;
				j--;
			}
			
			else if(st.size()>0 && st.peek()>arr[i]) {
				ans[j]=st.peek();
				j--;
			}
			
			else if(st.size()>0 && st.peek()<=arr[i]) {
				while(st.size()>0 && st.peek()<=arr[i]) {
					st.pop();
				}
				
				if(st.size()==0) {
					ans[j]=-1;
					j--;
				}else {
					ans[j]=st.peek();
					j--;
				}
			}
			st.push(arr[i]);
			
		}
		return ans;
		
	}

}