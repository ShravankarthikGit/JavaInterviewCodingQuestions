package javaQueue;

import java.util.ArrayDeque;
import java.util.Deque;

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
