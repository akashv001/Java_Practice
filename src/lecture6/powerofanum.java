package lecture6;

public class powerofanum {

	public static void main(String[] args) {
		int va;
		va=power(5,3);
		System.out.println(va);

	}
	public static int power(int x, int n) {
		if(n==0) {
			return 1;
		}
		
		int val=x*power(x,(n-1));
		return val;
	}
	
	}
