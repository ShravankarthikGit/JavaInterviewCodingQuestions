package interviewques1;

public class ReplaceACharacter {

	public static void main(String args[]) {
		test1("chicago", "c");
	}

	public static void test1(String a, String c) {
		String test = a.replaceAll(c, "");
		System.out.println(test);
	}

}
