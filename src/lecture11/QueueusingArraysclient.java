package lecture11;

public class QueueusingArraysclient {

	public static void main(String[] args) throws Exception {
		QueueusingArrays queue = new QueueusingArrays(5);
		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i * 10);
			queue.display();
		}
		
		queue.dequeue();
		queue.display();
		queue.dequeue();
		queue.display();
		
		queue.enqueue(60);
		queue.display();
		
//		while(!queue.isEmpty()) {
//			queue.dequeue();
//			queue.display();
//		}
//		queue.front();
	}

}
