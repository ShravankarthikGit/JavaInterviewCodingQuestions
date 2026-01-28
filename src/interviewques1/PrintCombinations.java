package interviewques1;

import java.util.stream.IntStream;

public class PrintCombinations {
	public static void main(String[] args) {

		// Print all combinations of single letters and pairs from the string "abc" we
		// need to add print abc at end
		// there will 2 power n -1 combinations for n length string. in this case n =3
		// so 2 power 3 -1 =7 combinations

		String s = "abc";
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i)); // Print single letters
			for (int j = i + 1; j < s.length(); j++) {
				System.out.println("" + s.charAt(i) + s.charAt(j)); // Print pairs
			}
		}
		System.out.println(s); // Print the full string at the end

		// Alternative approach using bit manipulation and streams
		int n = s.length();

		// 1. Create a stream from 1 to 2^n - 1 (the total number of combinations)
		IntStream.range(1, (int) Math.pow(2, n)).mapToObj(i -> {
			StringBuilder combo = new StringBuilder();
			// 2. For each number, check which bits are "on"
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) != 0) {
					combo.append(s.charAt(j));
				}
			}
			return combo.toString();
		})
				// 3. Print the resulting strings
				.forEach(System.out::println);

	}

}
