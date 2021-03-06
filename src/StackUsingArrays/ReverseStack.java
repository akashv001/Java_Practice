package StackUsingArrays;

public class ReverseStack {

	public static void main(String[] args)throws Exception {
		StackUsingArrays stack=new StackUsingArrays(5);
		for(int i=1;i<6;i++) {
			stack.push(i*10);
		} stack.display();
		
		StackUsingArrays helper=new StackUsingArrays(5);
		reverseStack(stack,helper,0);
		System.out.println("Reverse Array");
         stack.display();
	}

	public static void reverseStack(StackUsingArrays stack, StackUsingArrays helper,int index)throws Exception {
	    if(stack.isEmpty()) {
		  return ;
	  }
	  int item=stack.pop();
	  reverseStack(stack, helper, index+1);
	  helper.push(item);
	  if(index==0) {
       while(!helper.isEmpty()) {
    	  int rv= helper.pop();
    	   stack.push(rv);
       }
	}

}
}