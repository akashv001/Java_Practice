package lecture3;

public class functiondemoscope {
// gloabal variable
	public static int val=20; 
	public static void main(String[] args) {
		int one=2;
		int two=5;
		int sum=demoscope(one,two);
		System.out.println(sum);
		System.out.println(val);
		int val=200;
		System.out.println(val);
//		accessing global variale by class name when duplicate local variable is present
		System.out.println(functiondemoscope.val);
		int ans=demoscope(one,two);
		System.out.println(ans);

	}
	public static int demoscope(int one, int another) {
		int ans= one + val;
		return ans;
	}

}
