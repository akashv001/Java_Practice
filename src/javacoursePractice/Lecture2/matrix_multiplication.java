package javacoursePractice.Lecture2;

public class matrix_multiplication {

	public static void main(String[] args) {
		int [][] arr1= {{1,1,1},{2,2,2},{3,3,3}};
		int [][] arr2= {{1,1,1},{2,2,2},{3,3,3}};
		
		int [][] ans=multiplication(arr1,arr2);
		display(ans);

	}
	
	public static void display(int [][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public static int[][] multiplication(int [][] arr1,int [][] arr2) {
		int ans[][] =new int[3][3];
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				ans[i][j]=0;
				
				for(int k=0;k<arr1[i].length;k++) {
					ans[i][j]+=arr1[i][j]*arr2[k][j];
				}
			}
		}
		return ans;
	}

}
