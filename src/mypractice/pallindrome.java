package mypractice;

import java.util.Scanner;

public class pallindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		boolean ans;
		ans = pallindrome1(str);
		System.out.println(ans);
	}

	public static boolean pallindrome1(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
