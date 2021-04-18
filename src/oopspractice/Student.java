package oopspractice;

public class Student {

	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) throws Exception {
		if (name.equals("") || name == null) {
			throw new Exception(" Name cannot be empty.");
		}
		this.name = name;

	}

	public final int rollNo;

	private static int numOfStudents = 0;
	public final static int MaxStudents = 1000;

	public static int GenumofStudents() {
		return Student.numOfStudents;
	}

	public Student(String name) throws Exception {
		if (Student.numOfStudents == Student.MaxStudents) {
			throw new Exception("Max limit reached.");
		}
		this.setName(name);

		Student.numOfStudents++;
		this.rollNo = Student.numOfStudents;

	}

	public void ANonStatic() {
		System.out.println(this.name + " Says hello to " + Student.numOfStudents);
	}

	public static void Astaticfxn() {
		System.out.println(Student.numOfStudents + " out of possible " + Student.MaxStudents);
	}
	
	private static String uniformColor="white";
	
	public static String getuniformColor() {
		return Student.uniformColor;
	}
	
	public void setuniformColor(String color) {
		Student.uniformColor=color;
	}
	
	
	
	
	
	
}
