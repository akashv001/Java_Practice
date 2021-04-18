package stack_queue;

public class StackusingArraysGeneric<T> {
	private T[] data;
	private int top;

	public static final int DEFAULT_CAPACITY = 10;

	public StackusingArraysGeneric() throws Exception {
		this(DEFAULT_CAPACITY);
	}

	public StackusingArraysGeneric(int capacity) throws Exception {
		if (this.top == -1) {
			throw new Exception("Invalid  Capacity .");
		}
		this.data = (T[]) new Object[capacity];
		this.top = -1;
	}

	public int size() {
		return this.top + 1;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void push(T value) throws Exception {
		if (this.size() == this.data.length) {
			throw new Exception("Stack is full.");
		}
		this.top++;
		this.data[this.top] = value;
	}

	public T pop() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Stack is empty.");
		}
		T rv = this.data[this.top];
		this.data[this.top] = null;
		this.top--;
		return rv;
	}

	public T top() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Stack is empty.");
		}
		T rv = this.data[this.top];
		return rv;
	}

	public void display() {
		for (int i = this.top; i >= 0; i--) {
			System.out.print(this.data[i] + ",");
		}
		System.out.println("End");
	}

}
