package interviewques1;

import java.util.Arrays;

public class practice {

	public static void main(String[] args) {

		// test("racecar");
		// reversenum(67687889);
		// repeatingchars("tommy");
		// System.out.println(checkifprime(10));
		// Maxnumber(new int[]{-1,2,4,10,8,80,100,0,5});
		// ReverseString("apple");
		// ReverseStingWithStringBuffer("apple");
		// RepeatingChar("appleesoobaad");
		FirstRepeatingChar("appleesoobaad");

	}

	// to check if a string is palindrome
	public static void test(String word) {
		int len = word.length();
		char[] testArray = new char[len];
		testArray = word.toCharArray();
		System.out.println(testArray);
		char[] palindromeArray = new char[len];
		int j = palindromeArray.length;

		for (int i = 0; i < testArray.length; i++) {
			palindromeArray[j - 1] = testArray[i];
			j = j - 1;
		}
		System.out.println(palindromeArray);

		if (Arrays.equals(testArray, palindromeArray)) {
			System.out.println(word + " is palindrome");
		} else {
			System.out.println(word + " is not palindrome");
		}
	}

	public static void reversenum(int num) {
		String reversednumber = "";
		int temp = 0;

		while (num != 0) {
			temp = num % 10;
			reversednumber = reversednumber.concat(Integer.toString(temp));
			// reversedNumber = reversedNumber * 10 + temp;
			num = num / 10;
		}
		System.out.println(reversednumber);
	}

	public static void duplicatechars(String word) {

		for (int i = 0; i < word.length(); i++) {
			for (int j = i + 1; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j)) {
					System.out.println(word.charAt(i) + " is repeating");
				}
			}
		}
	}

	public static boolean checkifprime(int number) {
		boolean isprime = false;
		if (number <= 1) {
			System.out.println("ENter a nunber greater than 2");
		} else {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isprime = false;
					break;
					// System.out.println(isprime);
				} else {
					isprime = true;
					// System.out.println(isprime);
				}
			}
		}
		return isprime;
	}

	public static void Maxnumber(int[] testarray) {
		int maxnum = testarray[0];
		int minnumber = testarray[0];

		for (int i = 0; i < testarray.length; i++) {
			if (maxnum < testarray[i]) {
				maxnum = testarray[i];
			}
		}

		for (int i = 0; i < testarray.length; i++) {
			if (minnumber > testarray[i]) {
				minnumber = testarray[i];
			}
		}

		System.out.println(maxnum + " is maxnumber in array");
		System.out.println(minnumber + " is maxnumber in array");
	}

	public static void ReverseString(String word) {
		char[] array = word.toCharArray();
		int len = array.length;
		char[] palindromeArray = new char[len];
		int j = palindromeArray.length;
		for (int i = 0; i < array.length; i++) {
			palindromeArray[j - 1] = array[i];
			j = j - 1;
		}
		System.out.println(palindromeArray);
	}

	public static void ReverseStingWithStringBuffer(String word) {
		StringBuffer sbf = new StringBuffer();
		String reverserString = sbf.append(word).reverse().toString();
		System.out.println(reverserString);
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
		
}
