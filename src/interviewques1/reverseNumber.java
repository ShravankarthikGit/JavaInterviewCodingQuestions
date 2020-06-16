package interviewques1;

public class reverseNumber {

 public static void main(String[] args) {

  //number defined
  int number = 2345;
  int reversedNumber = 0;
  int temp = 0;

  while (number != 0) {
   //modulus operator used to strip off the last digit
   temp = number % 10;
   System.out.println(temp);
   //create reversed number
   reversedNumber = reversedNumber * 10 + temp;
   System.out.println(reversedNumber);
   number = number / 10;
   System.out.println(number);
  }

  //output
  System.out.println("Reversed Number is: " + reversedNumber);
 }
 
	public static void ReverseString(String word) {
		char[] array = word.toCharArray();
		int len = array.length;
		char[] palindromeArray = new char[len];
		int j = palindromeArray.length;
		for (int i = 0; i< array.length; i++ ) {
			palindromeArray[j-1] = array[i];
			j = j-1;
		}
		System.out.println(palindromeArray);
	}
}