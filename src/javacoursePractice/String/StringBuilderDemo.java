package javacoursePractice.String;

public class StringBuilderDemo {

	public static void main(String[] args) {
    
		StringBuilder sb=new StringBuilder();
		System.out.println(sb);
		
		sb.append("hello");
		System.out.println(sb);
		
		sb.insert(2, "in");
		System.out.println(sb);
		
		sb.insert(sb.length(), "b");
		System.out.println(sb);
		
		sb.setCharAt(3,'m');
		System.out.println(sb);
		System.out.println(sb.length());
		
		sb.delete(2, 4);
		System.out.println(sb);
		
		sb.deleteCharAt(5);
		System.out.println(sb);
		
		String s=sb.toString();
		System.out.println(s);
	}

}
