package interviewques1;

public class VariableArguments {

	public static void main(String[] args) {
		System.out.println(sum(1, 2, 3, 4, 5));
		System.out.println(sum(10, 20));
		System.out.println(sum());
		System.out.println(sum2("apple", 5, 10, 15));

		// Calling the 'Names' method with different number of arguments
		Names("geek1", "geek2");
		Names("geek1", "geek2", "geek3");
	}

	// We have integer variable arguments
	public static int sum(int... numbers) {
		int total = 0;
		for (int num : numbers) {
			total += num;
		}
		return total;
	}

	public static void Names(String... n) {

		// Iterate through the array and print each name
		for (String i : n) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// note that varargs should be the last parameter
	public static int sum2(String str, int... numbers) {
		int total = 0;
		System.out.println(str + ": ");
		str = "Total";
		for (int num1 : numbers) {
			total += num1;
		}
		return total;
	}

}
