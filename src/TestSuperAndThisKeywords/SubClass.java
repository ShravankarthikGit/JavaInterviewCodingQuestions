package TestSuperAndThisKeywords;

public class SubClass extends SuperClass {
	int q = 30;

	public static void main(String args[]) {
		SubClass sub = new SubClass();
		sub.test1();
		sub.submethod1();
	}

	public void test1() {
		// accessing the instance variable defined in the sub class
		System.out.println("value from sub class variable : " + this.q);
		// accessing the instance variable defined from the super class
		System.out.println("value from super class variable : " + super.q);
	}
	

	public void method1(int a, int b) {
		int c = a * b;
		System.out.println("value of c : " + c);
	}

	// calling a method by name "method1" from super class
	// Calling a method by name "method1" from sub class
	public void submethod1() {
		super.method1(10, 20);
		this.method1(10, 20);
	}
}
