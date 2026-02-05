package interviewques1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

///////////////////////////Scenario 14 /////////////////////////////////

/*
* Create a class SmartWatch. Fields: String brand, int batteryLevel. Create a
* constructor to set these values. Create a method showStatus() to print:
* "Brand: [brand], Battery: [batteryLevel]%".
*/

class SmartWatch {
	// Fields (Properties of the object)
	String brand;
	int batteryLevel;

	SmartWatch(String brand, int batteryLevel) {
		this.brand = brand;
		this.batteryLevel = batteryLevel;
	}

	void showStatus() {
		System.out.println("Brand: " + this.brand + ", Battery: " + this.batteryLevel + "%");
	}

}

public class AIQuestions {

	public static void main(String[] args) {

		// UpdatePrices();
		// System.out.println(StringCheck("pass123"));
		// System.out.println(StringCheck("java#2026"));

		// isAccessGranted(19, true);
		// RobotCount();
		// reverseString("akai");
		// ReverseIntArray();
		// SortIntArray();
		// DuplicateValues();
		// PrintDates();
		// LowStock();

		// SmartWatch sw = new SmartWatch("Apple", 85);
		// sw.showStatus();
		// MapFilter();
		// SwitchCaseFizzBuzz(20);
		FirstRepeatChar();

//////////////////////////////Scenario 1///////////////////////////////////
		/*
		 * The Scenario: You are managing a VIP guest list for an event in 2026. Your
		 * Goal: Create an ArrayList<String> named guests. Add three names to it:
		 * "Alice", "Bob", and "Charlie". Write an if-else statement to check if "Bob"
		 * is in the list (Hint: Use the .contains() method). If he is in the list,
		 * print "Bob is invited!".
		 */

		ArrayList<String> guests = new ArrayList<String>(List.of("Alice", "Bob", "Charlie"));

		/*
		 * for (String name : guests) { if (name.equals("Bob")) {
		 * System.out.println("Bob is invited!"); } }
		 * 
		 * // Another approach if (guests.contains("Bob")) {
		 * System.out.println("Bob is invited!"); }
		 */

//////////////////////////////Scenario 1///////////////////////////////////	

//////////////////////////////Scenario 2///////////////////////////////////	
		/*
		 * The Scenario: You have a list of ID tags for a 2026 drone delivery system.
		 * Some IDs were scanned twice by mistake. Your Goal: Start with this array:
		 * int[] tags = {101, 102, 101, 103, 104, 102}; Convert this array into a Set of
		 * Integers to remove the duplicates. (Hint: Since they are numbers, you can use
		 * a regular HashSet<Integer>).
		 */

		/*
		 * Integer[] tags = { 101, 102, 101, 103, 104, 102 }; HashSet<Integer> clearSet
		 * = new HashSet<Integer>(List.of(tags)); System.out.println(clearSet);
		 * 
		 */
//////////////////////////////Scenario 2///////////////////////////////////

//////////////////////////////Scenario 3///////////////////////////////////
		/*
		 * The Scenario: You are writing a 2026 social media filter. Your Goal: Create a
		 * String variable named message with the value: "I love Java programming!". Use
		 * a loop to print out each character of the string one by one, but skip the
		 * spaces. Hint: You can use message.charAt(i) or message.toCharArray(), and an
		 * if statement to check if a character is ' '.
		 */

		String st = "I love Java programming!";

		// iterating over string
		/*
		 * for (int i = 0; i < st.length(); i++) { if (st.charAt(i) == ' ') { continue;
		 * } System.out.println(st.charAt(i)); }
		 * 
		 * char[] chararray = st.toCharArray();
		 * 
		 * for (char c : chararray) { if (c == ' ') { continue; } System.out.println(c);
		 * }
		 */
//////////////////////////////Scenario 3///////////////////////////////////

//////////////////////////////Scenario 4///////////////////////////////////

		/*
		 * In 2026, Maps are everywhere—they connect keys (like a username) to values
		 * (like an email). The Scenario: You are managing a 2026 digital library. You
		 * need to map Book Titles to ISBN Numbers. Your Goal: Create a HashMap<String,
		 * Integer> named library. Add two books: "Java 21 Guide" with the ID 1001.
		 * "Coding for Drones" with the ID 1002. Retrieve the ID for "Java 21 Guide" and
		 * print it.
		 */

		/*
		 * HashMap<String, Integer> Library = new HashMap<String, Integer>();
		 * Library.put("Java 21 Guide", 1001); Library.put("Coding for Drones", 1002);
		 * 
		 * for (Map.Entry<String, Integer> entry : Library.entrySet()) {
		 * 
		 * if (entry.getKey().equals("Java 21 Guide")) {
		 * System.out.println("Value for Java 21 Guide is: " + entry.getValue()); } }
		 * 
		 * // With out using loop Integer id = Library.get("Java 21 Guide");
		 * System.out.println("Value for Java 21 Guide is: " + id);
		 */

////////////////////////////// Scenario 4///////////////////////////////////

///////////////////////////Scenario 5 /////////////////////////////////
		/*
		 * The Scenario: You are writing code for a 2026 calculator app. Users sometimes
		 * try to divide by zero. Your Goal: Create two int variables: a = 10 and b = 0.
		 * Wrap a division operation (a / b) inside a try-catch block. In the catch
		 * block, catch the ArithmeticException. Print a message:
		 * "Error: Cannot divide by zero!". Finally, print "Calculation attempted."
		 * regardless of whether it succeeded or failed.
		 */

		/*
		 * int a = 10; int b = 0;
		 * 
		 * try {
		 * 
		 * int c = a / b; System.out.println("Result: " + c); } catch
		 * (ArithmeticException e) {
		 * System.out.println("Error: Cannot divide by zero!"); } finally {
		 * 
		 * System.out.println("Calculation attempted."); }
		 */
	}

///////////////////////////Scenario 6 /////////////////////////////////
	/*
	 * The Scenario: You are building a 2026 security gate system. Your Goal: Create
	 * a method named isAccessGranted that: Takes two parameters: int age and
	 * boolean hasTicket. Returns a boolean. Logic: Return true only if the person
	 * is 18 or older AND has a ticket. In your main method, call this method and
	 * print the result for a 20-year-old with a ticket.
	 */

