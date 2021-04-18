package oops;

public class Personclient {

	public static void main(String[] args) {
		Person p=new Person();
		Person p1=new Person(20);
		Person p2=new Person(25,"Akash");
		
		p.setAge(40);
//		p.setName("Akash");
		
		
		System.out.println(p.getAge());
		System.out.println(p.getName());
		
		System.out.println(p1.getAge());
		System.out.println(p1.getName());
		
		System.out.println(p2.getAge());
		System.out.println(p2.getName());

	}

}
