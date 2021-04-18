package heap_practice;

import java.util.PriorityQueue;

public class Leetcode {

	public static void main(String[] args) {
		
		int []nums = {1,1,1,2,2,3};
//		int k = 2;
            int [] ans=topKFrequent(nums,2);
            display(ans);
	}
	
	public static void display(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	 public static int[] topKFrequent(int[] nums, int k) {
	      int [] count=new int[256];
	        for(int i=0;i<nums.length;i++){
	            count[nums[i]]++;
	        }
	        
	        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->count[b]-count[a]);
	        for(int i=0;i<count.length;i++){
	            pq.add(i);
	        }
	        
	        int []ans=new int[k];     
	        while(!pq.isEmpty()){
	            int i=pq.poll();
	            int times=count[i];
	           for(int j=0;j<ans.length && j<times;j++){
	               ans[j]=count[i];
	           }
	        }
	        
	        return ans;
	    }
	}

