package stack;

public class stackusingArrays {

	private int[] data;
	private int top;

	public static final int capacity = 10;

	public stackusingArrays() throws Exception {
		this(capacity);
	}

	public stackusingArrays(int capacity) throws Exception {
		if (capacity < 1) {
			throw new Exception("Invalid Capacity.");
		}

		this.top = -1;
		this.data = new int[capacity];
	}

	public int size() {
		return this.top + 1;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void push(int item) throws Exception {
		if (this.size() == this.data.length) {
			throw new Exception("Stack is full.");
		}
		this.top++;
		this.data[this.top] = item;
	}

	public int pop() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Stack is Empty.");
		}
		int rv = this.data[this.top];
		this.data[this.top] = 0;
		this.top--;
		return rv;

	}

	public int top() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Stack is Empty.");
		}
		int rv = this.data[this.top];
		return rv;
	}

	public void display() {
		for (int i = this.top; i >= 0; i--) {
			System.out.print(this.data[i] + "=>");
		}
		System.out.println("End");
	}
}
