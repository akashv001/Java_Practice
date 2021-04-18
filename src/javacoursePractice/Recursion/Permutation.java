package javacoursePractice.Recursion;

import java.util.ArrayList;

public class Permutation {

	public static void main(String[] args) {
		String str = "abc";
		ArrayList<String> ans = new ArrayList<>();
		ans = getPerumtation(str);
		System.out.println(ans);

	}

	public static ArrayList<String> getPerumtation(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rr = new ArrayList<>();
		ArrayList<String> mr = new ArrayList<>();
		
		rr=getPerumtation(ros);
		
		for(String rrs:rr) {
			for(int i=0;i<=rrs.length();i++) {
				String my=rrs.substring(0,i)+cc+rrs.substring(i);
				mr.add(my);
			}
			
		}
		
		
		return mr;
	}

}
