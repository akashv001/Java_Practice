package javacodepractice;

import java.util.Scanner;

public class primeornonprime {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int div=2;
		boolean flag=true;
		while(div<=n-1) {
			if(n%div==0) {
				flag=false;
			}
			div++;
		}
		if(flag==true) {
			System.out.println("prime");
		}
		else {
			System.out.println("non-prime");
		}

	}

}
