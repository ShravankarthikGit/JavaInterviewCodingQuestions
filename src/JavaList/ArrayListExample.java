package JavaList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
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
		// addElementsToArrayList(arrlist);
		// newArrayListToArrayList(arrlist);
		// GetSimiliarElementsofTwoArrayLists(arrlist, arrlistTwo);
		// AddDuplicateElements(arrlist);
		// AddNullElements(arrlist);
		// GetElementsWithIndex(arrlist);
		//ConvertIntArrayToArraylist(new int[] {23,78,77,99});
		//ConvertStringArrayToArraylist(new String[] { "app", "bhh", "uuh", "iik", "oojk", "juj" });

		ArrayList<String> arrlisttwo = new ArrayList<String>();
		arrlisttwo.add("Apple");
		arrlisttwo.add("Ball");
		arrlisttwo.add("Cat");
		arrlisttwo.add("Dog");
		arrlisttwo.add("Zebra");
		// SortStringArray(arrlisttwo);
		// ReverseStringArray(arrlisttwo);

		ArrayList<Integer> arrlistInteger = new ArrayList<Integer>();
		arrlistInteger.add(12);
		arrlistInteger.add(999);
		arrlistInteger.add(90);
		arrlistInteger.add(-1);
		arrlistInteger.add(0);
		// SortIntegerArray(arrlistInteger);
		// ReversetIntegerArray(arrlistInteger);
		SortIntegerArrayInDescendingOrder(arrlistInteger);

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

	public static void SortStringArray(ArrayList<String> arrlist) {
		Collections.sort(arrlist);
		System.out.println(arrlist + " --> SortStringArray output");
	}

	public static void SortIntegerArray(ArrayList<Integer> arrlist) {
		Collections.sort(arrlist);
		System.out.println(arrlist + " --> SortIntegerArray output");
	}
	
	public static void SortIntegerArrayInDescendingOrder(ArrayList<Integer> arrlist) {
		Collections.sort(arrlist, Collections.reverseOrder());
		System.out.println(arrlist + " --> SortIntegerArray output");
	}

	public static void ReverseStringArray(ArrayList<String> arrlist) {
		Collections.reverse(arrlist);
		System.out.println(arrlist + " --> Reversed SortStringArray output");
	}

	public static void ReversetIntegerArray(ArrayList<Integer> arrlist) {
		Collections.reverse(arrlist);
		System.out.println(arrlist + " --> Reversed IntegerArray output");
	}

	public static void ConvertIntArrayToArraylist(int[] inputarray) {
		List<Integer> IntAlist = new ArrayList <Integer>();
		for (int value : inputarray) {
			IntAlist.add(value);
		}
		System.out.println(IntAlist + " --> output from ConvertArrayToArraylist");
	}

	public static void ConvertStringArrayToArraylist(String[] inputarray) {
		List<String> AList = Arrays.asList(inputarray);
		System.out.println(Arrays.toString(AList.toArray()) + " --> output from ConvertStringArrayToArraylist");
		for (String value : AList) {
			System.out.println(value + " --> output value from ConvertStringArrayToArraylist");
		}

	}

}
