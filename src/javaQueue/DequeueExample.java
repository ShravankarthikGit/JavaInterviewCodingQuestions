package javaQueue;

import java.util.ArrayDeque;
import java.util.Deque;


// Dequeue (Double Ended Queue) is a linear collection that supports the insertion and removal of elements from both ends.
// It can be used as both a queue (FIFO) and a stack (LIFO).
// Common Implementations of Deque in Java:
// 1. ArrayDeque: A resizable array implementation of the Deque interface. It is not thread-safe and provides better performance than LinkedList for most operations.
// 2. LinkedList: Implements the Deque interface using a doubly-linked list structure. It allows null elements and is not thread-safe.
// 3. ConcurrentLinkedDeque: A thread-safe implementation of the Deque interface suitable for concurrent access.
//

public class DequeueExample {
	public static void main(String[] args) {
		ArrayDeque<String> deque = new ArrayDeque<String>();
		// Will be added at first
		deque.offer("arvind");
		// Will be added at second
		deque.offer("vimal");
		// Will be added third
		deque.add("mukul");
		// Will be added first to all
		deque.offerFirst("jai");
		System.out.println("After offerFirst Traversal...");
		for (String s : deque) {
			System.out.println(s);
		}
		// Removes first element in the queue
		deque.pollFirst();// it is same as poll()
		// Removes last element in the queue
		deque.pollLast();
		System.out.println("After pollLast() and pollfirst() Traversal...");
		for (String s : deque) {
			System.out.println(s);
		}
	}
}
