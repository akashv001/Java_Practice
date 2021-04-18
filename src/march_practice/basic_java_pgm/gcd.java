package march_practice.basic_java_pgm;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = gcd(60, 45);
		System.out.println(ans);
	}

	// dividend=p=60 divisor=q=36
	public static int gcd(int p, int q) {
		while (p % q > 0) {
			int rem = p % q;
			p = q;
			q = rem;
		}
		return q;
	}

}
