package interviewques1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListIteration {
	public static void main(String[] args) {
		//iterator(new LinkedList<>());
		listIterator(new LinkedList<>());
		//forLoop(new LinkedList<>());
		//forEachLoop(new LinkedList<>());
	}

	public static void iterator(LinkedList<String> li) {
		li = new LinkedList<>(Arrays.asList("apple", "banana", "peach"));
		// another way to add values to list 
		li = new LinkedList<>(List.of("apple", "banana", "peach"));
		System.out.println(li);

		// add few more elements to list
		li.add("grapes");
		System.out.println(li);
		li.add(3, "pappaya");
		System.out.println(li);

		LinkedList<String> veggies = new LinkedList<>(Arrays.asList("tomato", "carrot", "beet"));
		// combine 2 lists
		li.addAll(veggies);
		System.out.println(li);

		// loop through list using iterator
		// NOTE: do not use for loop or for-each loop when using iterator
		Iterator<String> it = li.iterator();
		while (it.hasNext()) {
			String element = it.next();
			if (element.startsWith("b")) {
				it.remove(); // ✅ Safe removal during iteration
			}
		}
		// after removal of beet and banana
		System.out.println(li);
	}
	
	
	public static void listIterator(LinkedList<String> li) {
		li = new LinkedList<>(Arrays.asList("coal", "iron", "gold"));
		System.out.println(li);

		// add few more elements to list
		li.add("copper");
		System.out.println(li);
		li.add(3, "sulphur");
		System.out.println(li);
		
		// remove some elements
		li.remove("copper");
		System.out.println(li);
		
		LinkedList<String> planets = new LinkedList<>(Arrays.asList("mercury", "jupiter", "earth"));
		// combine 2 lists
		li.addAll(planets);
		System.out.println(li);

		// loop through list using ListIterator
		// NOTE: do not use for loop or for-each loop when using iterator
		ListIterator<String> it = li.listIterator();
		while (it.hasNext()) {
			String element = it.next();
			if (element.startsWith("e")) {
				it.remove(); // ✅ Safe removal during iteration
				it.add("venus");
			}
		}
		li.addFirst("FIRST");
		li.addLast("LAST");
		System.out.println(li);
		
		// Reverse list using list iterator
		ListIterator<String> it2 = li.listIterator(li.size()); // start from end
		while (it.hasPrevious()) {
			 System.out.print(it.previous() + " "); // prints: C B A
		}
		
		
		
		
		
	}
	
	
	public static void forLoop(LinkedList<String> li) {
		li = new LinkedList<>(Arrays.asList("cat", "dog", "pig", "rat"));
		for(int i = 0; i<li.size(); i++) {
			System.out.println(li.get(i));
		}
	}
	
	public static void forEachLoop(LinkedList<String> li) {
		li = new LinkedList<>(Arrays.asList("beer", "rum", "whisky", "vodka"));
		for(String ele:li) {
			System.out.println(ele.toString());
		}
	}
	
	// ✅ Better Option for LinkedList: Use Iterator
}
