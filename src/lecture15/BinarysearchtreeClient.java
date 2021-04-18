package lecture15;

public class BinarysearchtreeClient {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 100 };
		BinarysearchTree tree = new BinarysearchTree(arr);
		tree.display();
		System.out.println(tree.find(0));
		System.out.println(tree.max());
		tree.add(55);
		tree.display();
	}

}
