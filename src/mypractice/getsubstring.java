package mypractice;

public class getsubstring {

	public static void main(String[] args) {
//        String str="abcd";
//        for(int i=0;i<str.length();i++) {
//        	for(int j=i+1;j<=str.length();j++) {
//        		System.out.println(str.substring(i,j));
		// Input: num = 9669
//		Output: 9969
//        	}
		int[] ans = distributeCandies(10, 3);
		display(ans);
	}

// ans is 1 2 3 1
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] distributeCandies(int candies, int num_people) {
		 int [] arr=new int[num_people];
	        int currCandy=1;
	        while(candies>0){
	        for(int i=0;i<num_people;i++){
	            if(candies>currCandy){
	           arr[i]+=currCandy;
	            candies-=currCandy;
	            currCandy++;
	          }else{
	                arr[i]+=candies;
	                candies=0;
	            }
	        } 
	     }
	        return arr;
	   }
}