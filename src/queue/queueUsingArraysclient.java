package queue;

public class queueUsingArraysclient {

	public static void main(String[] args) throws Exception{
		queueUsingArrays queue=new queueUsingArrays(5);
		
        for(int i=1;i<=5;i++) {
        	queue.enqueue(i*10);
        }
        queue.display();
//        queue.enqueue(60);
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        
        while(!queue.isEmpty()) {
        	queue.dequeue();
        	queue.display();
        }
        queue.display();
        
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        
	}

}
