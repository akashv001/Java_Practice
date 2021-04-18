package stack_queue;

public class QueueUsingArrayss {
	private int[] data;
	private int size;
	private int front;

	public static int DEFAULT_CAPACITY = 10;

	public QueueUsingArrayss() throws Exception {
		this(DEFAULT_CAPACITY);
	}

	public QueueUsingArrayss(int capacity) throws Exception {
		if (capacity < 1) {
			throw new Exception("Invalid capacity");
		}
		this.data = new int[capacity];
		this.front = 0;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void enqueue(int value) throws Exception {
		if (this.size == this.data.length) {
			throw new Exception("Queue is full");
		}
		int ai = (this.front + this.size) % this.data.length;
		this.data[ai] = value;
		this.size++;
	}

	public int dequeue() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Queue is empty");
		}
		int rv = this.data[this.front];
		this.data[this.front] = 0;
		this.front = (this.front + 1) % this.data.length;
		this.size--;
		return rv;
	}

	public int front() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Queue is empty");
		}
		int rv = this.data[this.front];
		return rv;
	}

	public void display() {
		for (int i = 0; i < this.size; i++) {
			int ai = (this.front + i) % this.data.length;
			System.out.print(this.data[ai] + "=>");
		}
		System.out.println("END");
	}
}
