
public class ArrayStackDriver {

	public static void main(String args[]) {
		
		System.out.println("Array Stack");
		
		ArrayStackClass myStack = new ArrayStackClass<>();
		
		System.out.println("Is the stack empty? " + myStack.isEmpty());
		
		myStack.push(3);
		System.out.println(myStack);
		myStack.push(7);
		System.out.println(myStack);
		myStack.push(9);
		System.out.println(myStack);
		System.out.println("The last number on the stack is: " + myStack.peek());
		
		System.out.println("I will pop this number off the top of the stack: " + myStack.pop());
		System.out.println(myStack);
	
		myStack.push(12);
		System.out.println(myStack);
		myStack.push(74);
		System.out.println(myStack);
		myStack.push(-7);
		System.out.println(myStack);
		
		System.out.println("Is the stack empty? " + myStack.isEmpty());
	}
	
}
