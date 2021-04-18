package lecture11;

public class student {
	// private is used for data hiding
	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) throws Exception {
		// bussiness rule checked
		if (name.equals("") || name == null) {
			throw new Exception("please enter a valid name");
		}

		this.name = name;
	}

	// final means value can be set only once. it can be public.
	public final int rollno;

	// static means,it belongs to the class
	private static int Numofstudents = 0;

	public static int getNumofstudents() {
		return student.Numofstudents;
	}

	private static String uniformColor = "white";

	public static String getuniformColor() {
		return student.uniformColor;
	}

	public static void setuniformColor(String color) {
		student.uniformColor = color;
	}

	// nothing more than the effects of both static and final keywords
	public static final int Max_students = 1000;

	public student(String name) throws Exception {
		if (student.Numofstudents == student.Max_students) {
			throw new Exception("Max students is already reached");
		}
		this.setName(name);
		student.Numofstudents++;
		this.rollno = student.Numofstudents;
	}

// a non static fxn can access both static and non static data members
	public void ANonStaticFunction() {
		System.out.println(this.name + " says hello to " + student.Numofstudents + " students.");
	}

//a static fxn can access only static data members
// cann't use this
// cann't use non-static data members
// no need to create object, can be called directly via class name

	public static void AStaticFunction() {
		System.out.println(student.Numofstudents + " out of possible " + student.Max_students);
	}

}