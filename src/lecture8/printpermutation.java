package lecture8;

public class printpermutation {

	public static void main(String[] args) {
		printpermutation("abc","");

	}

	public static void printpermutation(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			char cc = ques.charAt(i);
			String roq = ques.substring(0, i) + ques.substring(i + 1);
			printpermutation(roq, ans + cc);

		}
	}

}
