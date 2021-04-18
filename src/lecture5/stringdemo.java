package lecture5;

public class stringdemo {

	public static void main(String[] args) {
		// part-1
		String  str="hello";
		System.out.println(str);
//		str="bye";
		System.out.println(str);
		
		// part-2
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println("*********");
		System.out.println(str.charAt(str.length()-1));
		
		System.out.println(str.length());
		
		// part-3
//		System.out.println(str.substring(0,6)); string index out of bound error;
		System.out.println(str.substring(0,2));
		System.out.println(str.substring(2,2));
		System.out.println(str.substring(2,4));
		System.out.println(str.substring(1,5));
		System.out.println(str.substring(0));
		
		// part-4 
		String s1="hi";
		String s2="bye";
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		// part-5
		System.out.println(str.indexOf("el"));
		System.out.println(str.indexOf("o"));
		
		// part-6
		System.out.println(str.startsWith("he"));
		System.out.println(str.startsWith("He"));
		
		// part-7
		s1="Hello";
		s2=s1;
		String s3="Hello";
		String s4=new String("Hello");
		
		System.out.println((s1==s2)+ "," +s1.equals(s2));
		System.out.println((s1==s3)+ "," +s1.equals(s3));
		System.out.println((s1==s4)+ "," +s1.equals(s4));
	}

}
