package inheritance;

public class client {

	public static void main(String[] args) {
		System.out.println("Case -1");
		P obj = new P();
		System.out.println(obj.d);
		System.out.println(obj.d1);
		obj.fun();
		obj.fun1();
		obj.fun3();

		System.out.println("Case-2");
		P obj1 = new C();
		System.out.println(obj1.d);
		System.out.println(obj1.d1);
		System.out.println(((C) obj1).d2);
		obj1.fun();
		obj1.fun1();
		((C) obj1).fun2();
		obj1.fun3(); // remember it is calling a fxn which is static

		System.out.println("Case-3");
		C obj2 = new C();
		System.out.println(obj2.d);
		System.out.println(obj2.d1);
		System.out.println(obj2.d2);
		obj2.fun();
		((P)obj2).fun();
		obj2.fun1();
		obj2.fun2();
		obj2.fun3();
		((P) obj2).fun3();
		  P.fun3();   // calling static fxn directly by its class name
		  C.fun3();    // calling static fxn directly by its class name

	}

}
