package heap_practice;

public class min_heapClient {

	public static void main(String[] args) {
		min_heap heapp = new min_heap();
		heapp.add(10);
//		heapp.display();
		heapp.add(20);
//		heapp.display();
		heapp.add(30);
//		heapp.display();
		heapp.add(40);
//		heapp.display();
		heapp.add(5);
//		heapp.display();
		heapp.add(3);
		heapp.display();
		System.out.println("***************");
		System.out.println(heapp.get());
		heapp.remove();
       heapp.display();
       System.out.println(heapp.get());
       heapp.remove();
       heapp.display();
       System.out.println( heapp.isEmpty());
       System.out.println(heapp.size());
}
}