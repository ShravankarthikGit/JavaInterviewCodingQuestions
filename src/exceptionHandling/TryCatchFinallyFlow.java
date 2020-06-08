package exceptionHandling;

public class TryCatchFinallyFlow {
	/*
	 * Flow of control in try/catch/finally blocks: If exception occurs in try
	 * block’s body then control immediately transferred(skipping rest of the
	 * statements in try block) to the catch block. Once catch block finished
	 * execution then finally block and after that rest of the program. 
	 * If there is no exception occurred in the code which is present in try block then first,
	 * the try block gets executed completely and then control gets transferred to
	 * finally block (skipping catch blocks). 
	 * If a return statement is encountered
	 * either in try or catch block. In this case finally block runs. Control first
	 * jumps to finally and then it returned back to return statement.
	 */
	static void myMethod(int testnum) throws Exception {
		System.out.println("start - myMethod");
		if (testnum == 12)
			throw new Exception();
		System.out.println("end - myMethod");
		return;
	}

	public static void main(String args[]) {
		int testnum = 12;
		try {
			System.out.println("try - first statement");
			myMethod(testnum);
			System.out.println("try - last statement");
		} catch (Exception ex) {
			System.out.println("An Exception");
		} finally {
			System.out.println("finally");
		}
		System.out.println("Out of try/catch/finally - statement");
	}
}
