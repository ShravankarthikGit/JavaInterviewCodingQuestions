package exceptionHandling;

public class ExceptionExamples {

	public static void main(String args[]) {
		ArithmeticExceptionExample();
		ArrayIndexOutOfBoundExceptionExample();
		NumberFormatExceptionExample();
		StringOutOfBoundExceptionExample();
		NullPointerExceptionExample();
	}

	public static void ArithmeticExceptionExample() {
		try {
			int num1 = 30, num2 = 0;
			int output = num1 / num2;
			System.out.println("Result: " + output);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticExceptionthrown" + " You Shouldn't divide a number by zero");
		}
	}

	public static void ArrayIndexOutOfBoundExceptionExample() {
		try {
			int a[] = new int[10];
			// Array has only 10 elements
			a[11] = 9;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds");
		}
	}

	public static void NumberFormatExceptionExample() {
		try {
			int num = Integer.parseInt("XYZ");
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("Number format exception occurred");
		}
	}

	public static void StringOutOfBoundExceptionExample() {
		try {
			String str = "beginnersbook";
			System.out.println(str.length());
			;
			char c = str.charAt(0);
			// Set value of c to char at index 40
			c = str.charAt(40);
			System.out.println(c);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException!!");
		}
	}

	public static void NullPointerExceptionExample() {
		try {
			String str = null;
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException..");
		}
	}
}
