package javacoursePractice.array;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);

		list.add(10);
		System.out.println(list.size());

		list.add(20);
		System.out.println(list.size());

		list.add(30);
		System.out.println(list);
		System.out.println(list.size());

		System.out.println(list.get(1));

		list.remove(2);
		System.out.println(list);
		System.out.println(list.size());
	}

}
