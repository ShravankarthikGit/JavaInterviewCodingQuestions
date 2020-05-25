package interviewques1;

import java.util.Random;
import java.util.Scanner;

public class createRandomNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();

		System.out.println("Enter maximum number");
		int maxrange = sc.nextInt();

		for (int loop = 0; loop <= 10; loop++) {
			System.out.println(rm.nextInt(maxrange));
		}
	}
}
