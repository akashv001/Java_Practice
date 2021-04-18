package LinkedList;

public class LinkedList {

	private class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public void display() {

		Node temp = this.head;

		System.out.println("----------------------------");

		while (temp != null) {
			System.out.print(temp.data + ",");
			temp = temp.next;
		}
		System.out.println(".");
		System.out.println("----------------------------");

	}

	public void addLast(int item) {

		// creating a new node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		// attach the node
		if (this.size >= 1) {
			this.tail.next = nn;
		}

		// update summary objects
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.tail = nn;
			this.size++;
		}

	}

	public void addFirst(int item) {

		// creating a new Node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		// attaching a new node
		if (this.size >= 1) {
			nn.next = head;
		}

		// updating the summary object
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.head = nn;
			this.size++;
		}
	}

	public int getFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is Empty.");
		}
		return this.head.data;
	}

	public int getLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}
		return this.tail.data;
	}

	public int getAt(int idx) throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is empty.");
		}

		if (idx < 0 || idx > this.size) {
			throw new Exception("Invalid index.");
		}

		Node temp = head;

		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}

		return temp.data;

	}

	public Node getNodeAt(int idx) throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is empty.");
		}

		if (idx < 0 || idx > this.size) {
			throw new Exception("Invalid index.");
		}

		Node temp = head;

		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}

		return temp;

	}

	public void addAt(int item, int idx) throws Exception {

		if (idx < 0 || idx > this.size) {
			throw new Exception("Invalid index.");
		}

		if (idx == 0) {
			addFirst(item);
		} else if (idx == this.size) {
			addLast(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			nn.next = null;

			Node nm1 = getNodeAt(idx - 1);
			Node np1 = nm1.next;

			nm1.next = nn;
			nn.next = np1;

			// summary update
			this.size++;

		}

	}

	public int removeFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty.");
		}

		int rv = this.head.data;

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {

			this.head = this.head.next;

			// summary object
			this.size--;
		}

		return rv;
	}

	public int removeLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty.");
		}

		int rv = this.tail.data;

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {

			int idx = this.size - 1;
			Node nm1 = getNodeAt(idx - 1);
			this.tail = nm1;
			this.tail.next = null;

			// summary object
			this.size--;
		}

		return rv;
	}

	public int removeAt(int idx) throws Exception {
		if (idx < 0 || idx > this.size) {
			throw new Exception("Invalid index.");
		}

		if (idx == 0) {
			return removeFirst();
		} else if (idx == this.size - 1) {
			return removeLast();
		} else {
			Node nm1 = getNodeAt(idx - 1);
			Node np1 = getNodeAt(idx + 1);
			Node n = nm1.next;
			nm1.next = np1;

			this.size--;
			return n.data;
		}
	}

	public void reverseData() throws Exception {
		int left = 0;
		int right = this.size - 1;

		while (left < right) {
			Node nm1 = getNodeAt(left);
			Node np1 = getNodeAt(right);

			int temp = nm1.data;
			nm1.data = np1.data;
			np1.data = temp;

			left++;
			right--;
		}

	}
}
