package lecture11;

public class clientofStudent1 {

	public static void main(String[] args) {
		System.out.println("Hello");
		Student1 s1 = new Student1();
//		s1.age=-10;
//		System.out.println(s1.age);

		try {
			s1.setAge(10);
			System.out.println("after statement");
		} catch (Exception e) {
			System.out.println("in catch block");
		}
		System.out.println("bye");
		System.out.println(s1.getAge());

	}

}
