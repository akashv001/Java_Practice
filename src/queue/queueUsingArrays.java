package queue;

public class queueUsingArrays {

	private int[] data;
	private int size;
	private int front;

	public static final int default_capacity = 10;

	public queueUsingArrays() throws Exception {
		this(default_capacity);
	}

	public queueUsingArrays(int capacity) throws Exception {
		if (capacity < 1) {
			throw new Exception("Invalid capacity");
		}

		this.data = new int[capacity];
		this.size = 0;
		this.front = 0;

	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void enqueue(int item) throws Exception {
		if (this.size() == this.data.length) {
			throw new Exception("Queue is full");
		}
		int ai = (this.front + this.size) % this.data.length;
		this.data[ai] = item;
		this.size++;
	}

	public int dequeue() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Queue is Empty.");
		}
		int rv = this.data[this.front];
		this.data[this.front] = 0;
		this.size--;
		this.front = (this.front + 1) % this.data.length;
		return rv;
	}

	public int top() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Queue is Empty.");
		}
		int rv = this.data[this.front];
		return rv;
	}

	public void display() {
		for (int i = 0; i < this.size; i++) {
			int ai = (this.front + i) % this.data.length;
			System.out.print(this.data[ai] + "=>");
		}
		System.out.println("End");
	}
}
