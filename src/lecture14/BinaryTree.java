package lecture14;

import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTree {
	private class Node {
		int data;
		Node left;
		Node right;

		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	private Node root = null;;
	private int size = 0;

	BinaryTree() {
		Scanner s = new Scanner(System.in);
		this.root = takeInput(s, null, false);
	}

	private Node takeInput(Scanner s, Node parent, boolean isleftorright) {
		if (parent == null) {
			System.out.println("Enter the data for the root Node ");
		} else {
			if (isleftorright) {
				System.out.println("Enter the data for the left child of " + parent.data);
			} else {
				System.out.println("Enter the data for the right child of " + parent.data);
			}
		}

		int nodedata = s.nextInt();
		Node node = new Node(nodedata, null, null);
		this.size++;

		boolean choice = false;
		System.out.println("Do you have any left child of " + node.data);
		choice = s.nextBoolean();

		if (choice) {
			node.left = takeInput(s, node, true);
		}

		choice = false;
		System.out.println("Do you have any right child of " + node.data);
		choice = s.nextBoolean();

		if (choice) {
			node.right = takeInput(s, node, false);
		}
		return node;
	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		String str = "";
		if (node.left != null) {
			str = str + node.left.data + "=>";
		} else {
			str = str + "End=>";
		}

		str = str + node.data;

		if (node.right != null) {
			str = str + "<=" + node.right.data;
		} else {
			str = str + "<=End";
		}
		System.out.println(str);

		if (node.left != null) {
			this.display(node.left);
		}

		if (node.right != null) {
			this.display(node.right);
		}

	}

	public int height() {
		return this.height(this.root);
	}

	private int height(Node node) {
		if (node == null) {
			return -1;
		}
		int lheight = this.height(node.left);
		int rheight = this.height(node.right);

		int myheight = Math.max(lheight, rheight) + 1;
		return myheight;
	}

	public void preOrder() {
		this.preOrder(this.root);
		System.out.println("END");
	}

	public void preOrder(Node node) {

		if (node == null) {
			return;
		}
		System.out.print(node.data + ",");
		preOrder(node.left);
		preOrder(node.right);
	}

	public void postOrder() {
		this.postOrder(this.root);
		System.out.println("END");
	}

	private void postOrder(Node node) {
		if (node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + ",");
	}

	public void inOrder() {
		this.inOrder(this.root);
		System.out.println("END");
	}

	private void inOrder(Node node) {
		if (node == null) {
			return;
		}

		inOrder(node.left);
		System.out.print(node.data + ",");
		inOrder(node.right);

	}

	public void levelOrder() {
		LinkedList<Node> queue = new LinkedList<>();
		queue.add(this.root);
		while (!queue.isEmpty()) {
			Node rv = queue.removeFirst();
			System.out.print(rv.data + ",");
			if (rv.left != null) {
				queue.add(rv.left);
			}
			if (rv.right != null) {
				queue.add(rv.right);
			}
		}
		System.out.println("END");

	}

}
