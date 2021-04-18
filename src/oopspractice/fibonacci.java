package oopspractice;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     Fibonacci(n);
     
	}
	
	public static void Fibonacci(int n) {
		int a=0;
		int b=1;
		int sum=0;
		for(int i=0;i<n;i++) {
			System.out.println(a);
			sum=a+b;
			a=b;
			b=sum;
		}
	
	}

}
