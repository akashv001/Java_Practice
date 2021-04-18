package recursion_Questions;

import java.util.ArrayList;

public class get_all_subsequences {

	public static void main(String[] args) {
		// ans= "","b","bc","c","ac","abc","a","ab";
		String str = "abc";
		ArrayList<String> ans = new ArrayList<>();
		ans = getss(str);
		System.out.println(ans);

	}

	public static ArrayList<String> getss(String str) {
		if (str.length() == 0) {
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}

		ArrayList<String> ans = new ArrayList<>();
		ArrayList<String> mr = new ArrayList<>();
		char cc = str.charAt(0);
		String ros = str.substring(1);
		ans = getss(ros);

		for (String chars : ans) {
			mr.add(chars);
			mr.add(cc + chars);
		}
		return mr;
	}

}
