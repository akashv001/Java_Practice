package oopspractice;

public class Studentclient {

	public static void main(String[] args) throws Exception {
		Student[] s1 = new Student[1000];
		for (int i = 0; i < s1.length; i++) {
			s1[i] = new Student(i + "th");
			System.out.println(Student.GenumofStudents());
		}

//		Student.MaxStudents=2000;
//		s1[250].rollNo=10;

		System.out.println(s1[250].rollNo);
		System.out.println(s1[250].getName());
		s1[250].setName("AB");
		System.out.println(s1[250].getName());

		s1[250].ANonStatic();
//		s1[250].Astaticfxn();
		Student.Astaticfxn(); // static fxn must be used by its class name;

		System.out.println(s1[250].getuniformColor());
		s1[250].setuniformColor("red");
		System.out.println(s1[350].getuniformColor());// staticvariable belongs to class and .....
		// .....if we change the class variable change will persist for all the objects
		// variables.
	}

}
