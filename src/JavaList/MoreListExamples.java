package JavaList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class MoreListExamples {
	public static void main(String[] args) {

		// Create an arraylist
		ArrayList<String> arrlist = new ArrayList<String>();

		arrlist.add("oneelement");
		arrlist.add("twoelement");
		arrlist.add("threeelement");
		arrlist.add("fourelement");

		System.out.println("values in arraylist: " + arrlist);
		// convert arraylist to array
		Object[] arr = arrlist.toArray();
		System.out.println("values in arr array: " + Arrays.toString(arr));

		// Call example methods
		ArrayToArraylist();
		GetAndSetInList();
		SortList();
		UseListIteratorOnLinkedList();

	}

	public static ArrayList<String> ArrayToArraylist() {
		// Create Sample array
		String samplearray[] = new String[5];// declaration and instantiation with length of array as 5
		samplearray[0] = "one";
		samplearray[1] = "two";
		samplearray[2] = "three";
		samplearray[3] = "four";
		samplearray[4] = "five";
		System.out.println("values in samplearray: " + Arrays.toString(samplearray));
		// Create an arraylist
		ArrayList<String> samplearrlist = new ArrayList<String>();
		// Add values from array to arraylist
		for (String i : samplearray) {
			samplearrlist.add(i);
		}
		System.out.println("values in samplearrlist: " + samplearrlist);
		return samplearrlist;
	}

	public static void GetAndSetInList() {
		// Create an arraylist
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("oneelement");
		linkedlist.add("twoelement");
		linkedlist.add("threeelement");
		linkedlist.add("fourelement");
		System.out.println("values in linkedlist: " + linkedlist);

		// Get element based on index
		System.out.println("Value at position 3 from linkedlist : " + linkedlist.get(2));

		// Set element based on index
		linkedlist.set(3, "fourelementupdated");
		System.out.println("Value at position 3 from linkedlist : " + linkedlist.get(3));
	}
	
	public static void SortList() {
		// Create an linkedlist with integers
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		linkedlist.add(22);
		linkedlist.add(12);
		linkedlist.add(1);
		linkedlist.add(44);
		System.out.println("values in linkedlist: " + linkedlist);
		
		//sort elements in linkedlist with collections
		Collections.sort(linkedlist);
		System.out.println("values in linkedlist after sort : " + linkedlist);
		
		// Create an arraylist with String
		LinkedList<String> stringlinkedlist = new LinkedList<String>();
		stringlinkedlist.add("apple");
		stringlinkedlist.add("zebra");
		stringlinkedlist.add("cat");
		stringlinkedlist.add("parrot");
		System.out.println("values in arraylist: " + stringlinkedlist);
		
		//sort elements in linkedlist with collections
		Collections.sort(stringlinkedlist);
		System.out.println("values in stringlinkedlist after sort : " + stringlinkedlist);	
	}
	
	public static void UseListIteratorOnLinkedList() {
		// Create a linkedlist
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("oneelement");
		linkedlist.add("twoelement");
		linkedlist.add("threeelement");
		linkedlist.add("fourelement");
		System.out.println("values in linkedlist: " + linkedlist);
		
		ListIterator<String> listIte = linkedlist.listIterator();
		
		while(listIte.hasNext()) {
			System.out.println (" Value of Index: " + listIte.nextIndex() + " And Value of element : " + listIte.next());
		}
		
		while(listIte.hasPrevious()) {
			System.out.println (" Value of Index: " + listIte.previousIndex() + " And Value of element : " + listIte.previous());
		}
		
		
	}
	
}
