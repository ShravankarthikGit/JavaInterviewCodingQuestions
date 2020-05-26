package javaQueue;

import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

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
