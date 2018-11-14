package TestPackageForExtends;

public class TestClassForExtends {
	public String cherrytest = "I am best";
	private String prvt = "I am private in  parent calss";
	public static String pubtestvariable = "I am public static variable in parent";
	
	public void cherry() {
		
		System.out.print("MY NAME IS CHERRY  I AM IN EXTENDED CLASS");
	}
	
	public static void ducky(){
		System.out.print("MY NAME IS Ducky  I AM IN EXTENDED CLASS static method");
	}
	
	public static void testoverride(){
		int i = 10;
		System.out.println ("Integr value : " + i);
		
	}
}
