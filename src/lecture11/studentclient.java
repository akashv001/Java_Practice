package lecture11;

public class studentclient {

	public static void main(String[] args) throws Exception {
		// only array created , no student is created yet
		student[] students = new student[1000];

		for (int i = 0; i <= students.length - 1; i++) {
			students[i] = new student(i + "th");
			System.out.println(student.getNumofstudents());
		}

		// able to access static field but cannot change the value

		// student.Max_students=2000;
		// students[250].rollno=10;
		System.out.println(students[250].rollno);
		System.out.println(students[250].getName());
		students[250].setName("ABC"); // changing name in static will change all name in the class...
										// ....
		System.out.println(students[250].getName());
		students[250].setuniformColor("blue");
		System.out.println(student.getuniformColor());

		System.out.println("*********");
		System.out.println(students[150].getName());
		System.out.println(students[999].getName());
//		System.out.println(this.getName()); wrong method

		students[250].ANonStaticFunction();
		students[250].AStaticFunction();
		student.AStaticFunction();
	}

}
