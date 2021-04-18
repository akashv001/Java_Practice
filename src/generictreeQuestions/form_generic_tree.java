package generictreeQuestions;

import java.util.*;
import java.util.ArrayList;
import java.util.Stack;

public class form_generic_tree {
	private static class Node {
		int data;
		ArrayList<Node> Children = new ArrayList<>();

		Node() {

		}

		Node(int data) {
			this.data = data;
		}
	}

	public static void display(Node node) {
		String str = node.data + "=>";
		for (Node child : node.Children) {
			str += child.data + ",";
		}
		str += "End";
		System.out.println(str);
		for (Node child : node.Children) {
			display(child);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
				-1 };
		Node root = null;
		Stack<Node> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == -1) {
				st.pop();
			} else {
				Node t = new Node();
				t.data = arr[i];

				if (st.size() > 0) {
					st.peek().Children.add(t);
				} else {
					root = t;
				}
				st.push(t);
			}
		}
//		display(root);
//		System.out.println(size(root));
//		System.out.println(maxNode(root));
//		System.out.println(height(root));
//		preOrder(root);
//		LevelOrder(root);
//		levelZigzag(root);
//		LevelOrder2(root);
//		LevelOrder3(root);
//		LevelOrder4(root);
//		mirrorImage(root);
		removeLeaves(root);
	}

	public static int size(Node node) {
		int s = 0;
		for (Node child : node.Children) {
			int cs = size(child);
			s = s + cs;
		}
		s = s + 1;
		return s;
	}

	public static int maxNode(Node node) {
		int max = Integer.MIN_VALUE;
		for (Node child : node.Children) {
			int cm = maxNode(child);
			max = Math.max(cm, max);
		}
		max = Math.max(node.data, max);
		return max;
	}

	public static int height(Node node) {
		int ht = -1;

		for (Node child : node.Children) {
			int ch = height(child);
			ht = Math.max(ch, ht);
		}
		ht += 1;
		return ht;
	}

	public static void preOrder(Node node) {
		System.out.println("Node Pre " + node.data);

		for (Node child : node.Children) {
			System.out.println("Edge Pre " + node.data + "--" + child.data);
			preOrder(child);
			System.out.println("Edge Post " + node.data + "--" + child.data);
		}

		System.out.println("Node Post " + node.data);
	}

	public static void LevelOrder(Node node) {
		Queue<Node> q = new ArrayDeque<>();
		Queue<Node> cq = new ArrayDeque<>();
		q.add(node);

		while (q.size() > 0) {
			node = q.remove();
			System.out.print(node.data + " ");

			for (Node child : node.Children) {
				cq.add(child);
			}

			if (q.size() == 0) {
				q = cq;
				cq = new ArrayDeque<>();
				System.out.println();
			}
		}
		System.out.println(".");
	}

	public static void LevelOrder2(Node node) {
		Queue<Node> q = new ArrayDeque<>();
		q.add(node);
		q.add(new Node(-1));

		while (q.size() > 0) {
			node = q.remove();
			if (node.data != -1) {
				System.out.print(node.data + " ");

				for (Node child : node.Children) {
					q.add(child);
				}
			} else {
				if (q.size() > 0) {
					q.add(new Node(-1));
					System.out.println();
				}

			}
		}
		System.out.println(".");
	}

	public static void LevelOrder3(Node node) {
		Queue<Node> q = new ArrayDeque<>();
		q.add(node);

		while (q.size() > 0) {
			int cicl = q.size();

			for (int i = 0; i < cicl; i++) {
				node = q.remove();
				System.out.print(node.data + " ");

				for (Node child : node.Children) {
					q.add(child);
				}
			}
			System.out.println();

		}
		System.out.println(".");
	}

	private static class Pair {
		Node node;
		int level;

		Pair(Node node, int level) {
			this.node = node;
			this.level = level;
		}
	}

	public static void LevelOrder4(Node node) {
		Queue<Pair> q = new ArrayDeque<>();
		q.add(new Pair(node, 1));

		int level = 1;
		while (q.size() > 0) {
			Pair p = q.remove();
			if (p.level > level) {
				level = p.level;
				System.out.println();
			}
			System.out.print(p.node.data + " ");

			for (Node child : p.node.Children) {
				Pair cp = new Pair(child, p.level + 1);
				q.add(cp);
			}

		}
		System.out.println(".");
	}

	public static void mirrorImage(Node node) {
		for (Node child : node.Children) {
			mirrorImage(child);
		}
		Collections.reverse(node.Children);
		display(node);
	}

	public static void levelZigzag(Node node) {
		Stack<Node> ms = new Stack<>();
		ms.push(node);

		int flag = 1;
		Stack<Node> cs = new Stack<>();

		while (ms.size() > 0) {
			node = ms.pop();
			System.out.print(node.data + " ");

			if (flag % 2 == 0) {
				for (int i = node.Children.size() - 1; i >= 0; i--) {
					Node child = node.Children.get(i);
					cs.push(child);
				}
			} else {
				for (int i = 0; i < node.Children.size(); i++) {
					Node child = node.Children.get(i);
					cs.push(child);
				}
			}

			if (ms.size() == 0) {
				ms = cs;
				cs = new Stack<>();
				flag++;
				System.out.println();
			}

		}
	}

	public static void removeLeaves(Node node) {
		for (int i = node.Children.size() - 1; i >= 0; i--) {
           Node child=node.Children.get(i);
           if(child.Children.size()==0) {
        	   node.Children.remove(child);
           }
		}

		for (Node child : node.Children) {
			removeLeaves(child);
		}
		
		display(node);
	}
}
