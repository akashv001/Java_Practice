package javacodepractice;

import java.util.Scanner;

public class fibonaaci {

	public static void main (String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int a=0,b=1;
		int res=0,counter=1;
		while(counter<=n) {
			
				System.out.println(a);
				res=a+b;
				a=b;
				b=res;
				counter=counter+1;
			}
			
			
		}
	}


