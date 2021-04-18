package recursionpractice;

import java.util.ArrayList;
import java.util.Scanner;

public class getKeypadcombination {

	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		String str = scn.next();
//		ArrayList<String> ans = new ArrayList<>();
//		ans = getkc(str);
//		System.out.println(ans);
		printKC("678", "");

	}

	static String[] codes = { ".,", ",", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

	public static ArrayList<String> getkc(String str) {
		if (str.length() == 0) {
			ArrayList<String> ans = new ArrayList<>();
			ans.add("");
			return ans;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rr = new ArrayList<>();

		rr = getkc(ros);

		String codeforch = codes[cc - '0'];

		for (int i = 0; i < codeforch.length(); i++) {
			char ch = codeforch.charAt(i);

			for (String rrs : rr) {
				mr.add(ch + rrs);
			}
		}
		return mr;

	}

	public static void printKC(String str, String res) {
		if (str.length() == 0) {
			System.out.println(res + "");
			return;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);
		String chcode = codes[cc - '0'];

		for (int i = 0; i < chcode.length(); i++) {
			char rq = chcode.charAt(i);
			printKC(ros, res + rq);

		}
	}
}
