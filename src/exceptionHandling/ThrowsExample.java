package exceptionHandling;

import java.io.IOException;

public class ThrowsExample {

	public static void main(String args[]) {
		// As methodWithNoExceptionHandling method is NOT handling exception we need to
		// handle exception when called
		try {
			ThrowsExample obj = new ThrowsExample();
			obj.methodWithNoExceptionHandling(1);
		} catch (Exception ex) {
			System.out.println(ex);
		}

		// As methodWithExceptionHandling method is handling exception we dont need to
		// handle exception when called
		methodWithExceptionHandling(2);
		
		// Call method 3 
		ThrowsExample obj = new ThrowsExample();
		obj.method3();  
		System.out.println("End Of Program"); 
	}

	void methodWithNoExceptionHandling(int num) throws IOException, ClassNotFoundException {
		if (num == 1)
			throw new IOException("IOException Occurred");
		else
			throw new ClassNotFoundException("ClassNotFoundException");
	}

	static void methodWithExceptionHandling(int num) {
		try {
			if (num == 1)
				throw new IOException("IOException Occurred");
			else
				throw new ClassNotFoundException("ClassNotFoundException");

		} catch (IOException io) {
			System.out.println(io);

		} catch (ClassNotFoundException co) {
			System.out.println(co);
		}
	}

	// Method1 throws exception
	void method1() throws ArithmeticException {
		throw new ArithmeticException("Calculation error");
	}

	//Method2 calls method one and throws exception
	void method2() throws ArithmeticException {
		method1();
	}

	//Method3 calls method 2 and exception is handled in method 3
	void method3() {
		try {
			method2();
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException handled");
		}
	}
}
