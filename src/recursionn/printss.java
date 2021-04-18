package recursionn;

public class printss {

	public static void main(String[] args) {
		printSubse("", "abc");

	}

	public static void printSubse(String res, String str) {
		if (str.length() == 0) {
			System.out.print(res+" ");
			return;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);

		printSubse(res,ros);
		printSubse(res + cc, ros);

	}

}
