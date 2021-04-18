package Genericclass;

//import java.util.ArrayList;

public class PairClient {

	public static void main(String[] args) {
		Pair<String> pair = new Pair<>();
		pair.one = "abc";
		pair.two = "def";

		Pair<Integer> pair1 = new Pair<>();
		pair1.one = 10;
		pair1.two = 20;

//		ArrayList<String> arr=new ArrayList<>();
//	}

		PairTwo<String, Integer> pair3 = new PairTwo<>();
		pair3.one = "abc";
		pair3.two = 20;

	}
}