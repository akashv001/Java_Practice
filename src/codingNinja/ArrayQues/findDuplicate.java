package codingNinja.ArrayQues;

public class findDuplicate {

	public static void main(String[] args) {
		int [] arr= {0,7,2,5,4,7,1,3,6};
		
		for (int i = 0; i < arr.length; i++) {
			int flag = 0;

			for (int j = i+1; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					flag = 1;
					break;
				}
			}

			if (flag == 1) {
				System.out.println(arr[i]);
			}

		}


	}

}
