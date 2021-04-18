package mypractice;

public class find_frequnecy_of_characters_inString {

	public static void main(String[] args) {
	String str="Aakash"	;  // a-2 A-1 k-1 s-1 h-1
	frequency(str);
	}
   public static void frequency(String str) {
	 int [] count=new int[256];
	 for(int i=0;i<str.length();i++) {
		 count[str.charAt(i)]++;
	 }
	 StringBuilder st=new StringBuilder();
	for(int i=0;i<count.length;i++) {
		if(count[i]!=0) {
		st.append(count[i]+" ");
	}
   }
	System.out.println(st);
}
}