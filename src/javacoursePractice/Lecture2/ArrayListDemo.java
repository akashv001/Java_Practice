package javacoursePractice.Lecture2;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println(list);
		
		list.add(5);
		System.out.println(list);
		System.out.println(list.size());
		
		list.add(15);
		System.out.println(list);
		System.out.println(list.size());
		
		list.add(25);
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println(list.get(2));
		
	}

}
