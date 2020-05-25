package interviewques1;

public class reverseNumberusingstringbuffer {

	public static void main(String[] args) {

		// number defined
		int number = 2345;

		String str = Integer.toString(number);
		String reverse = new StringBuffer(str).reverse().toString();
		System.out.println(reverse);
		// output
		System.out.println("Reversed Number is: " + reverse);
	}
}