	public static boolean isAccessGranted(int age, boolean hasTicket) {
		Boolean validator = null;

		if (age >= 18 && hasTicket == true) {
			validator = true;
		}
		System.out.println(validator);
		return validator;

		// Another approach
		// This one line replaces the entire if-statement and the variable
		// return age >= 18 && hasTicket;
	}

///////////////////////////Scenario 7 /////////////////////////////////
	/*
	 * The Scenario: You are managing a fleet of 2026 delivery robots. Some are
	 * "Active" and some are "Charging". Your Goal: Create an ArrayList<String>
	 * called robots. Add these strings: "Active", "Charging", "Active", "Broken",
	 * "Active". Use an enhanced for-loop (for-each) to count how many robots are
	 * exactly "Active".
	 */

	public static int RobotCount() {
		ArrayList<String> robots = new ArrayList<String>(List.of("Active", "Charging", "Active", "Broken", "Active"));

		System.out.println("original Array List :" + robots);

		int count = 0;

		for (String act : robots) {
			if (act.equalsIgnoreCase("Active")) {
				count++;
			}
		}
		System.out.println("Count of Active robots is: " + count);

		// Approach with stream
		long count1 = robots.stream().filter(r -> r.equalsIgnoreCase("Active")).count();
		System.out.println("Count of Active robots is: " + count1);
		return count;
	}

///////////////////////////Scenario 8 /////////////////////////////////
	/*
	 * The Scenario: You need to encrypt a message for a secure drone transmission.
	 * Your Goal: Create a String called input with the value "Drone1". Use a loop
	 * to create a new String that is the reverse of the input (it should become
	 * "1enorD"). Hint: Start your loop from the end of the string (input.length() -
	 * 1) and work backwards to 0. Pro Hint: Use StringBuilder for the best
	 * performance when building strings in a loop.
	 */

