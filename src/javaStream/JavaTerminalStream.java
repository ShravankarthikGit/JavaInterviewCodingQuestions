// Terminal Operations are the type of Operations that return the result. These Operations are not processed further just return a final result value.
// 1. collect(): The collect method is used to return the result of the intermediate operations performed on the stream.
// 2. forEach(): The forEach method is used to iterate through every element of the stream.
// 3. reduce(): The reduce method is used to combine all the elements of the stream into a single result.
// 4. count(): The count method is used to count the number of elements in the stream.
// 5. min() and max(): The min and max methods are used to find the minimum and maximum elements in the stream based on a given comparator.
// 6. anyMatch(), allMatch(), noneMatch(): These methods are used to check if any, all, or none of the elements in the stream match a given predicate.
//


package javaStream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JavaTerminalStream {
	
	public static void main (String args[]) {
		//collect example
		collectExample();
		
		//forEach example
		forEachExample();
        
		//reduce example
		reduceExample();
		
		//count example
		countExample();
		
		//max min example
		maxMin();
		
		//any all none match example
		anyAllNoneMatchExample();
		
		
    }
	
	public static void collectExample() {
		
		List<String> nList = List.of("apple", "banana", "cherry", "date");
		
		// Collectots.toList() example: Collect all strings that start with 'a' into a new list
		// this returns mutable list arraylist
		List<String> filteredList = nList.stream().filter(s -> s.startsWith("a")).collect(Collectors.toList());
		System.out.println("Filtered List (mutable): " + filteredList);
		filteredList.add("avocado");
		System.out.println("Filtered List (mutable) after adding " + filteredList);
		
		// Returns immutable list
		List<String> filteredListImmut = nList.stream().filter(s -> s.startsWith("a")).toList();
		System.out.println("Filtered List (immutable): " + filteredListImmut);
		//filteredListImmut.add("apricot"); // This will throw UnsupportedOperationException
	}
	
	
	public static void forEachExample() {
        List<String> bbList = List.of("apple", "banana", "cherry", "date", "blueberry", "blackberry");
        
        // forEach example with stream : Print each string in the list
        // list.stream().forEach(...): Creates a stream pipeline. Use this only if you are already using other stream operations (like filter or map).
        bbList.stream()
        .filter(s -> s.startsWith("b"))
        .forEach(s -> System.out.println("Print with Stream and for each "+s)); // Prints "banana", "blueberry", "blackberry"
        
        // NOTE: System.out::println is a method reference. It is a shorthand notation of lambda expression s -> System.out.println(s)
        
        // Use for each with parallel stream
        System.out.println("Print with Parallel Stream and for each ");
        bbList.parallelStream()
        .filter(s -> s.startsWith("b"))
        .forEach(System.out::println); // Prints "banana", "blueberry", "blackberry"
        
        // Use for each ordered with parallel stream
        System.out.println("Print with Parallel Stream and for each ordered ");
        bbList.parallelStream()
        .filter(s -> s.startsWith("b"))
        .forEachOrdered(System.out::println); // Prints "banana", "blueberry", "blackberry"
        
        // For each with out stream. Use for each directly on List
        System.out.println("Print with for each directly on List ");
        bbList.forEach(System.out::println); // Prints all fruits
    }
	
	public static void reduceExample() {
		List<String> rList = List.of("apple", "banana", "cherry");
		
		// Reduce example: Concatenate all strings in the list
		// Note that reduce in stream allows only two values in the lambda function
		String concatenated = rList.stream().reduce("", (s1, s2) -> s1 + s2);
		System.out.println("Concatenated String: " + concatenated);
		
		// Note that map in stream allows only one value in the lambda function
		List<String> concatList = rList.stream().map(s1 -> s1 + s1).collect(Collectors.toList());
		System.out.println("Concatenated List with map: " + concatList);
	}
	
	public static void countExample() {
		List<String> cList = List.of("apple", "banana", "cherry");
		// note that we need to use long data type to store count value in stream
		long total = cList.stream().count(); 
		System.out.println("Total elements in the list: " + total);
		
		List<Integer> scores = List.of(85, 40, 92, 60, 30, 30, 92);

		long passingGrades = scores.stream()
		    .filter(s -> s >= 60)
		    .distinct()
		    .count();
		System.out.println("Number of passing grades after removing duplicates" + passingGrades);
	}
	
	public static void maxMin() {
		
		List<Integer> nums = List.of(10, 45, 2, 89, 30);

		Integer highest = nums.stream()
		    .max(Comparator.naturalOrder())
		    .orElse(0); // Returns 89
		
		System.out.println("Highest number: " + highest);

		Integer lowest = nums.stream()
		    .min(Comparator.naturalOrder())
		    .orElse(0); // Returns 2
		
		System.out.println("Lowest number: " + lowest);
	}
	
	public static void anyAllNoneMatchExample() {
		List<Integer> ages = List.of(15, 18, 20);

		boolean hasAdult = ages.stream().anyMatch(age -> age >= 18); 
		// Result: true (stops after checking 18)
		System.out.println("Has adult: " + hasAdult);
		
		boolean allAdults = ages.stream().allMatch(age -> age >= 18);
		// Result: false (stops after checking 15)
		System.out.println("All adults: " + allAdults);
		boolean noMinors = ages.stream().noneMatch(age -> age < 18);
		// Result: false (stops after checking 15)
		
		List<String> roles = List.of("Admin", "Admin", "User");

		boolean allAdmin = roles.stream().allMatch(r -> r.equals("Admin")); 
		// Result: false (stops after checking "User")
        System.out.println("All Admin: " + allAdmin);
        

		
		
	}

}
