package oopspractice;

public class Student1 {
	private String name;
	private int age;

	public void setAge(int age) throws Exception {
		if (age < 0) {
			throw new Exception(" Age cannot be negative. ");
		}
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

}
