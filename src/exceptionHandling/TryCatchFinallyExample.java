package exceptionHandling;

public class TryCatchFinallyExample {
	public static void main(String args[]) {
		System.out.println(tryFinallyExample());
		tryFinallyWithExitExample();
		tryCatchFinallyExampleWithExceptionHandleInCatch();
		tryCatchFinallyExampleWithNoExceptionOccurrence();
		tryCatchFinallyExampleWithNoExceptionHandle();
		
	}

	// Method with try and finally but no catch block, Code in finally block will
	// execute even with return statement in there
	public static int tryFinallyExample() {
		try {
			return 112;
		} finally {
			System.out.println("From method tryFinallyExample() : This is Finally block");
			System.out.println("Finally block ran even after return statement");
		}
	}

	// Method with try catch and finally blocks. With System.exit(0) the code in the
	// finally wont execute
	public static int tryFinallyWithExitExample() {
		try {
			System.out.println("\n" + "From method tryFinallyWithExitExample() : This is try block");
			int i = 40 / 2;
			System.out.println("This is from try block: " + i);
			return i;

		} catch (Exception e) {
			System.out.println("From method tryFinallyWithExitExample() : This is Catch block exception" + e);
			System.exit(0);
			return 0;
		}

		finally {
			System.out.println("From method tryFinallyExample() : This is Finally block");
		}
	}

	// Method with try catch and finally blocks. Exception handled in Catch block
	public static void tryCatchFinallyExampleWithExceptionHandleInCatch() {
		try {
			System.out.println("First statement of try block");
			int num = 45 / 0;
			System.out.println(num);
		} catch (ArithmeticException e) {
			System.out.println("\n" + "From Method tryCatchFinallyExample");
			System.out.println("ArithmeticException");
		} finally {
			System.out.println("finally block");
		}
		System.out.println("Out of try-catch-finally block");
	}

	// Method with try catch and finally blocks. Exception not handled in Catch
	// block
	public static void tryCatchFinallyExampleWithNoExceptionHandle() {
		try {
			System.out.println("\n" + "From Method tryCatchFinallyExampleWithNoExceptionHandle");
			System.out.println("First statement of try block");
			int num = 45 / 0;
			System.out.println(num);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Arryexception");
		} finally {
			System.out.println("finally block");
		}
		System.out.println("Out of try-catch-finally block");
	}

	// Method with try catch and finally blocks with no exception occurrence
	public static void tryCatchFinallyExampleWithNoExceptionOccurrence() {
		try {
			System.out.println("\n" + "From Method tryCatchFinallyExampleWithNoExceptionOccurrence");
			System.out.println("First statement of try block");
			int num = 45 / 3;
			System.out.println(num);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} finally {
			System.out.println("finally block");
		}
		System.out.println("Out of try-catch-finally block");
	}
}