	public static String reverseString(String input) {
		String reversed = "";
		// convert string to char array
		char[] StArray = input.toCharArray();

		for (int i = input.length() - 1; i >= 0; i--) {
			reversed = reversed + StArray[i];
		}
		System.out.println("Reversed String is: " + reversed);

		// Using String builder
		StringBuilder sb = new StringBuilder(input);
		sb.reverse();
		System.out.println("Reversed String using StringBuilder is: " + sb.toString());

		return reversed;
	}

///////////////////////////Scenario 9 /////////////////////////////////

	/*
	 * The Scenario: You receive raw data from a 2026 weather sensor array that
	 * needs to be sorted for analysis. Your Goal: Create an int[] array named
	 * temperatures with these values: {22, 18, 25, 30, 21, 19}. Use the standard
	 * Java utility to sort the array in ascending order. (Hint: Look in the
	 * java.util.Arrays class). Print the sorted array. (Hint: Remember you need
	 * Arrays.toString() to print an array properly).
	 */

	public static void SortIntArray() {

		int[] temp = { 22, 18, 25, 30, 21, 19 };

		// we take first value from the current array and then compare with all values
		// called as exhaustive approach
		for (int i = 0; i < temp.length; i++) {
			for (int j = i + 1; j < temp.length; j++) {
				if (temp[j] < temp[i]) {
					// Swap the values
					int placeholder = temp[i];
					temp[i] = temp[j];
					temp[j] = placeholder;
				}
			}
		}

		// Another approach using arrays sort function
		Arrays.sort(temp);
		System.out.println("\nSorted array using Arrays.sort(): " + Arrays.toString(temp));

	}

///////////////////////////Scenario 10 /////////////////////////////////

	public static void ReverseIntArray() {

		int[] temp = { 22, 18, 25, 30, 21, 19 };

		int[] revtemp = new int[temp.length];
		int j = 0;

		for (int i = temp.length - 1; i >= 0; i--) {
			revtemp[j] = temp[i];
			j++;
		}
		// Iterate on revtremp array and print
		for (int k : revtemp) {
			System.out.print(k + " ");
		}
	}

///////////////////////////Scenario 11 /////////////////////////////////

/// You are building a signup system for a 2026 gaming platform. Users are submitting usernames, but some are duplicates.
	/*
	 * Your Goal: You have a list of requested usernames: String[] requests =
	 * {"Gamer1", "ProPlayer", "Gamer1", "SkyWalker", "ProPlayer"}; Create a Set
	 * called validUsernames. Loop through the requests array. For each name, check
	 * if it is already in the Set: If it is not in the Set, add it and print:
	 * "Username [name] is available and registered!". If it is already in the Set,
	 * print: "Error: [name] is already taken!"
	 */

	public static void DuplicateValues() {
		String[] requests = { "Gamer1", "ProPlayer", "Gamer1", "SkyWalker", "ProPlayer" };

		HashSet<String> clear = new HashSet<String>();

		for (String st : requests) {
			if (!clear.contains(st)) {
				clear.add(st);
				System.out.println("Username " + st + " is available and registered!");
			} else {

				System.out.println("Error: " + st + " is already taken!");
			}
		}
	}

///////////////////////////Scenario 12 /////////////////////////////////

	/*
	 * The Scenario: Your 2026 app needs to show the user today's date and the date
	 * exactly one week from now. Your Goal: Use LocalDate.now() to get today's
	 * date. Use the .plusWeeks(1) method to calculate the date for next week. Print
	 * both
	 */

