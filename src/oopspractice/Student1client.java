package oopspractice;

public class Student1client {

	public static void main(String[] args) throws Exception {
		System.out.println("hello");
		Student1 s1 = new Student1();

		try {
			s1.setAge(10);
			System.out.println("in try block ");
		} catch (Exception e) {
			System.out.println(" in catch block ");
		}
		System.out.println("bye");
		System.out.println(s1.getAge());
	}

}
