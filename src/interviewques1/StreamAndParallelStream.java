package interviewques1;

import java.util.Arrays;
import java.util.List;

public class StreamAndParallelStream {

	public static void main(String[] args) {
		processStream();
		processParallelStream();
	}

	public static void processStream() {
		List<String> names = Arrays.asList("Alice", "Bob", "Andrew", "Charlie", "Annie", "David");
		
		names.stream()
	     .filter(name -> name.startsWith("A"))
	     .map(String::toUpperCase)
	     .forEach(name -> {
	         System.out.println(name + " - " + Thread.currentThread().getName());
	     });
	}

	/*
	 * 💡 Explanation .stream() – Converts the list to a stream
	 * 
	 * .filter() – Filters elements based on a condition
	 * 
	 * .map() – Transforms each element
	 * 
	 * .collect(Collectors.toList()) – Collects the final results back into a list
	 */

	public static void processParallelStream() {
		List<String> names = Arrays.asList("Alice", "Bob", "Andrew", "Charlie", "Annie", "David");

		names.parallelStream().filter(name -> name.startsWith("A")).forEach(name -> {
			System.out.println(name + " - " + Thread.currentThread().getName());
		});
	}
}
