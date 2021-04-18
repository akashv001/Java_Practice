package lecture5;

import java.util.Scanner;

public class getsubstrings {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		getsubstrings(str);
	}

	public static void getsubstrings(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
//				System.out.println(str.charAt(j));
				String s = str.substring(i, j);
				System.out.println(s);
			}
		}
	}

}
