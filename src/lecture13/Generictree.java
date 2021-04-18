package lecture13;

import java.util.ArrayList;
import java.util.Scanner;

public class Generictree {
	private class Node {
		int data;
		ArrayList<Node> children;

		Node(int data) {
			this.data = data;
			this.children = new ArrayList<>();
		}
	}

	private Node root;
	private int size;

	Generictree() {
		Scanner s = new Scanner(System.in);
		this.root = takeInput(s, null, 0);
	}

	private Node takeInput(Scanner s, Node parent, int ithchild) {
		if (parent == null) {
			System.out.println("Enter the data for the root node ");
		} else {
			System.out.println("Enter the data for the" + ithchild + "th child of " + parent.data);
		}
		int nodedata = s.nextInt();
		Node node = new Node(nodedata);
		this.size++;

		System.out.println("Enter the number of children for the " + node.data);
		int children = s.nextInt();

		for (int i = 0; i < children; i++) {
			Node child = this.takeInput(s, node, i);
			node.children.add(child);
		}
		return node;

	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		// node data
		String str = node.data + "=>";
		for (int i = 0; i < node.children.size(); i++) {
			// add children data for current node
			str = str + node.children.get(i).data + ",";
		}
		str = str + "END";
		// display the string of current node
		System.out.println(str);

		// display for all nodes
		for (int i = 0; i < node.children.size(); i++) {
			this.display(node.children.get(i));
		}
	}

}
