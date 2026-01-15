package interviewques1;

public class RemoveWhiteSpaces {
	public static void main (String args[]) {
		
		String value = removeWhiteSpaces("apple bee");
		System.out.println(value);
	}

	public static String removeWhiteSpaces(String input) {
		StringBuilder output = new StringBuilder();

		char[] charArray = input.toCharArray();

		for (char c : charArray) {
			if (!Character.isWhitespace(c))
				output.append(c);
		}
		return output.toString();
	}
}
