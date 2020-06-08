package javaControlStatements;

import java.util.Scanner;

public class SwitchCaseExample {
	// Switch case statement is used when we have number of options (or choices) and
	// we may need to perform a different task for each choice.
	public static void main(String args[]) {
		SwitchCaseSample();
		SwitchCaseSampleToCheckVowel();

	}

	public static void SwitchCaseSample() {
		int i = 2;
		switch (i) {
		case 1:
			System.out.println("Case1 ");
			break;
		case 2:
			System.out.println("Case2 ");
			break;
		case 3:
			System.out.println("Case3 ");
			break;
		case 4:
			System.out.println("Case4 ");
			break;
		default:
			System.out.println("Default ");
		}
	}

	public static void SwitchCaseSampleToCheckVowel() {
		boolean isVowel = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch = scanner.next().charAt(0);
		scanner.close();
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			isVowel = true;
		}
		if (isVowel == true) {
			System.out.println(ch + " is  a Vowel");
		} else {
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
				System.out.println(ch + " is a Consonant");
			else
				System.out.println("Input is not an alphabet");
		}
	}
}
