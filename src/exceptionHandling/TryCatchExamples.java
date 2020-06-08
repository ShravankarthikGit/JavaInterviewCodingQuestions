package exceptionHandling;

public class TryCatchExamples {
	public static void main(String args[]) {
		tryWithMultipleCatchExample();
		nestedTryCatchExample();
		nestedMultipleTryCatchExample();
	}

	public static void tryWithMultipleCatchExample() {
		try {
			int a[] = new int[7];
			// Below line will throw arithmetic exception
			a[4] = 30 / 0;
			System.out.println("First print statement in try block");
			// Below will throw arrayoutboundexception
			System.out.println(a[9]);
		} catch (ArithmeticException e) {
			System.out.println("Warning: ArithmeticException");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Warning: ArrayIndexOutOfBoundsException");
		} catch (Exception e) {
			System.out.println("Warning: Some Other exception");
		}
		System.out.println("Out of try-catch block...");
	}

	// In the below method exception thrown in the child try block is handled in
	// main try catch block
	public static void nestedTryCatchExample() {
		// main try-block
		try {
			// try-block2
			try {
				// try-block3
				try {
					int arr[] = { 1, 2, 3, 4 };
					/*
					 * I'm trying to display the value of an element which doesn't exist. The code
					 * should throw an exception
					 */
					System.out.println(arr[10]);
				} catch (ArithmeticException e) {
					System.out.print("Arithmetic Exception");
					System.out.println(" handled in try-block3");
				}
			} catch (ArithmeticException e) {
				System.out.print("Arithmetic Exception");
				System.out.println(" handled in try-block2");
			}
		} catch (ArithmeticException e3) {
			System.out.print("\n" + "Arithmetic Exception");
			System.out.println(" handled in main try-block");
		} catch (ArrayIndexOutOfBoundsException e4) {
			System.out.print("\n" + "ArrayIndexOutOfBoundsException");
			System.out.println(" handled in main try-block");
		} catch (Exception e5) {
			System.out.print("Exception");
			System.out.println(" handled in main try-block");
		}
	}

	public static void nestedMultipleTryCatchExample() {
		// Parent try block
		try {
			// Child try block1
			try {
				System.out.println("\n" + "Inside child block1");
				int b = 45 / 0;
				System.out.println(b);
			} catch (ArithmeticException e1) {
				System.out.println("ArithmeticException from Child try catch block 1 : e1");
			}
			// Child try block2
			try {
				System.out.println("Inside child block2 (no arrayoutbound exception)");
				int b = 45 / 0;
				System.out.println(b);
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println("Exception: e2");
			}
			System.out.println("Just other statement");
		} catch (ArithmeticException e3) {
			System.out.println("Arithmetic Exception from Parent Try catch block");
		} catch (ArrayIndexOutOfBoundsException e4) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("Inside parent try catch block");
		} catch (Exception e5) {
			System.out.println("Exception");
			System.out.println("Inside parent try catch block");
		}
		System.out.println("Next statement..");
	}

}
