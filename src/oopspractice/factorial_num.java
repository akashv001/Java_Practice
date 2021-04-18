package oopspractice;

import java.util.Scanner;

public class factorial_num {

	public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
	  int ans=factorial(n);
	  System.out.println(ans);
	}
	
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
	
		int fact=0;
		fact=n*factorial(n-1);
		return fact;
	}
	
//   public static int factorial1(int n) {
//	   
//   }
}
