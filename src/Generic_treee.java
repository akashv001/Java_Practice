import java.util.ArrayList;
import java.util.Scanner;

public class Generic_treee {
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

	Generic_treee() {
		Scanner s = new Scanner(System.in);
		this.root = takeInput(s, null, 0);
	}

	private Node takeInput(Scanner s, Node parent, int ithchild) {
		if (parent == null) {
			System.out.println("Enter the value of the root Node data");
		} else {
			System.out.println("Enter the value of the " + ithchild + " the child");
		}
		int nodedata = s.nextInt();
		Node node = new Node(nodedata);
		this.size++;
		System.out.println("Enter the number of children for " + nodedata);
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
		String str = node.data + "=>";
		for (int i = 0; i < node.children.size(); i++) {
			str = str + node.children.get(i).data + ",";
		}

		str = str + "End";

		System.out.println(str);

		for (int i = 0; i < node.children.size(); i++) {
			this.display(node.children.get(i));
		}
	}
}