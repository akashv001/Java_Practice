package javacoursePractice.array;

import java.util.Scanner;

public class binary_search {

	public static void main(String[] args) {
		int[] arr = { 5, 7, 10, 12, 15, 20, 27, 31, 36, 42, 55, 58, 60, 65, 70 };
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ans = BinarySearch(arr, n);
		System.out.println(ans);
	}

	public static int BinarySearch(int[] arr, int item) {
		int lo = 0;
		int hi = arr.length - 1;

		while (lo <= hi) {
           int mid=(lo+hi)/2;
        	
          if (item>arr[mid]){
        	 lo=mid+1;  
           }
          
          else if(item<arr[mid]) {
        	  hi=mid-1;
          }
          
          else if(item==arr[mid]){
        	  return mid;
          }
        		   
		}
		return -1;

	}
}
