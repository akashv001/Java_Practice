package mypractice;

public class Testpgm {
// ans=5
	public static void main(String[] args) {
		String str = "abbcccddddeeeeeddddddddddddddddcba";
		int ans = maxPower(str);
		System.out.println(ans);
	}

	 public static int maxPower(String s) {
	        int maxlen=1;
	        int curlen=1;
	        for(int i=1;i<s.length();i++){
	            if(s.charAt(i-1)==s.charAt(i)){
	                curlen++;
	            }else{
	                maxlen=Math.max(curlen,maxlen);
	                curlen=1;
	            }
	        }
//	        maxlen=Math.max(curlen,maxlen);
	        return maxlen;
	    }
	}