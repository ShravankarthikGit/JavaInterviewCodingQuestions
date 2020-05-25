package interviewques2;

import java.util.Scanner;

public class oddOrEven {
	public static void main(String args[]) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sn.nextInt();

		if (number%2 == 0) {
			System.out.println("Entered number is even");
		} else {
			System.out.println("Entered number is odd");
		}

	}

}
