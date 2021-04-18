package lecture11.DyanamicStackandQueue;

import lecture11.QueueusingArrays;

public class DynamicQueueclient {

	public static void main(String[] args) throws Exception {
		QueueusingArrays queue = new DynamicQueue(5);
		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i * 10);
			queue.display();
		}

		queue.dequeue();
		queue.display();
		queue.dequeue();
		queue.display();

		queue.enqueue(60);
		queue.enqueue(70);
		queue.enqueue(80);
		queue.enqueue(90);
		queue.display();
		System.out.println(queue.front());
		while (!queue.isEmpty()) {
			queue.dequeue();
			queue.display();
		}
//		queue.front();
	}

}
