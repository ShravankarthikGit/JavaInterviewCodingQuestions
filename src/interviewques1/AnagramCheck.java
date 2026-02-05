package interviewques1;

import java.util.*;

public class AnagramCheck {

	public static void main(String[] args) {
		
		isAnagram("tab", "bat");
	}
	
	public static boolean isAnagram(String s1, String s2) {
	    if (s1.length() != s2.length()) return false;
	    
	    char[] chars1 = s1.toLowerCase().toCharArray();
	    char[] chars2 = s2.toLowerCase().toCharArray();
	    
	    Arrays.sort(chars1);
	    Arrays.sort(chars2);
	    System.out.println(Arrays.equals(chars1, chars2));
	    
	    return Arrays.equals(chars1, chars2);
	}

}
