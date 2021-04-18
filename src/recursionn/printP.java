package recursionn;

public class printP {

	public static void main(String[] args) {

		printPer("abc", "");

	}

	public static void printPer(String str, String res) {
		if (str.length() == 0) {
			System.out.print(res + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);

			printPer(ros, res + cc);

		}
	}

}
