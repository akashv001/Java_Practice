package stack_queue;

public class StackusingArraysclient {

	public static void main(String[] args) throws Exception {
		StackusingArrays stack = new StackusingArrays(5);
		for (int i = 1; i <= 5; i++) {
			stack.push(i * 10);
			stack.display();
		}
//      stack.push(20);
//      stack.display();
		System.out.println(stack.top());
		while (!stack.isEmpty()) {
			stack.pop();
			stack.display();
		}

//		System.out.println(stack.top());

	}

}
