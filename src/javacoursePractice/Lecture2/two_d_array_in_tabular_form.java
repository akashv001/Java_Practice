package javacoursePractice.Lecture2;

public class two_d_array_in_tabular_form {

	public static void main(String[] args) {
		int [][] arr= {{1,3},{4,2}};
		display(arr);
	}
	
	
	public static void display(int [][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
