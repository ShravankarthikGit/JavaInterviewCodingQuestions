package interviewques1;

public class compareStrings {
	static String a = "TEST";
	static String b = "test";

	public static void main(String args[]) {
		if (a.equals(b)) {
			System.out.println("Both strings are equal");
		} else {
			System.out.println("Both strings are not equal");
		}	
		if (a.equalsIgnoreCase(b)) {
			System.out.println("Both strings are equal");
		} else {
			System.out.println("Both strings are not equal");
		}	
	}
}
