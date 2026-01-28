package interviewques1;

import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDupsFromString {
	public static void main(String[] args) {
		// String with multiple duplicates
		String input = "programming programming code string code";
		System.out.println("Original String: " + input);

		// convert string to array of words
		String[] ArrayWords = input.split(" ");

		// This will not work
		System.out.println("Array of Words:" + ArrayWords);
		// Print each word in the array
		for (String word : ArrayWords) {
			System.out.println(word);
		}

		// Convert array to LinkedHashSet to remove duplicates
		LinkedHashSet<String> clearedset = new LinkedHashSet<String>(List.of(ArrayWords));

		System.out.println("LinkedHashSet without duplicates: " + clearedset);

		// Convert LinkedHashSet back to string
		StringBuilder result = new StringBuilder();
		for (String word : clearedset) {
			result.append(word).append(" ");
		}

		// Trim the trailing space
		String finalString = result.toString().trim();
		System.out.println("String after removing duplicates: " + finalString);

	}
}
