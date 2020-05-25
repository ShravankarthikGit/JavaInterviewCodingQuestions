package interviewques1;

import java.util.ArrayList;
import java.util.List;

public class ListImplementation {

	public static void main(String[] args) {
		ListWithOutGenerics();
		ListWithGenerics();
	}

	/* Java 1.5 */ //Generics were introduces in Java 1.5 in 2004
	public static void ListWithOutGenerics() {
		// Using List with out generics
		List testlistone = new ArrayList();
		testlistone.add("Tom");
		testlistone.add("Cat");
		testlistone.add("Jerry");
		for (Object name : testlistone) {
			System.out.println(name);
		}
	}

	public static void ListWithGenerics() {
		// Using List with generics
		List<String> testlistone = new ArrayList<String>();
		testlistone.add("TomGeneric");
		testlistone.add("CatGeneric");
		testlistone.add("JerryGeneric");
		for (String name : testlistone) {
			System.out.println(name);
		}
	}
	
	
	/* Java 1.8 */

	public static void ListWithGenericsJava8() {
		// Using List with generics no need for object type on right side
		List<String> testlistone = new ArrayList();
		testlistone.add("TomGeneric");
		testlistone.add("CatGeneric");
		testlistone.add("JerryGeneric");
		for (String name : testlistone) {
			System.out.println(name);
		}
	}
	
	/* Java 10 */ // Java 10 not installed

/*	public static void ListWithGenericsJava10() {
		// Using List with generics no need for object type on right side
		var testlistone = new ArrayList<String>();
		testlistone.add("TomGeneric");
		testlistone.add("CatGeneric");
		testlistone.add("JerryGeneric");
		for (String name : testlistone) {
			System.out.println(name);
		}
	}*/

}
