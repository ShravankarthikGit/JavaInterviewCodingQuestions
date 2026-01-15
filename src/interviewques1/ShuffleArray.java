package interviewques1;
import java.util.*;

public class ShuffleArray {
	public static void main(String[] args) {
		Integer[] array = { 1, 2, 3, 4, 5 };

		List<Integer> list = Arrays.asList(array); // convert array to list
		Collections.shuffle(list); // shuffle the list

		System.out.println("Shuffled array: " + Arrays.toString(array));
	}
}
