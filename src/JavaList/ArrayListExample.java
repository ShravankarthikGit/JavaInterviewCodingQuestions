package JavaList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String Args[]) {
		ArrayList<String> arrlist = new ArrayList<String>();

		arrlist.add("StringOne");
		arrlist.add("StringTwo");
		arrlist.add("StringThree");
		arrlist.add("StringFour");
		arrlist.add("StringFive");

		ArrayList<String> arrlistTwo = new ArrayList<String>();
		// New arraylist created
		arrlistTwo.add("StringTwo");

		for (String i : arrlist) {
			System.out.println("values of arrlist using enhanced for loop: " + i);
		}

		Iterator<String> ite = arrlist.iterator();
		while (ite.hasNext()) {
			System.out.println("values of arrlist using while loop and iterator : " + ite.next());
		}

		// Traverse through reverse order using list iterator
		ListIterator<String> iteOneRev = arrlist.listIterator(arrlist.size());
		while (iteOneRev.hasPrevious()) {
			System.out.println(
					"values of arrlist in reverse using while loop and listiterator : " + iteOneRev.previous());
		}
		

		// Traverse through using list iterator
		ListIterator<String> iteOne = arrlist.listIterator();
		while (iteOne.hasNext()) {
			System.out.println("values of arrlist using while loop and listiterator : " + iteOne.next());
		}

		System.out.println("Traversing list through forEach() method:");
		// The forEach() method is a new feature, introduced in Java 8.
		arrlist.forEach(a -> { // Here, we are using lambda expression
			System.out.println("values of arrlist using for each/lambda loop and listiterator : " + a);
		});

		System.out.println("Traversing list through forEachRemaining() method:");
		Iterator<String> itr = arrlist.iterator();
		itr.forEachRemaining(a -> // Here, we are using lambda expression
		{
			System.out.println(a);
		});

		// Adding elements to arraylist
		addElementsToArrayList(arrlist);
		newArrayListToArrayList(arrlist);
		GetSimiliarElementsofTwoArrayLists(arrlist, arrlistTwo);
		AddDuplicateElements(arrlist);
		AddNullElements(arrlist);
		GetElementsWithIndex(arrlist);

	}

	public static void addElementsToArrayList(ArrayList<String> arrlist) {
		arrlist.add("Addedstudentone");
		arrlist.add("Addedstudenttwo");
		arrlist.add("Addedstudentthree");
		arrlist.add("Addedstudentfour");
		for (String i : arrlist) {
			System.out.println("values of arrlist after adding elements: " + i);
		}
	}

	public static void newArrayListToArrayList(ArrayList<String> arrlist) {
		ArrayList<String> arrlistTwo = new ArrayList<String>();
		// New arraylist created
		arrlistTwo.add("NewAddedstudentone");
		arrlistTwo.add("NewAddedstudenttwo");
		arrlistTwo.add("NewAddedstudentthree");
		// Add new arraylist to arrlist
		arrlist.addAll(arrlistTwo);

		for (String i : arrlist) {
			System.out.println("values of arrlist after adding elements from arrlistTwo : " + i);
		}

		// remove elements of added arraylistTwo from arrlist
		arrlist.removeAll(arrlistTwo);
		Object[] arr = arrlist.toArray();
		System.out.println("values of arrlist after removing elements from arrlistTwo : " + Arrays.toString(arr));

		// remove element from arrlist
		// arrlist.removeIf(Str -> Str.contains("One"));
		arrlist.removeIf(n -> n.equals("StringOne"));
		Object[] arrone = arrlist.toArray();
		System.out.println("values of arrlist after removing StringOne : " + Arrays.toString(arrone));

	}

	public static void GetSimiliarElementsofTwoArrayLists(ArrayList<String> arrlist, ArrayList<String> arrlistTwo) {
		arrlist.retainAll(arrlistTwo);
		for (String i : arrlist) {
			System.out.println("values common in arrlist and arrlistTwo: " + i);
		}
	}

	public static void AddDuplicateElements(ArrayList<String> arrlist) {
		// Arrlist contains only one element "StringTwo"
		arrlist.add("StringTwo");
		Object[] arrone = arrlist.toArray();
		System.out.println("values of arrlist after adding duplicate StringTwo : " + Arrays.toString(arrone));
	}

	public static void AddNullElements(ArrayList<String> arrlist) {
		// Arrlist contains two elements "StringTwo"
		arrlist.add(null);
		arrlist.add(null);
		Object[] arrone = arrlist.toArray();
		System.out.println("values of arrlist after adding null : " + Arrays.toString(arrone));
	}

	public static void GetElementsWithIndex(ArrayList<String> arrlist) {
		// Arrlist contains two elements "StringTwo"
		// System.out.println(arrlist.get(0));

		for (int i = 0; i < arrlist.size(); i++) {
			String st = arrlist.get(i);
			System.out.println("Get values of arrlist using index : " + st);
		}
	}

}
