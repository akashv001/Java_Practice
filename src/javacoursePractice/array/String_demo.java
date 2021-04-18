package javacoursePractice.array;

public class String_demo {

	public static void main(String[] args) {
		String s1="Hello";
		String s2=s1;
		String s3="Hello";
		String s4=new String("Hello");
		System.out.println((s1==s2) +" and "+s1.equals(s2) );
		System.out.println((s2==s3) +" and "+s2.equals(s3) );
		System.out.println((s1==s4) +" and "+s1.equals(s4) );
		takeString(s1);
	}
	
	public static void takeString(String str) {
		for(int i=0;i<=str.length()-1;i++) {
			System.out.print(str.charAt(i)+" ");
		}
	}

}
