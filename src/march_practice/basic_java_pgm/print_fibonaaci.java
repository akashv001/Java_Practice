package march_practice.basic_java_pgm;

import java.util.Scanner;

public class print_fibonaaci {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		fibonaaci(n);
	}
	
	public static void fibonaaci(int n) {
		int a=0;
		int b=1;
		int c=1;
		
		for(int i=0;i<n;i++) {
			System.out.print(a+",");
			a=b;
			b=c;
			c=a+b;
		}
		System.out.println("End");
		
		
	}

}
