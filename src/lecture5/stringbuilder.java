package lecture5;

import java.util.Scanner;

public class stringbuilder {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		System.out.println(sb.length());

		// append
		sb.append('a');
		System.out.println(sb);

		sb.append("def");
		System.out.println(sb);

		// insert
		sb.insert(2, "ak");
		System.out.println(sb);

		sb.insert(11, "100");
		System.out.println(sb);

		// charAt
		System.out.println(sb.charAt(2));

		// set charAt
		sb.setCharAt(1, 'b');
		System.out.println(sb);

        // delete charAt
		
		sb.deleteCharAt(2);
		System.out.println(sb);
		
		// ranges of the string builder functions
//		sb.setCharAt(sb.length(),'k');  range 0 to sb.length-1 ;
//		sb.deleteCharAt(sb.length());  range 0 to sb.length-1 ;
		sb.insert(sb.length(),'n'); // range 0 to sb.length ;
		System.out.println(sb);
		
		System.out.println("*****");
		
		String ss=sb.toString();
		System.out.println(ss);
	}
	

}
