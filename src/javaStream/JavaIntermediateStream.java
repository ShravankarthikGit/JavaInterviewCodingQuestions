//Stream was introduced in Java 8, the Stream API is used to process collections of objects. A stream in Java is a sequence of objects that supports various methods that can be 
//pipelined to produce the desired result. 
// syntax - Stream<T> stream;
// types of streams - intermediate, terminal

// Intermediate
// Characteristics of Intermediate Operations
// 		Methods are chained together.
// 		Intermediate operations transform a stream into another stream.
// 		It enables the concept of filtering where one method filters data and passes it to another method after processing.

// 1. map(): The map method is used to return a stream consisting of the results of applying the given function to the elements of this stream.
// 2. filter(): The filter method is used to select elements based on a condition.
// 3. sorted(): The sorted method is used to sort the elements of the stream.
// 4. distinct(): The distinct method is used to remove duplicate elements from the stream.
// 5. peek(): The peek method is used to perform an action on each element of the stream without modifying the stream itself.
// 6. flatmap(): The flatMap method is used to flatten a stream of collections into a single stream of elements.
// Terminal

package javaStream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaIntermediateStream {
	public static void main(String[] args) {
		// List of lists of names
		List<List<String>> listOfLists = Arrays.asList(Arrays.asList("Reflection", "Collection", "Stream"),
				Arrays.asList("Structure", "State", "Flow"),
				Arrays.asList("Sorting", "Mapping", "Reduction", "Stream"));

		// Create a set to hold intermediate results
		Set<String> intermediateResults = new HashSet<>();

		// Stream pipeline demonstrating various intermediate operations
		List<String> result = listOfLists.stream()
				.flatMap(List::stream)
				.filter(s -> s.startsWith("S"))
				.map(String::toUpperCase).distinct().sorted().peek(s -> intermediateResults.add(s))
				.collect(Collectors.toList());

		// Print the intermediate results
		System.out.println("Intermediate Results:");
		intermediateResults.forEach(System.out::println);

		// Print the final result
		System.out.println("Final Result:");
		result.forEach(System.out::println);

		// Call flatmapexample method
		flatmapexample();
		
		// Call mapexample method
		mapexample();
		
		// Call filterexample method
		filterexample();
		
		// Call sortedexample method
		sortedexample();
		
		// Call distinctExample method
		distinctExample();
		
		// Call peekExample method
			peekExample();
		
	}

	public static void flatmapexample() {
		List<List<String>> nestedList = List.of(List.of("Alice", "Bob"), List.of("Charlie", "David"), List.of("Eve"));
		System.out.println(nestedList);

		// Using flatMap to merge inner lists into a single list
		List<String> flattenedList = nestedList.stream().flatMap(List::stream) // Converts each List into its own Stream
				.toList(); // Merges all streams into one List

		// Result: [Alice, Bob, Charlie, David, Eve]
		System.out.println(flattenedList);
	}
	
	public static void mapexample() {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);

		List<Integer> squaredNumbers = numbers.stream()
		    .map(n -> n * n)  // Transforms each number to its square
		    .toList();

		// Output: [1, 4, 9, 16, 25]
        System.out.println(squaredNumbers);
        
    }
	
	public static void filterexample(){
		List<String> fillist = List.of("Tom","Jerry", "Spike");
		List<String> filteredList = fillist.stream()
			    .filter(s -> s != null && s.startsWith("S"))  // Filters names starting with 'S' and non-null
			    .toList();
		
		// Output: [Spike]
		System.out.println(filteredList);
	}
	
	public static void sortedexample() {
		List<String> sortlist = Arrays.asList("Tom, Jerry, Spike, Tyke, Butch");
		System.out.println(sortlist);
		
        List<String> sortedList = sortlist.stream().toList();
        System.out.println(sortedList);
	}
	
	public static void distinctExample() {
		List<String> dsList = List.of("apple", "banana", "apple", "orange", "banana");
		System.out.println(dsList);
		List<String> disList = dsList.stream().distinct().toList();
		System.out.println(disList);
	}
	
	//peek() is an intermediate operation primarily used for debugging. It allows you to perform an action on each element (like printing) as they flow through 
	//the pipeline without modifying the elements themselves. 
	//Important Rule: The "Lazy" Trap 
	//peek() is an intermediate operation. If you do not call a terminal operation (like .toList(), .count(), or .forEach()), the peek() will never execute. 
	
	public static void peekExample() {
		List<String> names = List.of("Tom", "Jerry", "Spike");
		List<String> result = names.stream()
		    .filter(s -> s.length() > 3)
		    .peek(s -> System.out.println("After filter: " + s)) // Observe filtered items
		    .map(String::toUpperCase)
		    .peek(s -> System.out.println("After map: " + s))    // Observe transformed items
		    .toList(); // Terminal operation triggers the peeks
		
		System.out.println("Final Result: " + result);
	}
}
