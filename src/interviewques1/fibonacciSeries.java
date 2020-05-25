package interviewques1;

import java.util.Scanner;

public class fibonacciSeries {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number for Fibonacci series");
		int fibnum = sc.nextInt();
		int[] fibarray = new int[fibnum];
		fibarray[0] = 0;
		fibarray[1] = 1;

		for (int i = 2; i < fibnum; i++) {
			fibarray[i] = fibarray[i - 1] + fibarray[i - 2];
		}

		// System.out.println(fibarray[7]);

		for (int j = 0; j < fibarray.length; j++) {
			System.out.println("Series : " + fibarray[j]);
		}

	}
}
