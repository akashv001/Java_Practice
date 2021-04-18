package javacodepractice.recursion;

import java.util.ArrayList;

public class getss {

	public static void main(String[] args) {
		String str="abc";
		ArrayList ans;
		ans=Getss(str);
		 ;
	}
	
	public static ArrayList<String> Getss(String str){
		
		if(str.length()==0) {
			ArrayList<String> br=new ArrayList<>();
			br.add("");
			return br;
		}
		
		
		char cc=str.charAt(0);
		String ros=str.substring(1);
		
		ArrayList<String> rr=new ArrayList<>();
		ArrayList<String> mr=new ArrayList<>();
		
		rr=Getss(ros);
		
		for(String rrs:rr) {
		  mr.add(rrs+cc);	
		}
		
		return mr;
	}

}
