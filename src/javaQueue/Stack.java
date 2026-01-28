package javaQueue;

// Deque is not the same as a Stack, but a Deque is the recommended tool to create a stack in Java.
// // Stack is a linear data structure that follows the LIFO (Last In First Out) principle.
// Common Operations of Stack:
//  1. push(): Adds an element to the top of the stack.
//  2. pop(): Removes and returns the top element of the stack.
//  3. peek(): Returns the top element of the stack without removing it.
//  4. isEmpty(): Checks if the stack is empty.
//  5. size(): Returns the number of elements in the stack.
//

public class Stack {

	public static void main(String[] args) {
		// Implement stack using Deque
		java.util.Deque<Integer> stack = new java.util.ArrayDeque<>();
		// Push elements onto the stack
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("Stack after pushes: " + stack);
		// Peek at the top element
		System.out.println("Top element (peek): " + stack.peek());
		// Pop elements from the stack
		System.out.println("Popped element: " + stack.pop());
		System.out.println("Stack after pop: " + stack);

	}

}
