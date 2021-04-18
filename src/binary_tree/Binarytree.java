package binary_tree;

import java.util.Scanner;

public class Binarytree {
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

	int size = 0;
	public Node root = null;

	Binarytree() {
		Scanner s = new Scanner(System.in);
		this.root = takeInput(s, null, false);
	}

	private Node takeInput(Scanner s, Node parent, boolean isLeftOrRight) {
		if (parent == null) {
			System.out.println("Enter the data for the root node ");
		} else {
			if (isLeftOrRight) {
				System.out.println("Enter the data for the left child of " + parent.data);
			} else {
				System.out.println("Enter the data for the right child of " + parent.data);
			}
		}

		int nodedata = s.nextInt();
		Node node = new Node(nodedata, null, null);
		this.size++;

		boolean choice = false;
		System.out.println("Do you have any left child for the " + node.data);
		choice = s.nextBoolean();

		if (choice) {
			node.left = takeInput(s, node, true);
		}

		choice = false;
		System.out.println("Do you have any right child for the " + node.data);
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
			str = str + "END" + "=>";
		}

		str = str + node.data;

		if (node.right != null) {
			str = str + "<=" + node.right.data;
		} else {
			str = str + "<=" + "END";
		}

		System.out.println(str);

		if (node.left != null) {
			this.display(node.left);
		}

		if (node.right != null) {
			this.display(node.right);
		}

	}
}
