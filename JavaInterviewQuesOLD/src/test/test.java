package test;

public class test {
	static int a = 10;
	static int b = 20;
	
	public static void main (String[] args){
		int c = a+b;
		System.out.println("output:  " + c);
		System.out.println ("is a greater than b: " + (a>b));
		System.out.println ("is b greater than a: " + (b>a));	
		//initiate a object to call a non static method
		test tobj = new test();
		tobj.compare (true,true);
	}
	
	public static void compare (boolean op1, boolean op2){
		System.out.println ("is op1 and op2 as true: " + (op1 && op2));	
	}
	
}
