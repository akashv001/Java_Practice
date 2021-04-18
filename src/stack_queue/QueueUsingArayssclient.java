package stack_queue;

public class QueueUsingArayssclient {

	public static void main(String[] args) throws Exception {
		QueueUsingArrayss queue = new QueueUsingArrayss(5);
		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i * 10);
			queue.display();
		}
//	queue.enqueue(60);
//	queue.display();

		while (!queue.isEmpty()) {
			queue.dequeue();
			queue.display();
		}
		System.out.println("************");
//	System.out.println(queue.dequeue());
		queue.enqueue(70);
		queue.enqueue(80);
		queue.dequeue();
		queue.enqueue(90);
		queue.display();
		System.out.println(queue.front());

	}
}
