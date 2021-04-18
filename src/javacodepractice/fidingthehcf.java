package javacodepractice;

import java.util.Scanner;

public class fidingthehcf {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the divident :");
		int divident=s.nextInt();
		System.out.println("enter the divisor :");
		int divisor=s.nextInt();
		while(divident%divisor!=0) {
			int rem=divident%divisor;
			divident=divisor;
			divisor=rem;
		}
		System.out.println("the hcf of the given number is :" +divisor);
	}

}
