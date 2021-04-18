package lecture7;

import java.util.ArrayList;

public class getpermutation {

	public static void main(String[] args) {
		System.out.println(getpermutations("abc"));
	}

	public static ArrayList<String> getpermutations(String str) {
		if (str.length() == 0) {
			ArrayList<String> baseresult = new ArrayList<>();
			baseresult.add("");
			return baseresult;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr = getpermutations(ros);
		ArrayList<String> mr = new ArrayList<>();
		for (String val : rr) {
			for (int i = 0; i <= val.length(); i++) {
				String item = val.substring(0, i) + ch + val.substring(i);
				mr.add(item);

			}
		}
		return mr;
	}

}
