package javacoursePractice.Recursion;

public class first_index {

	public static void main(String[] args) {
		int[] arr = { 6, 8, 1, 1, 8, 3, 4 };
//		int ans = firstIndex(arr, 0, 3);
		int ans = lastIndex(arr, 0, 1);
		System.out.println(ans);
	}

	public static int firstIndex(int[] arr, int si, int data) {
		if (si == arr.length) {
			return -1;
		}

		if (arr[si] == data) {
			return si;
		}

		int ans = firstIndex(arr, si + 1, data);
		return ans;
	}

	public static int lastIndex(int[] arr, int si, int data) {
		if(si==arr.length) {
			return -1;
		}
     
		int index=lastIndex(arr,si+1,data);
		
		if(index==-1) {
			if(arr[si]==data) {
			   return si;	
			}else {
				return -1;
			}
		}else {
			return index;
		}
		
	}

}
