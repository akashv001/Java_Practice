package javacodepractice;

import java.util.Scanner;

public class sumofnnumbers {

	public static void main(String[] args) {
		int a=1;
		int res=0;
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		while(a<=n) {
		    res= res+a;
			
			a++;
		}System.out.println(res);

	}

}
