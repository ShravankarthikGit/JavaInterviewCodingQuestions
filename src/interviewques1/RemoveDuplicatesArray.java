package interviewques1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 2, 3, 4, 4, 5 };
		removeDuplicates(array);

	}

	public static void removeDuplicates(int[] array) {
		// Use a LinkedHashSet to maintain insertion order and remove duplicates
		Set<Integer> set = new LinkedHashSet<>();
		for (int num : array) {
			set.add(num);
		}
		// Convert the set back to an array
		int[] result = new int[set.size()];
		int i = 0;
		for (int num : set) {
			result[i] = num;
			i++;
		}
		System.out.println("Array after removing duplicates:");
		for (int num : result) {
			System.out.print(num + " ");
		}
	}

}