	public static void PrintDates() {
		LocalDate today = LocalDate.now();
		System.out.println(today); // Outputs: 2026-01-27
		// Add a week to the current date
		LocalDate nextweek = LocalDate.now().plusWeeks(1);
		System.out.println(nextweek); // Outputs: 2026-02-03
	}

///////////////////////////Scenario 13 /////////////////////////////////
	/*
	 * You are auditing a 2026 automated warehouse. You have a list of stock levels,
	 * and you need to find which items are "Low Stock" (less than 10 units). Your
	 * Goal: Create a List<Integer> named stockLevels with these values: [45, 3, 12,
	 * 8, 22, 1]. Use a loop or Stream to find all numbers less than 10. Print each
	 * low-stock value.
	 */

	public static void LowStock() {
		List<Integer> stock = new LinkedList<Integer>(List.of(45, 3, 12, 8, 22, 1));
		for (int i = 0; i < stock.size(); i++) {
			if (stock.get(i) < 10) {
				System.out.println("Low stock item: " + stock.get(i));
			}
		}
		// Using Stream
		stock.stream().filter(f -> f < 10).forEach(f -> System.out.println("Low stock item using stream: " + f));
	}

///////////////////////////Scenario 14 /////////////////////////////////
	/*
	 * The Scenario: You’re running a futuristic coffee shop. Due to inflation, you
	 * need to raise the price of every item in your store by $1.50. Your Goal:
	 * Create a List<Double> named prices with these values: 2.50, 4.00, 5.50.
	 * Create a new empty ArrayList<Double> called newPrices. Use an enhanced
	 * for-loop to iterate through prices. Inside the loop, add 1.50 to each price
	 * and add the result to newPrices. Print
	 */

	public static List<Double> UpdatePrices() {

		List<Double> OrigPrices = new ArrayList<Double>(List.of(2.50, 4.00, 5.50));
		List<Double> NewPrices = new ArrayList<Double>();
		for (Double p : OrigPrices) {
			NewPrices.add(p + 1.50);
		}
		System.out.println("Updated Prices are: " + NewPrices);
		return NewPrices;
	}

///////////////////////////Scenario 15 /////////////////////////////////	
	/*
	 * The Scenario: You're building a login system. A password is only "Secure" if
	 * it is at least 8 characters long AND contains the "#" symbol. Your Goal:
	 * Create a method public static boolean isSecure(String password). Use
	 * .length() to check the size. Use .contains("#") to check for the symbol.
	 * Return true if both conditions are met, otherwise false.
	 */

	public static boolean StringCheck(String pass) {
		boolean check = false;
		if ((pass.length() >= 8) && pass.contains("#")) {
			check = true;
		}
		return check;

		// another approach
		// return password.length() >= 8 && password.contains("#");
	}

///////////////////////////Scenario 16 /////////////////////////////////	

	/*
	 * The Scenario: You're coding a controller for a 2026 delivery robot. It
	 * receives a String command and needs to return a "Task Description. " Your
	 * Goal: Use the modern Arrow Syntax (->) for your switch. If the command is
	 * "START", return "Robot is moving". If the command is "STOP", return
	 * "Robot is parking".
	 */

	public static String SwitchCase(String action) {

		switch (action) {
		case "START":
			return "Robot is moving";
		case "STOP":
			return "Robot is parking";
		default:
			return "Command Not recognized";
		}

		// Another approach using arrow syntax can be used with java 21.
		/*
		 * return switch (action) { case "START" -> "Robot is moving"; case "STOP" ->
		 * "Robot is parking"; default -> "Command Not recognized"; };
		 */
	}

///////////////////////////Scenario 17 /////////////////////////////////	

	/*
	 * The Scenario: You are managing a 2026 tech store. You have a list of
	 * products, and you want to get a list of names for products that cost more
	 * than $500. Your Goal: Define a record Product(String name, double price) {}.
	 * Create a List<Product> with: new Product("Phone", 800.0) new Product("Mouse",
	 * 50.0) new Product("Monitor", 600.0) Use a Stream to: Filter for price > 500.
	 * Map to get just the name (Hint: .map(Product::name)). Collect into a
	 * List<String>. Print the final list of names
	 */

