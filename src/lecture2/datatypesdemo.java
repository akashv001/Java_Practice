package lecture2;

public class datatypesdemo {

	public static void main(String[] args) {
		int in = 40;
		short sh = 23;
		byte b = 2;
		long lg = 233;

//		b=in;
//		b=sh;
//		b=lg;

		sh = b;
//		sh=in;
//		sh=lg;

		in = b;
		in = sh;
//		in=lg;

		lg = in;
		lg = b;
		lg = sh;

		// part-2

//		ba = 127;
//		ba = -127;
//		ba = (byte) 128;


        //  part-3
		int i = 1000000000;
		long l = 10000000000L;
		System.out.println(l);

		// part-4
		short s = 1222;
		
		// part-5
		float a=5.5f;
		System.out.println(a);
		double ab=5.5;
		System.out.println(ab);
		
		System.out.println("**********");
		
		// part-6
		in=(int)a;
		System.out.println(in);
        a=in;
        System.out.println(a);
        
        // part-7
        boolean bit=true;
        if(bit) {
        	System.out.println("hello");
        }
        else {
        	System.out.println("bye");
        }
        
        System.out.println("****************");
        bit=false;
        if(bit) {
        	System.out.println("hello");
        }
        else {
        	System.out.println("bye");
        	
        	// part-8
        	char ch='a';
        	ch=99;
//        	System.out.println(ch);
        	System.out.println(ch);
        	
//        	char chh=6400;
//        	System.out.println(chh);
        	
        	 ch=(char)(ch+2);
        	System.out.println(ch);
        	
        	in=ch;
        	System.out.println(in);
        	
        	ch=(char)68000;
        	System.out.println(ch);
        	
        	//part-9
        	
        	System.out.println(10+20+"hello"+10+20);
        	System.out.println(2+' '+5);
        	System.out.println(2+" "+5);
        	System.out.println("hello"+' '+"world");
        	System.out.println("hello"+" "+"world");
        	}
        
	}

}
