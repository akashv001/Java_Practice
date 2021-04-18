package lecture2;

import java.util.Scanner;

public class checkthechar {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		if(ch>64 && ch<=91) {
			System.out.println("uppercase");
		}
		else if(ch>96 && ch<=122) {
			System.out.println("lowercase");
		}
		else {
			System.out.println("invalid character");
		}

	}

}
