package javaControlStatements;

public class DoWhileExample {
	// First, the statements inside loop execute and then the condition gets
	// evaluated, if the condition returns true then the control gets transferred to
	// the �do� else it jumps to the next statement after do-while.

	public static void main(String[] args) {
		DoWhileSample();
	}

	static void DoWhileSample() {
		int arr[] = { 2,3,11, 45, 9 };
		// i starts with 0 as array index starts with 0
		int i = 0;
		do {
			System.out.println(arr[i]);
			i++;
		} while (i < 5);
	}

}
