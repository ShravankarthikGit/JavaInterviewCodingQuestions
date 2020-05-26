package JavMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	// HashMap doesn't maintain any order while LinkedHashMap maintains insertion
	// order of elements in Java.
	// LinkedHashMap also requires more memory than HashMap because of this ordering
	// feature.
	// LinkedHashMap uses doubly LinkedList to keep order of elements.
	// Iterator of LinkedHashMap returns elements in the order e.g. either insertion
	// order or access order.

	public static void main(String args[]) {

		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");
		hm.put(102, "Ranga");

		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// Fetching key
		System.out.println("Keys: " + hm.keySet());
		// Fetching value
		System.out.println("Values: " + hm.values());
		// Fetching key-value pair
		System.out.println("Key-Value pairs: " + hm.entrySet());
		
		hm.remove(102);  
	    System.out.println("After invoking remove() method: "+ hm);   
	}
}
