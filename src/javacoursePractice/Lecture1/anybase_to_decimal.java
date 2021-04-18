package javacoursePractice.Lecture1;

import java.util.Scanner;

public class anybase_to_decimal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ans=conversion(n,5,10);
		System.out.println(ans);
	}
	
	public static int conversion(int n,int sb,int db) {
		int ans=0;
		int multi=1;
		while(n!=0) {
			int rem=n%db;
			ans+=rem*multi;
			n=n/10;
			multi*=sb;		
		}
		
		return ans;
		
	}

}
