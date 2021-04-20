package codingNinja.String_2d_ArrayQ;

public class print_all_prefixes {

	public static void main(String[] args) {
		String str = "ababc"; 
		char[] arr = str.toCharArray();
		printAllPrefixes(arr);
	}

	public static void printAllPrefixes(char[] str) {
		for (int i = 0;i<str.length && str[i] != '\0'; i++) {
			// j represents starting index
			for (int j = 0; j <= i; j++) {
				System.out.print(str[j]+",");
			}

		}
		System.out.println("end");
	}
}