public class Stack {
	
	public static void main(String[] args) {
		StackExample<Integer> stack = new StackExample<Integer>(10);
		
		stack.push(20);
		stack.push(30);
		stack.push(70);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
	
}

class StackExample<T> {
	
	private int top;
	private T[] stack;
	
	public StackExample(int size) {
		stack = (T[])new Object[size];
	}
	
	public void push(T item) {
		stack[++top] = item;
	}
	
	public T pop() {
		return (top > -1) ? stack[top--] : null;
	}
	
	public T top() {
		return (top != - 1) ? stack[top] : null;
	}
	
}