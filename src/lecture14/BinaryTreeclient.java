package lecture14;

public class BinaryTreeclient {

	public static void main(String[] args) {
		BinaryTree tree=new BinaryTree();
		tree.display();
//    50 true 25 true 38 false false true 48 true 18 false false false true        ....
//    ...		    45 true 85 false false true 60 false false   
		
		System.out.println(tree.height());
		tree.preOrder();
		tree.postOrder();
		tree.inOrder();
		tree.levelOrder();
	}

}
