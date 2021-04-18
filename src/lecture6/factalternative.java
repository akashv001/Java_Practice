package lecture6;

public class factalternative {

	public static void main(String[] args) {
		int p;
		p=power(2,5);
		System.out.println(p);
	}

	public static int power(int x, int n) {
		if(n==0) {
			return 1;
		}
		int pnm1=power(x,n-1);
		int pn=x*pnm1;
		return pn;
	}
	}
