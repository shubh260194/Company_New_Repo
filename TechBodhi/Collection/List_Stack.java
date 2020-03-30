package Collection;

import java.util.Stack;

public class List_Stack {

	 // child class of Vector
	// specially designed for LIFO
	// push :add object into stack
	// pop :remove and return last element of stack
	// peek :to return top of the stack, without removal
	// Empty :to check stack is empty or not
	// search : returns offset,( from top whts the position of element )
	
	public static void main(String[] args) {
		
		// constructors 
		
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s);
		System.out.println(s.peek()); // return last element
		System.out.println(s);
		System.out.println(s.pop());// return last element and remove it from stack
		System.out.println(s);
		System.out.println(s.search(30));
		
		
	}

}
