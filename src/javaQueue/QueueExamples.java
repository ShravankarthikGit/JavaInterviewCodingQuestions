package javaQueue;

import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;


// Queue in Java is a collection designed for holding elements prior to processing, typically following the FIFO (First-In-First-Out) principle. 
// It is part of the java.util package and extends the Collection interface
// Uses of queue
// 1. Task Scheduling: Queues are used in task scheduling algorithms to manage tasks waiting for execution.
// 2. Print Spooling: In printing systems, print jobs are queued before being sent to the printer.
// 3. Breadth-First Search (BFS): Queues are used in graph traversal algorithms like BFS to explore nodes level by level.
// 4. Resource Management: Queues help manage access to shared resources in multi-threaded environments.
// 5. Messaging Systems: Queues are fundamental in messaging systems for handling message delivery between producers and consumers.

// Different Implementations of Queue in Java:
// 1. LinkedList: Implements the Queue interface and provides a doubly-linked list structure.
// 2. PriorityQueue: Implements the Queue interface and orders elements based on their natural ordering or a specified comparator.
// 3. ArrayDeque: Implements the Deque interface and provides a resizable array implementation of a double-ended queue.
// 4. ConcurrentLinkedQueue: A thread-safe implementation of the Queue interface suitable for concurrent access.
// 5. BlockingQueue: An interface that extends Queue and provides thread-safe operations for blocking and waiting for elements.
//


public class QueueExamples {
	public static void main(String args[]) {
		//The PriorityQueue class implements the Queue interface. It holds the elements or objects which are to be processed by their priorities. 
		//PriorityQueue doesn't allow null values to be stored in the queue.
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Amit");
		queue.add("Vijay");
		queue.add("Karan");
		queue.add("Jai");
		queue.add("Rahul");
		//It is used to retrieves, but does not remove, the head of this queue.
		System.out.println("head:" + queue.element());
		//It is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
		System.out.println("head:" + queue.peek());
		System.out.println("iterating the queue elements:");
		java.util.Iterator<String> itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		//Used to retrieves and removes the head of this queue.
		queue.remove();
		//Used to retrieves and removes the head of this queue, or returns null if this queue is empty.
		queue.poll();
		System.out.println("after removing two elements:");
		java.util.Iterator<String> itr2 = queue.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
