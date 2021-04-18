package recursion_Questions;

public class print_permutation {

	public static void main(String[] args) {
      printPermutation("abc" , "");
	}

	public static void printPermutation(String str, String result) {
      if(str.length()==0) {
    	  System.out.println(result);
    	  return;
      }
      
      for(int i=0;i<str.length();i++) {
      char cc=str.charAt(i);
      String ros=str.substring(0,i)+str.substring(i+1);
      printPermutation(ros,result+cc);    
	}
  }
}
