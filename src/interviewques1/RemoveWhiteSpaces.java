package interviewques1;

public class RemoveWhiteSpaces {
	public static void main (String args[]) {
		
		//String value = removeWhiteSpaces("apple bee");
		//System.out.println(value);
		remSpaces();
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
	
	
	public static void remSpaces() {
		
		String str = "  Hello   World  ";
        String trimmedStr = str.trim(); // Remove leading and trailing spaces
        
        String stripStr = str.strip();
        
        String result = str.replaceAll("\\s", ""); 
        
        System.out.println("Original String: '" + trimmedStr + "'"); // only trail and lead spaces are removed
        System.out.println("Original String: '" + stripStr + "'"); // only trail and lead spaces are removed
		
        System.out.println("Original String: '" + result + "'"); // only trail and lead spaces are removed
	}
}
