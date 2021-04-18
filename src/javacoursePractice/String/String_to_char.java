package javacoursePractice.String;

public class String_to_char {
	public static void main(String[] args) {

		String str = "MynameisAkash";
		StringtoChar1(str);
	}

	public static void StringtoChar(String str) {
         for(int i=0;i<str.length();i++) {
        	 char cc=str.charAt(i);
        	 System.out.print(cc+" ");
         }
	}
	
	public static void StringtoChar1(String str) {
        char[] cc=str.toCharArray();
        
        for(char ans:cc) {
        	System.out.print(ans+" ");
        }
	}
}
