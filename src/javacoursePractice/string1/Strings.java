package javacoursePractice.string1;

public class Strings {

	public static void main(String[] args) {
		String str="hello";
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.substring(0));
		System.out.println(str.substring(1, 3));
		
		System.out.println(str.charAt(str.length()-1));
		
		String s1="hi";
		String s2="bye";
		String ans=s1+s2;
		System.out.println(ans);
		
		System.out.println(s1.concat(s2));
		System.out.println(ans.indexOf("y"));
		System.out.println(ans.startsWith("by"));
		System.out.println(ans.startsWith("h"));
		
		
		

	}

}
