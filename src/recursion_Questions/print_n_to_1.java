package recursion_Questions;

public class print_n_to_1 {

	public static void main(String[] args) {
//		print(7);
		printrev(7);

	}
	
	public static void print(int n) {
		
		if(n==1) {
			System.out.println(1);
			return;
		}
		
		System.out.println(n);
		print(n-1);
	}
	
	
public static void printrev(int n) {
		
		if(n==1) {
			System.out.println(1);
			return;
		}
		
		printrev(n-1);
		System.out.println(n);
	}

}
