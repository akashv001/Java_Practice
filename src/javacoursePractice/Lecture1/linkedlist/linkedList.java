package javacoursePractice.Lecture1.linkedlist;

public class linkedList {

	private class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public void display() {
		Node temp = head;

		System.out.println("---------------");
		while (temp != null) {
			System.out.print(temp.data + ",");
			temp = temp.next;
		}
		System.out.println("End");
		System.out.println("---------------");
	}

	public void addLast(int item) {

		// create a new Node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		// Attach a new node
		if (this.size >= 1) {
			this.tail.next = nn;
		}

		// summary objects
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

		// create a new Node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		// Attach a new node
		if (this.size >= 1) {
			nn.next = head;
		}

		// summary objects
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
			throw new Exception("LL is empty");
		}

		return this.head.data;
	}

	public int getLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}

		return this.tail.data;
	}

	public int getAt(int idx) throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}

		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid index");
		}

		Node temp = this.head;

		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}

		return temp.data;
	}

	private Node getNodeAt(int idx) throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}

		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid index");
		}

		Node temp = this.head;

		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}

		return temp;
	}

	public void addAt(int item, int idx) throws Exception {
		if (idx < 0 || idx > this.size) {
			throw new Exception("Invalid index");
		}

		if (idx == 0) {
			addFirst(item);
		} else if (idx == this.size - 1) {
			addLast(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			nn.next = null;

			// Attach
			Node nm1 = getNodeAt(idx - 1);
			Node np1 = nm1.next;

			nm1.next = nn;
			nn.next = np1;

			// Summary object
			this.size++;
		}
	}

	public int removeFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}

		int rv = this.head.data;

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			this.head = this.head.next;
			this.size--;
		}

		return rv;
	}

	public int removeLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}

		int rv = this.tail.data;

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			Node nm2 = getNodeAt(this.size - 2);
			this.tail = nm2;
			this.tail.next = null;
			this.size--;
		}

		return rv;
	}

	public int removeAt(int idx) throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}

		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid index");
		}

		if (idx == 0) {
			return removeFirst();
		} else if (idx == this.size - 1) {
			return removeLast();
		} else {
			Node nm1 = getNodeAt(idx - 1);
			Node np1 = getNodeAt(idx + 1);
			Node nn = nm1.next;

			int rv = nn.data;
			nm1.next = np1;

			this.size--;

			return rv;
		}

	}

	public void reverseData() throws Exception {
		int left = 0;
		int right = this.size - 1;

		while (left < right) {
			Node ln = getNodeAt(left);
			Node rn = getNodeAt(right);

			int temp = ln.data;
			ln.data = rn.data;
			rn.data = temp;

			left++;
			right--;
		}

	}

	public void reversePointer() {
		Node prev = this.head;
		Node curr = prev.next;

		while (curr != null) {
			Node ahead = curr.next;
			curr.next = prev;

			prev = curr;
			curr = ahead;
		}

		// swapping
		Node t = this.head;
		this.head = this.tail;
		this.tail = t;

	}

	public int mid() {
		Node slow = this.head;
		Node fast = this.head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow.data;

	}
}