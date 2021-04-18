package javacoursePractice.string1;

public class String_builder {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		System.out.println(sb);
		System.out.println(sb.length());
		
		sb.append("Hello");
		System.out.println(sb);
		System.out.println(sb.length());
		
		System.out.println(sb.charAt(2));
		sb.setCharAt(2,'A');
		System.out.println(sb);
		
		sb.insert(3, "kash");
		System.out.println(sb);
		
		sb.deleteCharAt(1);
		System.out.println(sb);
		
		String s=sb.toString();
		System.out.println(s);
		
//		s.deleteCharAt(2);
//		System.out.println(sb);
		
		

	}

}
