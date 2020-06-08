package javaControlStatements;

public class WhileLoopExample {

	public static void main(String[] args) {
		SimpleWhileLoop();
		WhileLoopToPrintArray();
	}

	static void SimpleWhileLoop() {
		int i = 10;
		while (i > 1) {
			System.out.println(i);
			i--;
		}
	}

	static void WhileLoopToPrintArray() {
		int arr[] = { 2, 11, 45, 9 };
		// i starts with 0 as array index starts with 0 too
		System.out.println("Output from method WhileLoopToPrintArray");
		int i = 0;
		while (i < 4) {
			System.out.println(arr[i]);
			i++;
		}
	}

}
