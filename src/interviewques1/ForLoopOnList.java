package interviewques1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ForLoopOnList {
	public static void main(String[] args) {
		// Declare a list with object type as string
		List<String> TestList = new ArrayList<String>();

		// Add values to list
		TestList.add("google");
		TestList.add("yahoo");
		TestList.add("bing");
		TestList.add("ting");

		// Another way of declaration of list
		List<String> crunchifyListNew = Arrays.asList("Facebook", "Paypal", "Google", "Yahoo");

		// Simple For loop
		System.out.println("\n==============> 1. for loop Example...");
		for (int i = 0; i < TestList.size(); i++) {
			System.out.println(TestList.get(i));
		}

		// enhanced for loop
		System.out.println("\n==============> 2. Enhanced for loop Example...");
		for (String i : TestList) {
			System.out.println(i);
		}

		// Iterator - Returns an iterator over the elements in this list in proper
		// sequence.
		System.out.println("\n==============> 3. Iterator Example...");
		Iterator<String> iterator = TestList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
        // ListIterator - traverse a list of elements in either forward or backward order
        // An iterator for lists that allows the programmer to traverse the list in either direction, modify the list during iteration,
        // and obtain the iterator's current position in the list.
		System.out.println("\n==============> 4. List Iterator Example...");
		ListIterator<String> listiterator = TestList.listIterator();
        while (listiterator.hasNext()) {
            System.out.println(listiterator.next());
            System.out.println(listiterator.nextIndex());
        }
		
		//While loop
		System.out.println("\n==============> 5. While loop Example...");
		int i = 0;
		while(i < TestList.size()){
			System.out.println(TestList.get(i));
			i++;
		}
		
		//For each loop
		// Iterable.forEach() util: Returns a sequential Stream with this collection as its source
		System.out.println("\n==============> 6. Iterable.forEach() Example....");
		
	     TestList.forEach((temp) -> {
	            System.out.println(temp);
	        });
		
		
		

	}

}
