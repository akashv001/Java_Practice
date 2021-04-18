package Generics;

public class LinkedList<T> {
	private class Node {
		T data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	// o(n)
	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + ",");
			temp = temp.next;
		}
		System.out.println(" ");
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}

//		o(1)
	public void addLast(T item) {
		// create a new node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		// attach
		if (this.size >= 1) {
			this.tail.next = nn;
		}
		// summary object
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.tail = nn;
			this.size++;
		}
	}

	// o(1)
	public void addFirst(T item) {
		// create a new node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		// attach
		if (this.size >= 1) {
//				this.head.next = nn;  wrong method
			nn.next = head;
		}

		// summary object updation
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.head = nn;
			this.size++;
		}
	}

	public T getFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("List is empty");
		}
		return this.head.data;
	}

	public T getLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("List is empty");
		}
		return this.tail.data;
	}

	public T getAt(int idx) throws Exception {
		if (this.size == 0) {
			throw new Exception("List is empty");
		}
		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index");
		}
		Node temp = this.head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp.data;

	}

	private Node getNodeAt(int idx) throws Exception {
		if (this.size == 0) {
			throw new Exception("List is empty");
		}
		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index");
		}
		Node temp = this.head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	// o(n)
	public void addAt(T item, int idx) throws Exception {
		if (idx < 0 || idx > size) {
			throw new Exception("Invalid index.");
		}
		if (idx == 0) {
			addFirst(item);
		} else if (idx > this.size) {
			addLast(item);
		} else {
			// create a new node
			Node nn = new Node();
			nn.data = item;
			nn.next = null;

			// attach
			Node nm1 = getNodeAt(idx - 1);
			Node np1 = nm1.next;

			nm1.next = nn;
			nn.next = np1;

			// summary update
			this.size++;
		}
	}

	public T removeFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked list is empty.");
		}
		T rv = this.head.data;
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

	public T removeLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked list is empty.");
		}
		T rv = this.tail.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			Node lm2 = getNodeAt(this.size - 2);
			this.tail = lm2;
			this.tail.next = null;
			this.size--;
		}
		return rv;
	}

	public T removeAt(int idx) throws Exception {
		if (this.size == 0) {
			throw new Exception("Link list is Empty");
		}

		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid index.");
		}
		if (idx == 0) {
			return removeFirst();
		} else if (idx == this.size - 1) {
			return removeLast();
		} else {
			Node nm1 = getNodeAt(idx - 1);
			Node n = nm1.next;
			Node np1 = n.next;
			nm1.next = np1;
			this.size--;
			return n.data;

		}
	}

	public int find(T data) {
		int index = 0;
		for (Node temp = this.head; temp != null; temp = temp.next) {
			if (temp.data.equals(data)) {
				return index;
			}
			index++;
		}
		return -1;
	}

}
