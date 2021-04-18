package javacoursePractice.Lecture2;

public class matrix_addition {

	public static void main(String[] args) {
      int [][] arr1= {{1,3,4},{2,4,3},{3,4,5}};
      int [][] arr2= {{1,3,4},{2,4,3},{1,2,4}};
      
//      int [][] ans=matrixAdd(arr1,arr2);
      int [][] ans=matrixSub(arr1,arr2);
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
	
	public static int[][] matrixAdd(int [][] arr1,int[][] arr2){
		int [][] ans=new int[3][3];
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				ans[i][j]=0;
				ans[i][j]+=arr1[i][j]+arr2[i][j];
			}
		}
		return ans;
	}
	
	public static int[][] matrixSub(int [][] arr1,int[][] arr2){
		int [][] ans=new int[3][3];
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				ans[i][j]=0;
				ans[i][j]+=arr1[i][j]-arr2[i][j];
			}
		}
		return ans;
	}

}
