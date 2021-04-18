package javacoursePractice.Lecture1;

import java.util.Scanner;

public class Simple_interest {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int p;
		float r, t, si=0;

		p = s.nextInt();
		r = s.nextFloat();
		t = s.nextFloat();

		si = (p * r * t) / 100;
		System.out.println(si);

	}

}
