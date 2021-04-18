package lecture11.DyanamicStackandQueue;

import lecture11.StackusingArrays;

public class DynamicStackclient {

	public static void main(String[] args) throws Exception {
		StackusingArrays stack = new DynamicStack(5);

		for (int i = 1; i <= 5; i++) {
			stack.push(i * 10);
			stack.display();
		}

		stack.push(60);
		stack.push(70);
		stack.push(80);
		stack.display();
		System.out.println(stack.top());

		while (!stack.isEmpty()) {
			stack.display();
			stack.pop();
		}

	}
}