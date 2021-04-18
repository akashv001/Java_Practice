package javacoursePractice.string1;

public class string_Performance {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
//		appendString(1000000);
		appendString1(10000000);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	public static void appendString(int n) {
		String str = "";
		for (int i = 0; i <= n; i++) {
			str = str + i;
		}
	}
	
	public static void appendString1(int n) {
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<=n;i++) {
			sb.append(i);
		}
		
	}

}
