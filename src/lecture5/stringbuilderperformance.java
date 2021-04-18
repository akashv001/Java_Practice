package lecture5;

public class stringbuilderperformance {

	public static void main(String[] args) {
		long Start = System.currentTimeMillis();
		appendstringSB(10000000);
		long End = System.currentTimeMillis();
		System.out.println(End-Start);

	}

	public static void appendstringSB(int n) {
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i <= n; i++) {
			sb.append(i);
		}
	}

}