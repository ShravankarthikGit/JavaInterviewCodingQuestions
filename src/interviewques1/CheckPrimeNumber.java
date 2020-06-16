package interviewques1;

public class CheckPrimeNumber {

	public static void main(String args[]) {
		CheckPrimeNumber(6);
	}

	public static Boolean CheckPrimeNumber(int i) {
		boolean isprime = true;

		if (i <= 1) {
			System.out.println("enter number greater than 1");
			return null ;
		}
		else 
		{
			for (int j = 2; j < i; j++) {
				if(i%j == 0 ) {
					isprime = false;
				}
			}
		}
		System.out.println(isprime);
		return isprime;
	}
}
