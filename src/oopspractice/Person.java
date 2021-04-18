package oopspractice;

public class Person {
	private String name;
	private int age;

	public Person() {
		System.out.println("I am the default constructor");
	}

	public Person(int age) {
		System.out.println(" I am the Parameterized constructor with one variable ");
		this.age = age;
	}

	public Person(int age, String name) {
		System.out.println(" I am the Parameterized constructor with two variable ");
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return this.name;
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
