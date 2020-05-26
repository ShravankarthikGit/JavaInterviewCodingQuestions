package JavaList;

import java.util.*;

public class LinkedListExample {
	public static void main(String[] args) {

		LinkedList<String> Llist = new LinkedList<String>();

		if (Llist.size() > 0) {
			Iterator<String> remiter = Llist.iterator();
			while (remiter.hasNext()) {
				remiter.remove();
			}
		}

		Llist.add("OneValue");
		Llist.add("TwoValue");
		Llist.add("ThreeValue");
		Llist.add("FourValue");
		Llist.add("FiveValue");
		Llist.add("SixValue");

		LinkedList<String> LlistTwo = new LinkedList<String>();
		LlistTwo.add("SecondlistOneValue");
		LlistTwo.add("SecondlistTwoValue");

		ListIterator<String> listit = Llist.listIterator();
		while (listit.hasNext()) {
			System.out.println("Valued from linked list : " + listit.next());
		}
		System.out.println("linked list values are : " + Llist);

		// Adding an element at the specific position
		Llist.add(0, "ZeroValueadded");
		System.out.println("linked list after adding values are : " + Llist);

		// Arraylist after removing
		Llist.remove(0);
		System.out.println("linked list after removing values are : " + Llist);

		// Adding second list elements to the first list
		Llist.addAll(LlistTwo);
		System.out.println("linked list  plus listtwo values are : " + Llist);

		// Remove secondlist
		Llist.removeAll(LlistTwo);
		System.out.println("linked list  minus listtwo values are : " + Llist);

		// Adding second list elements to the first list at specific position
		Llist.addAll(4, LlistTwo);
		System.out.println("linked list  plus listtwo at index 4 values are : " + Llist);
		
		// removing second list elements to the first list at specific position
		Llist.removeAll(LlistTwo);
		System.out.println("linked list  minus listtwo values at specific position are : " + Llist);
		
		// Adding an element at the first position
		Llist.addFirst("ZeroValueadded");
		System.out.println("linked list after adding value at first position : " + Llist);
		
		// Removing an element at the first position
		Llist.removeFirst();
		System.out.println("linked list after removing value at first position : " + Llist);
		
		// Adding an element at the last position
		Llist.addLast("LastValueadded");
		System.out.println("linked list after adding value at last position : " + Llist);
		
		// Removing an element at the last position
		Llist.removeLast();
		System.out.println("linked list after removing value at last position : " + Llist);
		
		
		
		
		
		
		
	}
}
