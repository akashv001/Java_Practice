package lecture11.DyanamicStackandQueue;

import lecture11.QueueusingArrays;

public class DynamicQueue extends QueueusingArrays {
	public DynamicQueue() throws Exception {
		this(DEFAULT_CAPACITY);
	}

	public DynamicQueue(int capacity) throws Exception {
		super(capacity);
	}

	public void enqueue(int item) throws Exception {
		if (this.size() == this.data.length) {
			int[] arr = new int[this.data.length * 2];
			for (int i = 0; i < this.size; i++) {
				arr[i] = this.data[(this.front + i) % this.data.length];
			}
			this.data = arr;
			this.front = 0;
		}
		super.enqueue(item);
	}
}
