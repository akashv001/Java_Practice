package stack_queue;

public class QueueusingArraysclient {

	public static void main(String[] args) throws Exception {
		QueueusingArrays queue = new QueueusingArrays(5);
//    queue.enqueue(10);
//    queue.display();
//    
//    queue.enqueue(20);
//    queue.display();

		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i * 10);
			queue.display();
		}
//    queue.enqueue(60);
//		System.out.println("**********");
//		while (!queue.isEmpty()) {
//			queue.display();
//			System.out.println("Front" + queue.front());
//			queue.dequeue();
//		}
	}

}
