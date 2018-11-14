package interviewques1;

import java.util.Scanner;

public class performArithmeticOperations {
	public static void main(String args[]) {
		int first, second, add, substract, multiply;
		float divide;
		Scanner sn = new Scanner (System.in);
		
		System.out.println("enter first number");
		first = sn.nextInt();
		System.out.println("enter second number");
		second = sn.nextInt();
		
		add = first + second;
		substract = first - second;
		multiply = first * second;
		divide = (float)first/second;
		
		System.out.println("enter first number" + add);
		System.out.println("enter first number" + substract);
		System.out.println("enter first number" + multiply);
		System.out.println("enter first number" + divide);
	}
}
