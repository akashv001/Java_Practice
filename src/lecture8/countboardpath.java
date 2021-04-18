package lecture8;

public class countboardpath {

	public static void main(String[] args) {
		System.out.println(printBoardpath(0 , 10));

	}

	public static int printBoardpath(int curr, int end) {
		if (curr == end) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
		count+=	printBoardpath(curr + dice, end);
             
		}
		return count;
	}
	

}
