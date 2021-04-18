package lecture2;

import java.util.Scanner;

public class fahrenheittocelsiustable {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int f=0;
//		int n=300;
		while(f<=n) {
//			int c=(5*(f-32)/9);
			int c=(int)((5.0/9)*(f-32));
			System.out.println(f+"\t"+c);
			System.out.println(" ");
			f=f+20;
		}

	}

}
