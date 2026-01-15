package interviewques1;

public class StripAndTrim {
	public static void main(String[] args) {
		String unicodeWhitespace = "\u2002Hello\u00A0"; // U+2002 (EN SPACE), U+00A0 (NBSP)

		System.out.println("Trimmed: [" + unicodeWhitespace.trim() + "]");
		System.out.println("Stripped: [" + unicodeWhitespace.strip() + "]");
	}
}
