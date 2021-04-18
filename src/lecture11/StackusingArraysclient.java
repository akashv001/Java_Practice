package lecture11;

public class StackusingArraysclient {

	public static void main(String[] args) throws Exception {
		StackusingArrays stack = new StackusingArrays(5);
//		stack.push(20);
//		stack.display();
//		stack.push(10);
//		stack.display();

		for (int i = 1; i <= 5; i++) {
			stack.push(i * 10);
			stack.display();
		}
//		stack.push(60);
//		System.out.println(stack.top());
//		stack.pop();
//		stack.display();
//		System.out.println(stack.top());
		while (!stack.isEmpty()) {

			stack.display();
			stack.pop();
}
//		System.out.println(stack.top());

	}
}