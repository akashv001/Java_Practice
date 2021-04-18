package binary_tree;

import java.util.Stack;

public class binarytree_questions {

	public static class Node {
		int data;
		Node left;
		Node right;

		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}

	}

	public static class Pair {
		int state;
		Node node;

		Pair(Node node, int state) {
			this.node = node;
			this.state = state;
		}
	}

	public static void display(Node node) {
		if (node == null) {
			return;
		}
		String str = "";
		str += node.left == null ? "." : node.left.data + "";
		str += "->" + node.data + "<-";
		str += node.right == null ? "." : node.right.data + "";
		System.out.println(str);

		display(node.left);
		display(node.right);
	}

	public static int size(Node node) {
		if (node == null) {
			return 0;
		}
		int ls = size(node.left);
		int rs = size(node.right);
		int ts = ls + rs + 1;
		return ts;
	}

	public static int sumNodes(Node node) {
		if (node == null) {
			return 0;
		}
		int lsm = sumNodes(node.left);
		int rsm = sumNodes(node.right);
		int tsm = lsm + rsm + node.data;
		return tsm;
	}

	public static int max(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int lm = max(node.left);
		int rm = max(node.right);
		int tm = Math.max(node.data, Math.max(lm, rm));
		return tm;
	}

	public static void main(String[] args) {
		Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
				null };
		Node root = new Node(arr[0], null, null);
		Pair rtp = new Pair(root, 1);

		Stack st = new Stack<>();
		st.push(rtp);

		int idx = 0;
		while (st.size() > 0) {
			Pair top = (Pair) st.peek();

			if (top.state == 1) {
				idx++;
				if (arr[idx] != null) {
					Node ln = new Node(arr[idx], null, null);
					top.node.left = ln;

					Pair lf = new Pair(ln, 1);
					st.push(lf);

				} else {
					top.node.left = null;
				}
				top.state++;

			} else if (top.state == 2) {
				idx++;
				if (arr[idx] != null) {
					Node rn = new Node(arr[idx], null, null);
					top.node.right = rn;

					Pair lf = new Pair(rn, 1);
					st.push(lf);

				} else {
					top.node.right = null;
				}
				top.state++;
			} else {
				st.pop();
			}
		}

//		display(root);
		System.out.println(size(root));
		System.out.println(sumNodes(root));
		System.out.println(max(root));
	}

}
