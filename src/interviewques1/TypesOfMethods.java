package interviewques1;

public class TypesOfMethods {
	public static void main(String args[]) {

		TypesOfMethods obj = new TypesOfMethods();
		obj.test1();
		// obj.test2(10, 20);
		System.out.println("integer value is :" + obj.test2(10, 20));
		obj.test4();
	}

	// this method has no return
	public void test1() {
		System.out.println("This is methodd test1");
	}

	// this method has return type as int and takes two input variables a and b
	public int test2(int a, int b) {
		int c = a = b;
		return c;
	}

	private void test4() {
		System.out.println("this is op for private method");
	}
}
