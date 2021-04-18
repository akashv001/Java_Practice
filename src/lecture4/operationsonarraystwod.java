package lecture4;

public class operationsonarraystwod {

	public static void main(String[] args) {
//		int[][] arr = new int[][3];
		int[][] arr = new int[3][];
		arr[0]=new int[4];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
//		System.out.println(arr[1][2]); null pointer exception as 1 now consist null pointer;
		
//		arr[3]=new int[2];
		arr[2]=new int[3];
		arr[1]=new int[2];
		display(arr);

	}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}