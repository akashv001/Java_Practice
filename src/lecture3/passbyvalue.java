package lecture3;

public class passbyvalue {

	public static void main(String[] args) {
		int one=10;
		int two=20;
		System.out.println(one+","+two);
		swapdemo(one,two);
		System.out.println(one+","+two);

	}
	public static void swapdemo(int one,int two) {
		System.out.println(one+","+two);
		int temp=one;
		one=two;
		two=temp;
		System.out.println(one+","+two);
		
	}

}