	public static void MapFilter() {

		HashMap<String, Double> products = new LinkedHashMap<String, Double>();
		products.put("Phone", 800.0);
		products.put("Mouse", 50.0);
		products.put("Monitor", 600.0);

		// System.out.println(products);
		// Using stream
		products.entrySet().stream().filter(p -> p.getValue() > 500).map(Map.Entry::getKey).toList()
				.forEach(System.out::println);
		// Using for loop
		for (Entry<String, Double> entry : products.entrySet()) {
			// System.out.println(entry.getKey());
			// System.out.println(entry.getValue());
			if (entry.getValue() > 500) {
				System.out.println("Product with price greater than 500 is: " + entry.getKey());
			}
		}
	}

///////////////////////////Scenario 18 /////////////////////////////////	
	/*
	 * The Scenario: You have two delivery routes for your 2026 drone fleet. Some
	 * houses are on both routes. You need a single list of unique addresses to
	 * visit. Your Goal: Create List<String> routeA = List.of("123 Maple",
	 * "456 Oak", "789 Pine"); Create List<String> routeB = List.of("456 Oak",
	 * "101 River", "123 Maple"); Create a Set that combines both lists into one
	 * unique collection. Hint: You can use the .addAll() method or pass a list into
	 * the constructor of a HashSet.
	 */
	public static void ListMerger() {
		List<String> list1 = new LinkedList<String>(List.of("123 Maple", "456 Oak", "789 Pine"));
		List<String> list2 = new LinkedList<String>(List.of("456 Oak", "101 River", "123 Maple"));
		HashSet<String> uniqueAddresses = new HashSet<String>(list1);
		uniqueAddresses.addAll(list2);
		System.out.println("Unique addresses to visit: " + uniqueAddresses);

		// Using stream
		List<String> combined = Stream.concat(list1.stream(), list2.stream()).distinct().toList();
		System.out.println("Unique addresses: " + combined);
	}

///////////////////////////Scenario 19 /////////////////////////////////
	/*
	 * Task: Write a method that prints numbers from 1 to 20. If a number is
	 * divisible by 3, print "Fizz". If a number is divisible by 5, print "Buzz". If
	 * it's divisible by both, print "FizzBuzz". Otherwise, just print the number.
	 */
	public static String SwitchCaseFizzBuzz(Integer number) {
		/*
		 * if (number % 3 == 0 && number % 5 == 0) { System.out.println("FizzBuzz");
		 * return "FizzBuzz"; } else if (number % 3 == 0) { System.out.println("FIZZ");
		 * return "FIZZ"; } else if (number % 5 == 0) { System.out.println("Buzz");
		 * return "Buzz"; } else { System.out.println(number); return
		 * Integer.toString(number); }
		 */
		return switch (Boolean.valueOf(true)) {
		case Boolean b when number % 15 == 0 -> "FizzBuzz";
		case Boolean b when number % 3 == 0 -> "Fizz";
		case Boolean b when number % 5 == 0 -> "Buzz";
		default -> String.valueOf(number);
		};
	}

///////////////////////////Scenario 20 /////////////////////////////////
	/*
	 * Task: Find the first character in a string that does not repeat. Input:
	 * "swiss" Output: 'w' (because 's' and 'i' appear more than once or 'i' comes
	 * after 'w'). The 2026 Strategy: Use a LinkedHashMap<Character, Integer> to
	 * store each character and its count. Loop through the string once to fill the
	 * map. Loop through the map once to find the first character with a value of 1
	 */

	public static void FirstRepeatChar() {
		String st = "swiss";
		LinkedHashMap<Character, Integer> Lmp = new LinkedHashMap<Character, Integer>();
		for (char c : st.toCharArray()) {
			// getOrDefault is a clean way to handle new vs existing keys
			Lmp.put(c, Lmp.getOrDefault(c, 0) + 1);
		}

		System.out.println(Lmp);

		for (Entry<Character, Integer> entry : Lmp.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}

}
