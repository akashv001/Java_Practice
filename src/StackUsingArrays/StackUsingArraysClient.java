package StackUsingArrays;

public class StackUsingArraysClient {

	public static void main(String[] args) throws Exception {
		StackUsingArrays stack=new StackUsingArrays(5);
		for(int i=1;i<6;i++) {
			stack.push(i*10);
		}
//		stack.push(22);
		stack.display();
		System.out.println(stack.top());
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
			stack.display();
		}
//		stack.pop();
		System.out.println(stack.size());

	}

}
