package lecture18;

import lecture16.car;

public class HeapGclient {

	public static void main(String[] args) {
		car[] cars = new car[5];
		cars[0] = new car(1000, 50, "red");
		cars[1] = new car(3000, 80, "green");
		cars[2] = new car(2000, 75, "blue");
		cars[3] = new car(1500, 20, "yellow");
		cars[4] = new car(3500, 70, "red");
		GenericHeap<car> heapg = new GenericHeap<>();

		heapg.add(cars[0]);
		heapg.add(cars[1]);
		heapg.add(cars[2]);
		heapg.add(cars[3]);
		heapg.add(cars[4]);

		System.out.println(heapg.remove());
		System.out.println(heapg.remove());
		System.out.println(heapg.remove());
		System.out.println(heapg.remove());
		System.out.println(heapg.remove());
	}

}
