package lecture11.inheritance;

public class client {

	public static void main(String[] args) {
		System.out.println("---Case 1 ---");
		P obj1 = new P();
		System.out.println(obj1.d);
		System.out.println(obj1.d1);
		obj1.fun();
		obj1.fun1();

		System.out.println("---Case 2 ---");
		P obj2 = new C();
		System.out.println(obj2.d);
		System.out.println(((C) obj2).d);
		System.out.println(obj2.d1);
		System.out.println(((C) obj2).d2);
		obj2.fun();
		obj2.fun1();
		((C) obj2).fun2();

		System.out.println("---Case 3 ---");
		// this is case in java not allowed as it gives run time error for doubbt check
		// inheritance video.
//		C obj3 = new P();
//		System.out.println(obj3.d);
//		System.out.println(obj3.d1);
//		System.out.println(obj3.d2);

		System.out.println("---Case 4 ---");
		C obj4 = new C();
		System.out.println(obj4.d);
		System.out.println(((P) obj4).d);
		System.out.println(obj4.d1);
		System.out.println(obj4.d2);
		obj4.fun();
		((P)obj4).fun(); //first jvm goes into new c if fun present exectue fxn body.
		obj4.fun1();
		obj4.fun2();
	}

}
