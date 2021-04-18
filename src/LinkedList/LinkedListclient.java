package LinkedList;

public class LinkedListclient {

	public static void main(String[] args)throws Exception {
		LinkedList ll=new LinkedList();
//		ll.display();
//		ll.addLast(10);
//		ll.addLast(20);
//		ll.addLast(30);
//		ll.addLast(40);
//		ll.addLast(50);
		ll.display();
		
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addFirst(40);
		ll.addFirst(50);
		ll.display();
		
		ll.addFirst(60);
		ll.display();
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		
		System.out.println(ll.getAt(2));
		System.out.println(ll.getNodeAt(2));
		
		ll.addAt(100,2);
		ll.display();
		
		System.out.println("*********");
		System.out.println(ll.removeFirst());
		ll.display();
		
		System.out.println("***********");
		System.out.println(ll.removeLast());
		ll.display();
		
		System.out.println("****");
		System.out.println(ll.removeAt(2));
		ll.display();
		
        ll.display();
		ll.reverseData();
		ll.display();
	}

}
