package lecture16;

import java.util.Comparator;

public class genericsdemo {

	public static void main(String[] args) {
//		Integer[] arri = { 2, 7, 4, 3, 6 };
//		display(arri);
//
//		String[] arrs = { "hello", "vik", "tiv", "higi" };
//		display(arrs);

		car[] cars = new car[5];
		cars[0] = new car(1000, 50, "red");
		cars[1] = new car(3000, 80, "green");
		cars[2] = new car(2000, 75, "blue");
		cars[3] = new car(1500, 20, "yellow");
		cars[4] = new car(3500, 70, "red");
		bubblesort(cars,new carSpeedComparator());
		display(cars);
		
		bubblesort(cars,new carPriceComparator());
		display(cars);
		
		bubblesort(cars,new carColorComparator());
		display(cars);
//		Object obj = new Object();
	}

//	public static void display(String[] arrs) {
//		for (String val : arrs) {
//			System.out.println(val + " ");
//		}
//	}
//
//	public static void display(int[] arr) {
//		for (int value : arr) {
//			System.out.println(value + " ");
//		}
//	}

	public static <T> void display(T[] arr) {
		for (T value : arr) {
			System.out.print(value + " ");
			System.out.println();
		}
		System.out.println();
	}

	public static < T > int bubblesort(T[] arr, Comparator <T> comparator) {
		int counter = 0;
		while (counter < arr.length - 1) {
			int j = 0;
			while (j < arr.length - 1 - counter) {
				if (comparator.compare(arr[j],arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
				j++;
			}
			counter++;
		}

		return -1;
	}
}
