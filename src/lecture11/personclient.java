package lecture11;

public class personclient {

	public static void main(String[] args) {
		Person p1 = new Person(); // java itself have a default constructor so whenever p1,p2....
		Person p2 = new Person(); //..default constuctor is called itself and it doesnot gives error;
		Person p3 = new Person(25);
		Person p4 = new Person(25, "ak");

//		System.out.println(p1.name);
//		System.out.println(p1.age);

		System.out.println(p1.getName());
		System.out.println(p1.getAge());

//		p2.name="A";
//		p2.age=10;
//		p2.setName("Ak");
//		p2.setAge(10);

//		System.out.println(p2.name);
//		System.out.println(p2.age);

		System.out.println(p2.getName());
		System.out.println(p2.getAge());

		System.out.println(p3.getAge());
		System.out.println(p3.getName());

		System.out.println(p4.getAge());
		System.out.println(p4.getName());

	}

}
