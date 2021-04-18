package lecture11;

public class Person {
	private String name;
	private int age;

	Person() {
		System.out.println("I am the default constructor ");
	}

	Person(int age) {
		System.out.println("I am parameterized Constructor with one Arguments ");
		this.age = age;
	}

	Person(int age, String name) {
		System.out.println("I am parameterized Constructor with two parameters ");
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
