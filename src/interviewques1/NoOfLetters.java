package interviewques1;

public class NoOfLetters {

	public static void main(String[] args) {
		
		String str = "Hello World*&^2323";
		// This inludes spaces and special character
		System.out.println("Number of letters in the string: " + str.length());
		
		// To count only letters, we can use a loop to check each character
		int letterCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				letterCount++;
			}
		}
		System.out.println("Number of letters (excluding spaces and special characters): " + letterCount);
		
		// Using streams to count letters
        long letterCount1 = str.chars()
                .filter(Character::isLetter) // Keeps only alphabetic characters
                .count();
		System.out.println("Number of letters using streams: " + letterCount1);
		
	}
}
