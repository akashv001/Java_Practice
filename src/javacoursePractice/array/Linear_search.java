package javacoursePractice.array;

public class Linear_search {

	public static void main(String[] args) {
		int [] arr= {20,30,50,35,40};
		int ans=LinearSearch(arr,40);
		System.out.println(ans);
	}
	
	public static int LinearSearch(int [] arr,int item) {
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(item==arr[i]) {
				index=i;
			}
		}
		return index;
	}
	

}
