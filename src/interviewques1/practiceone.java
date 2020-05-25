package interviewques1;

public class practiceone {

	public static void main(String[] args) {

		//reverNumber(34343);
		//IsPrime(22);
		//Fibonacciseries (10);
		RepeatingCharacters("woorppt");
	}

	public static int reverNumber(int number) {

		int num = number;
		int reversenumber = 0;
		int temp = 0;
		while (num != 0) {
			temp = num % 10;
			reversenumber = reversenumber * 10 + temp;
			num = num / 10;
			System.out.println(reversenumber);
		}
		return reversenumber;
	}

	public static Boolean IsPrime(int number) {
		boolean IsPrime = true;
		if (number <= 1) {
			System.out.println("please enter a number greater than 1");
			return null;
		} else {
			for (int j = 2; j < number; j++) {
				if (number % j == 0) {
					IsPrime = false;
				}
			}
		}
		System.out.println(IsPrime);
		return IsPrime;
	}
	
	public static void Fibonacciseries(int FibNum) {
		int[] Fibseries = new int[FibNum];
		Fibseries[0] = 0;
		Fibseries[1] = 1;
		for (int i = 2 ; i<FibNum; i++) {
			Fibseries[i] =  Fibseries[i-1] +  Fibseries[i-2] ;
		}		
		//print fib series
		for (int j = 0; j <Fibseries.length; j++) {
			System.out.println (Fibseries[j]);
		}
	}
	
	
	public static void RepeatingCharacters (String word) {
		char[] stringarray = word.toCharArray();
		
		for (int i=0; i<word.length()-1 ; i++ ) {
			if (stringarray[i] == stringarray[i+1]) {
				System.out.println (stringarray[i]);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
	}
}
