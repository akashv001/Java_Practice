package march_practice.basic_java_pgm;

import java.util.Scanner;

public class sumof_n {

	public static void main(String[] args) {
		Scanner scn=new  Scanner(System.in);
		int n=scn.nextInt();
		int ans=sum1(n);
		System.out.println(ans);
	}
	
	public static void sum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		
		System.out.println(sum);
	}
	
	public static int sum1(int n) {
		if(n==1) {
			return 1;
		}
		int sum=0;
		sum=n+sum1(n-1);
		return sum;
	}

}
