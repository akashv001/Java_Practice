package javacodepractice;

import java.util.Scanner;

public class detectionofagegroup {
		
	public static void main(String[] args) {
	    Scanner s= new Scanner(System.in);
	    int age=s.nextInt();
		if(age<=11) {
			System.out.println("child");
		}
		else if(age>=12 && age<18) {
			System.out.println("teenager");
		}
		else if(age>=18 && age<60) {
			System.out.println("adult");
		}
		else {
			System.out.println("old");
		}
	}

}
