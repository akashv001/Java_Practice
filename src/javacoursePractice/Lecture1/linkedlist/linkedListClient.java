package javacoursePractice.Lecture1.linkedlist;

public class linkedListClient {

	public static void main(String[] args) throws Exception {
		linkedList ll = new linkedList();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addFirst(40);
		ll.addFirst(50);
		ll.addFirst(60);

		ll.addAt(70, 2);
		ll.removeFirst();
//		ll.removeLast();
		ll.display();
		System.out.println("************************");
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLast());
		ll.removeAt(2);
		ll.display();
		System.out.println(ll.removeAt(2));
		ll.display();
//		System.out.println(ll.removeLast());
//		ll.reverseData();
//		ll.display();

//		ll.reversePointer();
//		ll.display();
		System.out.println(ll.mid());
		
	}

}
