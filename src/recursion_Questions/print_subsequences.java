package recursion_Questions;

public class print_subsequences {

	public static void main(String[] args) {
		printSS("abc", "");
	}

	public static void printSS(String str, String result) {
		if(str.length()==0) {
			System.out.println(result+" ");
			return;
		}
      
		char cc=str.charAt(0);
		String ros=str.substring(1);
		printSS(ros,result);
		printSS(ros,result+cc); 
		
	}
}
