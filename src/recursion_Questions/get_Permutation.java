package recursion_Questions;

import java.util.ArrayList;

public class get_Permutation {

	public static void main(String[] args) {
		String str = "abc";
		ArrayList<String> ans = new ArrayList<>();
		ans = getPermutation(str);
		System.out.println(ans);

	}

	public static ArrayList<String> getPermutation(String str){
		if(str.length()==0) {
			ArrayList<String> br=new ArrayList<>();
			br.add("");
			return br;
		}
	
		char cc=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> rr=new ArrayList<>();
		ArrayList<String> mr=new ArrayList<>();
		
		rr=getPermutation(ros);
		
		for(String rrs:rr) {
			for(int i=0;i<=rrs.length();i++) {
				mr.add(rrs.substring(0,i)+cc+rrs.substring(i));
			}
		}
		return mr;
	}
}
