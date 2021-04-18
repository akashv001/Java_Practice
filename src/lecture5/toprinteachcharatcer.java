package lecture5;

import java.util.Scanner;

public class toprinteachcharatcer {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String st = s.next();
		for (int i = 0; i <= st.length() - 1; i++) {
			System.out.println(st.charAt(i));

		}
		
		System.out.println("*************");
		toprint(st);
	}

	public static void toprint(String str) {
		for (int i = 0; i <= str.length() - 1; i++) {
			System.out.println(str.charAt(i));
		}
	}
}
