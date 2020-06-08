package javaControlStatements;

public class BreakStatement {
	public static void main(String args[]) {
		System.out.println("while-loop from Method BreakInWhileLoop");
		BreakInWhileLoop();
		
		System.out.println("for-loop from Method BreakInWhileLoop");
		BreakInForLoop();

	}

	static void BreakInWhileLoop() {
		int num = 0;
		while (num <= 100) {
			System.out.println("Value of variable is: " + num);
			if (num == 2) {
				break;
			}
			num++;
		}
		System.out.println("Out of while-loop");
	}

	static void BreakInForLoop() {
		int var;
		for (var = 100; var >= 10; var--) {
			System.out.println("var: " + var);
			if (var == 99) {
				break;
			}
		}
		System.out.println("Out of for-loop");
	}

}
