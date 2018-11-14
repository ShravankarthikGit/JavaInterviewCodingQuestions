package interviewques1;

public class trimSpaces {
	static String a = "  TEST is best  ";
	public static void main(String args[]) {
		System.out.println(a);
		//trim removes spaces at the beginning and at the end
		String b = a.trim();
		System.out.println(b);
	}
}
