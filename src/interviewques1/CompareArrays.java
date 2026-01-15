package interviewques1;

import java.util.Arrays;

public class CompareArrays {
	public static void main(String[] args) {
		int[] array1 = { 3, 5, 2, 4, 1 };
		int[] array2 = { 1, 2, 3, 4, 5 };

		boolean areEqual = haveSameElements(array1, array2);

		if (areEqual)
			System.out.println("Both arrays contain the same elements.");
		else
			System.out.println("Arrays do NOT contain the same elements.");
	}

	public static boolean haveSameElements(int[] arr1, int[] arr2) {
		// If lengths are different, arrays can't be equal
		if (arr1.length != arr2.length) {
			return false;
		}

		// Sort both arrays and compare
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		return Arrays.equals(arr1, arr2);
	}
}
