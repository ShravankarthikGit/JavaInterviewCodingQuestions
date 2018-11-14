package interviewques2;

import java.util.Scanner;

public class oddOrEvenWithArray {
	public static void main(String args[]) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sn.nextInt();

		int[] iarray = new int[number];

		for (int i = 0; i <number; i++) {
			iarray[i] = sn.nextInt();
		}

		for (int i = 0; i <number; i++) {
			if (iarray[i] % 2 == 0) {
				System.out.println("Entered number is even");
			} else {
				System.out.println("Entered number is odd");
			}
		}
	}
}
