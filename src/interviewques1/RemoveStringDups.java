package interviewques1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class RemoveStringDups {

	public static void main(String args[]) {

		String[] Original = { "Apple", "Banana", "Apple", "Orange", "Banana", "Grapes" };

		// Need to remove duplicates from the above array
		// Step 1 convert array to arraylist
		// Step 2 add array list elements to hashset to remove duplicates
		// Step 3 convert back to array list and print

		LinkedList<String> oGList = new LinkedList<String>();

		// Adds all elements from the array 'Original'
		oGList.addAll(Arrays.asList(Original));
		oGList.addAll(List.of(Original));
		// I added arraylist elements twice to linkedlist to show that duplicates are removed in next step
		System.out.println("Original List : " + oGList);
		// Use linkedhashset to remove duplicates and maintain order
		LinkedHashSet<String> sortset = new LinkedHashSet<String>(oGList);
		System.out.println("SortedSet : " + sortset);

		// USe for each loop to convert linkedhashset to linked list
		LinkedList<String> finalList = new LinkedList<String>();
		for (String i : sortset) {
			finalList.add(i);
		}
		System.out.println("Sorted linkedlist :" + finalList);

		// Direct conversion via constructor
		LinkedList<String> finalList2 = new LinkedList<>(sortset);
		System.out.println("Sorted linkedlist via constructor :" + finalList2);		
		
	}
}
