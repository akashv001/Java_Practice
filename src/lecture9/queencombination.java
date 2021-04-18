package lecture9;

public class queencombination {
	static int count = 0;

	public static void main(String[] args) {

		QueenCombination(new boolean[4], -1, 0, 2, "");

	}

	public static void QueenCombination(boolean[] boxes, int lastboxused, int qpsf, int tq, String ans) {

		if (qpsf == tq) {
			count++;
			System.out.println(count + "." + ans);
			return;
		}

		for (int i = lastboxused + 1; i < boxes.length; i++) {
//			if (boxes[i] == false) {
			boxes[i] = true;
			QueenCombination(boxes, i, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + " ");
			boxes[i] = false;
		}
	}

}
//}
