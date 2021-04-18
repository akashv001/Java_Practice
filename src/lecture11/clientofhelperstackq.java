package lecture11;

public class clientofhelperstackq {
	public static void main(String[] args) throws Exception {
		StackusingArrays stack = new StackusingArrays(5);
		for (int i = 1; i <= 5; i++) {
			stack.push(i * 10);
		}
		stack.display();
		StackusingArrays helper = new StackusingArrays(5);
		reverseStack(stack, helper, 0);
		stack.display();
	}

	public static void reverseStack(StackusingArrays stack, StackusingArrays helper, int index) throws Exception {
		for (int i = 1; i <= 5; i++) {
			if (stack.isEmpty()) {
				return;
			}
			int item = stack.pop();
			reverseStack(stack, helper, index + 1);
			helper.push(item);
			if (index == 0) {
				while (!helper.isEmpty()) {
					stack.push(helper.pop());
				}

			}
		}
	}
}
