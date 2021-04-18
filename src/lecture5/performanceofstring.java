package lecture5;

public class performanceofstring {

	public static void main(String[] args) {
		long Start = System.currentTimeMillis();
		appendstring(100000);
		long End = System.currentTimeMillis();
		System.out.println(End-Start);

	}

	public static void appendstring(int n) {
		String s1 = "";
		for (int i = 0; i <= n; i++) {
			s1=s1+i;
		}
	}

}
