package interviewques1;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class AIQuestionsTwo {

	public static void main(String[] args) {
		// FilterStream();
		// comapremapswithstream();
		// logparser();
		//findDuplicates();
		//ListToMap();
		// TakeAverag();
		//FlattenList();
		//StreamFilter();
		// Summarystatistics();
		anymatch();
		//ListCompareWithStream();

	}

	/*
	 * Scenario: You have a List<String> representing web elements' text values:
	 * ["Home", "Products", "Services", "Contact Us", "Login"]. Task: Write a Java
	 * Stream to find the first element that has more than 7 characters, convert it
	 * to lowercase, and print it. }
	 */

	public static void FilterStream() {
		List<String> ls = new LinkedList<String>(List.of("Home", "Products", "Services", "Contact Us", "Login"));
		Optional<String> modlist = ls.stream().filter(a -> a.length() > 7).map(String::toLowerCase).findFirst();
		System.out.println(modlist.get());
	}

	public static void comapremapswithstream() {

		Map<String, String> expected = Map.of("ID", "101", "Status", "Active", "Role", "Admin");
		Map<String, String> actual = Map.of("ID", "101", "Status", "Inactive", "Role", "Admin");

		// iterate on map
		/*
		 * for (Entry<String, String> ele : expected.entrySet()) {
		 * System.out.println(ele); System.out.println(ele.getValue());
		 * System.out.println(ele.getKey()); }
		 */

		List<String> notequalkeys = new LinkedList<String>();

		for (Entry<String, String> ele : expected.entrySet()) {
			String actualKey = ele.getKey();
			/*
			 * if (!ele.getValue().equals(actual.get(key))) { notequalkeys.add(key); }
			 */

			// Objects.equals: This is a utility method that is "null-safe." It handles
			// cases where a value might be null without throwing a NullPointerException.
			if (actual.containsKey(actualKey) && !Objects.equals(ele.getValue(), actual.get(actualKey))) {
				notequalkeys.add(actualKey);
			}
		}

		// Using Stream
		List<String> mismatch = expected.keySet().stream()
				.filter(key -> !Objects.equals(expected.get(key), actual.get(key))).toList();
		System.out.println(mismatch);
	}

	public static void logparser() {

		/*
		 * The Log Parser (Counting & Grouping) Scenario: You have a List<String> of log
		 * entries: ["INFO: Start", "ERROR: Timeout", "INFO: Loading", "ERROR: 404",
		 * "DEBUG: Trace"]. Task: Group these logs by their level (INFO, ERROR, DEBUG)
		 * and count how many of each exist using Collectors.groupingBy.
		 */

		List<String> logs = new LinkedList<String>(
				List.of("INFO: Start", "ERROR: Timeout", "INFO: Loading", "ERROR: 404", "DEBUG: Trace"));

		Map<String, Long> result = logs.stream().filter(s -> s.contains(":")) // Check to see the string contains ':'
				.collect(Collectors.groupingBy(s -> s.split(":")[0], // Extract the log level
						Collectors.counting())); // // Count occurrences
		System.out.println(result);
	}

	public static void findDuplicates() {
		/*
		 * Scenario: You have a list of User IDs from a UI table: [101, 102, 103, 101,
		 * 104, 102]. Task: Identify which IDs are duplicates and return them as a List.
		 */
		List<Integer> orig = List.of(101, 102, 103, 101, 104, 102);
		Set<Integer> seen = new HashSet<>();
		orig.stream().filter(s -> seen.add(s)).toList();
		System.out.println(seen);
	}
	
	public static void ListToMap() {
		List<String> orig = List.of("Home:true", "Settings:false", "Profile:true", "Help:true", "Pilli:", "Profile:true");

		Map<String, Boolean> Omap = orig.stream()
		    .filter(s -> s.contains(":"))
		    .map(s -> s.split(":", 2)) // Splits string to 1 based on :
		    .collect(Collectors.toMap( // Add values from string array to map
		        arr -> arr[0],  // Key
		        arr -> Boolean.parseBoolean(arr[1]), // Value
		        (existing, replacement) -> replacement // merge function will keep 	The latest value in the list wins.// // Overwrites ID:101 with ID:102
		    ));

		System.out.println(Omap);
	}
	
	public static void TakeAverag() {
		
		/*
		 * Scenario: You have a List<Long> representing response times (in ms) from 10
		 * API calls: [120, 450, 80, 1100, 300, 150, 500, 210, 1000, 400]. Task: Find
		 * the Average response time, but exclude any "outliers" that are greater than
		 * 1000ms.
		 */
		
		List<Integer> lis = List.of(120, 450, 80, 1100, 300, 150, 500, 210, 1000, 400);
		OptionalDouble average = lis.stream().filter(s -> s<1000) // Keep values 1000 or less
		.mapToDouble(Integer::doubleValue) // we can't do average on Stream<Integer> so we need to convert to double
		.average(); // Calculate average
		System.out.println(average);
	}
	
	public static void FlattenList() {
		
		/*
		 * Scenario: You have a List<List<String>> representing a table on a webpage:
		 * [["ID", "Name"], ["1", "Admin"], ["2", "User"], ["3", "Guest"]] Task: Flatten
		 * this list of lists into a single List<String>, but skip the first inner list
		 * (the headers).
		 */
        List<List<String>> tableData = List.of(
                List.of("ID", "Name"),      // Header (Skip this)
                List.of("1", "Admin"),     // Row 1
                List.of("2", "User"),      // Row 2
                List.of("3", "Guest")      // Row 3
            );

            List<String> allDataCells = tableData.stream()
                .skip(1)                          // 1. Skip the header row
                .flatMap(Collection::stream)      // 2. Flatten List<String> into String
                .toList();                        // 3. Collect to final list

            System.out.println(allDataCells); 
            // Output: [1, Admin, 2, User, 3, Guest]
	}
		
	public static void StreamFilter() {
		List<String> htmlSnippets = List.of(
			    "<img src='header.png'>",
			    "<div class='footer'></div>",
			    "<img src='loading.gif'>",
			    "<img src='profile_pic.jpg'>",
			    "<span>No image here</span>",
			    "<img src='ad_banner.png'>",
			    "<img src='animation.gif'>"
			);
		
		List<String>filterlist = htmlSnippets.stream()
				.filter(s -> s.contains("img") && s.contains("'"))  // Filter strings that contains "img" and single quote
				.map(s -> {int start = s.indexOf("'") + 1;		// Start after the first quote
						   int end = s.indexOf("'", start);     // Find the next quote AFTER the start
						   return s.substring(start, end);		
					
				}).filter(s -> !s.contains(".gif")).toList();
		
		System.out.println(filterlist);
	}
	
	public static void Summarystatistics() {
		/*
		 * Scenario: You have a List<Integer> representing the run-times of 50 automated
		 * test cases. Task: Use the summaryStatistics() method to find the Max, Min,
		 * and Average execution time in a single statement.
		 */
		List<Integer> runTimes = new Random().ints(50, 100, 2001) // This part creates an IntStream (a specialized stream for primitive int values).
                .boxed() // The Problem: ints() returns an IntStream (which holds primitive ints). 
                		 //However, a standard List in Java cannot hold primitives—it can only hold Objects (Integer).
                		//The Solution: .boxed() converts each primitive int into its Wrapper Object Integer.
                .toList();
		
		IntSummaryStatistics  stats = runTimes.stream().mapToInt(Integer::intValue)  // It takes each Integer Object and extracts its primitive int value.
						.summaryStatistics();
        System.out.println("Total Tests: " + stats.getCount());
        System.out.println("Max Time: " + stats.getMax() + "ms");
        System.out.println("Min Time: " + stats.getMin() + "ms");
        System.out.println("Average: " + stats.getAverage() + "ms");
	}
	
	public static void ListCompareWithStream() {
		List<String> userPermissions = List.of("READ", "UPDATE", "REPORT_VIEW");
		List<String> requiredPermissions = List.of("READ", "UPDATE", "DELETE", "REPORT_VIEW", "DASHBOARD_ADMIN");	
		List<String> Missingpermissions = requiredPermissions.stream().filter(s ->  !userPermissions.contains(s)).toList();
		System.out.println(Missingpermissions);
	}
	
	public static void anymatch() {
		/*
		 * Scenario: You have a List<String> of "Running Tests": ["LoginTest",
		 * "PaymentTest", "CheckoutTest"]. Task: Use anyMatch to check if "PaymentTest"
		 * is still in the list. If it returns true, print: "Test still in progress..."
		 * If it returns false, print: "Test completed!"
		 */
		List<String> RunningTests =  List.of("LoginTest", "PaymentTest", "CheckoutTest");
		Boolean exists = RunningTests.stream().anyMatch(s -> s.equalsIgnoreCase("PaymentTest"));
		System.out.println(exists);
	}
	
}
	
	

