package interviewques1;

public class RepeatingCharacter {

	public static void main(String args[]) {
		//RepeatingChar("applle");
		//FirstRepeatingChar("applle");
		IsStringWithAllUniqueCharacters("i am good");
	}

	public static void RepeatingChar(String word) {

		for (int i = 0; i < word.length(); i++) {
			for (int j = i + 1; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j)) {
					System.out.println(word.charAt(i) + " is repeating");
					break;
				}
				break;
			}
		}
	}

	public static void FirstRepeatingChar(String word) {

		for (int i = 0; i < word.length(); i++) {
			for (int j = i + 1; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j)) {
					System.out.println(word.charAt(i) + " is first repeating character");
					i = word.length();
					break;
				}
				break;
			}
		}
	}

	public static void IsStringWithAllUniqueCharacters(String word) {
		  // Call the replaceAll() method to get rid of all spaces
       String str = word.replaceAll("\\s", ""); 
		boolean isunique = true;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					isunique = true;
					System.out.println(str.charAt(i) + " is a repeating character exists");
				} else {
					
					continue;
				}
				break;
			}
		}
		if(isunique = true) {
			System.out.println(str +  " is unique");
		}
	}

}
