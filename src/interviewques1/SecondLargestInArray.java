package interviewques1;

public class SecondLargestInArray {

	public static void main(String args[]) {
		int value = findSecondHighest(null);
		System.out.println(value);
	}

	private static int findSecondHighest(int[] array) {
		int[] nums = { 5, 7, 2, 9, 1, 9 };

		Integer largest = null;
		Integer secondLargest = null;

		for (int num : nums) {
			if (largest == null || num > largest) {
				secondLargest = largest;
				largest = num;
			} else if ((secondLargest == null || num > secondLargest) && num != largest) {
				secondLargest = num;
			}
		}

		if (secondLargest != null) {
			System.out.println("Second largest: " + secondLargest);
		} else {
			System.out.println("No second largest value found.");
		}
		return secondLargest;
	}
}
