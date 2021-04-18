package oopspractice;

public class personmyclient {
	public static void main(String[] args) {
		myperson p1 = new myperson();
		myperson p2 = new myperson();

//       p1.age=10;
//       p2.name="B";

		System.out.println(p1.getName());
		System.out.println(p1.getAge());

		p2.setAge(5);
		p2.setName("A");

		System.out.println(p2.getName());
		System.out.println(p2.getAge());
	}
}
