package stack;

public class stackusingArrayclient {

	public static void main(String[] args) throws Exception{
		stackusingArrays st=new stackusingArrays(5);
        
		for(int i=1;i<=5;i++) {
			st.push(i*10);
		}
		
		st.display();
		
		while(!st.isEmpty()) {
			st.pop();
			st.display();
		}
		
		st.display();
	}

}
