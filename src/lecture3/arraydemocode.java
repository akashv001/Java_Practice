package lecture3;

public class arraydemocode {

	public static void main(String[] args) {
		// declare
		int[] arr = null;
		System.out.println(arr);

		// allocate space
		arr = new int[5];
		System.out.println(arr);

		// get
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		// set
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		// print
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// enhanced for loop

		for (int val : arr) {
			System.out.println(val);
		}
		
		// working swap
		int i=0, j=2;
		System.out.println(arr[i]+","+arr[j]);
		// swap(arr,i,j);
		System.out.println(arr[i]+","+arr[j]);
		
		int[] other= {100,200,300};
		System.out.println(arr[0]+","+other[0]);
		 swap(arr,other);
		System.out.println(arr[0]+","+other[0]);
		
	}
	public static void swap(int[] one,int[] two) {
		int[] temp=one;
		one=two;
		two=temp;
		//System.out.println(arr[one]+","+arr[other]);
		
		
	}
	
	public static void swap(int arr[],int i, int j) {
		System.out.println(arr[i]+","+arr[j]);
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		System.out.println(arr[i]+","+arr[j]);

}
}