package InterviewQues3;

import TestPackageForExtends.TestClassForExtends;

public class TestClass3 extends TestClassForExtends {

	public static void main(String Args[]) {
		System.out.println("variablein interface" + " : " + TestInterface.test);

		TesClass1 tt = new TesClass1();
		tt.studyone();
		tt.studytwo();

		TestClass2 ts = new TestClass2();
		ts.studyone();
		ts.studytwo();

		TestInterface.studythree();

		// cannt instantiate the tupe interface
		// TestInterface tr = new TestInterface();

		// A separate class has to be initiated as object to use methods
		TestClassSeparate tst = new TestClassSeparate();
		tst.tom();

		// Can access instance variable of parent class using object reference
		// of child class Inside static methods.
		// we need to instantiate an object of child class
		TestClass3 extobj = new TestClass3();
		// call the non static method of super class from obj reference
		extobj.cherry();
		// Access the non static variable of the super class from the sub class after obj instantiated
		System.out.println("Access non static variable form extends class within nstatic method: " + extobj.cherrytest);

		// call the static method of super class with out any obj reference from child class
		ducky();
		
		//Access the static variable of the super class from the sub class with no object instantiate
		System.out.println("Access non static variable form extends class within nstatic method: " + pubtestvariable);

		extobj.testclass3method();
		
		//Access the private variable is not possible from super class
		//System.out.println("Access non static variable form extends class within nstatic method: " + prvt);
		
		//Override a method in from super class and use in subclass
		testoverride(90);
		//Overload a method
		testoverride(10,30);
	}

	public void testclass3method() {
		// Access the non static method from parent class without object instantiation
		cherry();
		// Access the non static variable form the parent class with out object instantiation
		System.out.println("Access non static variable form extends class within non static method: " + cherrytest);
		// Access the static method from parent class without object instantiation
		ducky();
		//Access the static variable of the super class from the sub class with no object instantiate
		System.out.println("Access non static variable form extends class within nstatic method: " + pubtestvariable);

		//Access the private variable is not possible from super class
		//System.out.println("Access non static variable form extends class within nstatic method: " + prvt);
	}
	
	//override
	public static void testoverride(int i){
		//int i = 90;
		System.out.println ("Integr value : " + i);
	}
	
	//overload a method
	public static void testoverride(int i,int j){
		int z = 90;
		System.out.println ("Integr value : " + i + j + z);
	}
	

}
