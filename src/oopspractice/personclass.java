package oopspractice;

public class personclass {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2=new Person();
		Person p3=new Person(10);
		Person p4=new Person(6,"A");
//		System.out.println(p1.name);
//		System.out.println(p1.age);

//		System.out.println(p1.getName());
//		System.out.println(p1.getAge());
//
//		p1.setName("A");
//		p1.setAge(10);

		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p2.getName());
		System.out.println(p3.getAge());
		System.out.println(p4.getName());
		System.out.println(p4.getAge());

	}

}
