package javacoursePractice.array;

public class find_unique_inArray {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 6, 3, 6, 2 };
		 Unique(arr);
//		System.out.println(ans);

	}

	public static void Unique(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int start=0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
				start=1;
				break;
				}
				
				if(start==0) {
//					System.out.println(arr[start]);
				}
			}
		}
//		System.out.println(arr[start]);
	}

}
