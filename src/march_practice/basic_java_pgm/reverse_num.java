package march_practice.basic_java_pgm;

import java.util.Scanner;

public class reverse_num {

	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
	 int ans=reverseNum(n);
	 System.out.println(ans);
	}
	
	public static int reverseNum(int n) {
		int ans=0;
		while(n!=0) {
			int rem=n%10;
		    ans=ans*10+rem;
			n=n/10;
		}
		return ans;
	}

}
