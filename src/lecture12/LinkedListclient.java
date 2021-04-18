package lecture12;

public class LinkedListclient {

	public static void main(String[] args) throws Exception {
		LinkedList list = new LinkedList();
//		System.out.println(list.getFirst());
//		list.addLast(10);
//		list.addLast(20);
//		list.addLast(30);
//		list.display();
//
//		System.out.println("********");
		list.addFirst(40);
		list.addFirst(50);
		list.addLast(80);
		list.addFirst(60);
		list.addAt(30, 2);
		list.addFirst(10);
		list.addFirst(30);
		list.display();
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.getAt(2));
//		System.out.println(list.getNodeAt(2));
		System.out.println(list.removeFirst());
		list.display();
		System.out.println(list.removeAt(2));
		list.display();
		list.reverseData();
		list.display();
		list.reversePointers();
		list.display();
//		System.out.println();
		System.out.println(list.mid());
	}

}
