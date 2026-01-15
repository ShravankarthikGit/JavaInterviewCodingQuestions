package interviewques1;

public class IntArrayLargestSmallest {
	public static void main(String args[]) {
		int[] iarr = { 1, 78, 49, 22, 99 };
		System.out.println(iarr[0]);
		int largest = iarr[0];
		int smallest = iarr[0];
		for (int i = 1; i < iarr.length; i++) {
			if (iarr[i] > largest) {
				largest = iarr[i];
			} else if (iarr[i] < smallest) {
				smallest = iarr[i];
			}
		}
		System.out.println("largest number is " + largest);
		System.out.println("largest number is " + smallest);
	}
}
