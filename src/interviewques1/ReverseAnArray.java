package interviewques1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ReverseAnArray {

	public static void main(String args[]) {
		ReverseIntArray(new Object[] {2,6,7,8});
		ReverseArray(new String[] {"a", "app", "lle","uu"});
	}
	
	public static void ReverseArray(String[] wordarray) {
        // Converting Array to List
        List<String> list = Arrays.asList(wordarray);
        // Reversing the list using Collections.reverse() method
        Collections.reverse(list);
        // Converting list back to Array
        String[] reversedArray = list.toArray(wordarray);
        // Printing the reverse Array
        System.out.print("Reverse Array : " + Arrays.toString(reversedArray));
	}
	
	public static void ReverseIntArray(Object[] intarray) {
        // Converting Array to List
        List<Object> list = Arrays.asList(intarray);
        // Reversing the list using Collections.reverse() method
        Collections.reverse(list);
        System.out.print(list);
        // Converting list back to Array
        Object[] reversedArray = list.toArray(intarray);
        // Printing the reverse Array
        System.out.print("Reverse Array : " + reversedArray);
	}
}
