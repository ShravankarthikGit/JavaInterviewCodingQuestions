package interviewques1;

public class factorial {
	public static void main(String args[]) {
		int number = 4;
		int factorial = 1;
		for (int i = 2; i <= number; i++) {
			factorial = factorial * i;
		}
		System.out.println("factorial of number: " + factorial);
	}
}
