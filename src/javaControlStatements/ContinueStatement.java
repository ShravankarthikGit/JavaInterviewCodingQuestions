package javaControlStatements;

public class ContinueStatement {
	// Continue statement is mostly used inside loops. Whenever it is encountered
	// inside a loop, control directly jumps to the beginning of the loop for next
	// iteration, skipping the execution of statements inside loop’s body for the
	// current iteration. This is particularly useful when you want to continue the
	// loop but do not want the rest of the statements(after continue statement) in
	// loop body to execute for that particular iteration.

	public static void main(String args[]) {
		// Below method will not print 4
		ContinueOnForLoop();
		// Below method will not print 7
		System.out.print("\n" + "output from ContinueOnWhileLoop method" + "\n");
		ContinueOnWhileLoop();
	}

	static void ContinueOnForLoop() {
		for (int j = 0; j <= 6; j++) {
			if (j == 4) {
				continue;
			}
			System.out.print(j + " ");
		}
	}

	static void ContinueOnWhileLoop() {
		int counter = 10;
		while (counter >= 0) {
			if (counter == 7) {
				counter--;
				continue;
			}
			System.out.print(counter + " ");
			counter--;
		}
	}
}
