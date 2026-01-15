package interviewques2;

import java.util.ArrayList;
import java.util.List;

public class CheckOnlyOddNumbers {
	public static void main(String args[]) {
		List<Integer> numbers = new ArrayList<>();
		
        // Add values
        numbers.add(11);
        numbers.add(13);
        numbers.add(17);
        
        boolean value = onlyOddNumbers(numbers);
        System.out.println("Returned value: " + value);
		
	}

	public static boolean onlyOddNumbers(List<Integer> list) {
		for (int i : list) {
			if (i % 2 == 0)
				return false;
		}
		return true;
	}
}
