package lecture11;

public class QueueusingArrays {
	protected int[] data;
	protected int size;
	protected int front;

	public static final int DEFAULT_CAPACITY = 10;

	public QueueusingArrays() throws Exception {
		this(DEFAULT_CAPACITY);
	}

	public QueueusingArrays(int capacity) throws Exception {
		if (capacity < 1) {
			throw new Exception("Queue is Empty.");
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
			throw new Exception("Queue is Full");
		}
		int ai = (this.front + this.size) % this.data.length;
		this.data[ai] = value;
		this.size++;
	}

	public int dequeue() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Queue is Empty");
		}
		int rv = this.data[this.front];
		this.data[this.front] = 0;
		this.size--;
		this.front = (this.front + 1) % this.data.length;
		return rv;
	}

	public int front() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Queue is Empty");
		}
		int rv = this.data[this.front];
		return rv;
	}

	public void display() {
		for (int i = 0; i < this.size; i++) {
			int ce = (this.front + i) % this.data.length;
			System.out.print(this.data[ce] + " => " );
		}
		System.out.println("END");
	}
}
