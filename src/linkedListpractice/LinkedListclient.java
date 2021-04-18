package linkedListpractice;

public class LinkedListclient {

	public static void main(String[] args) throws Exception {
		LinkedList list = new LinkedList();
		list.addFirst(10);
		list.addLast(20);
		list.addLast(30);
		list.addFirst(40);
		list.addFirst(50);
		list.addAt(100, 0);
		list.display();
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.getAt(1));
		System.out.println(list.removeFirst());
		list.display();
		System.out.println(list.getAt(1));
	}

}
