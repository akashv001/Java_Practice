package lecture8;

public class printss {

	public static void main(String[] args) {
		printss("abc", "");
	}

	public static void printss(String str, String result) {
		if (str.length() == 0) {
			System.out.println(result);
			return;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);
		printss(ros, result);
		printss(ros, result + cc);

	}

}
