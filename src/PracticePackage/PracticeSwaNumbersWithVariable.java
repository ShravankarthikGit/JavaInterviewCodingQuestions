package PracticePackage;

public class PracticeSwaNumbersWithVariable {

	public static void main (String args[]){
	int x = 10;
	int y = 20;
	int z;
	
	z = x;
	x = y;
	y = z;
	
	System.out.println ("Value of x : " + x);
	System.out.println ("Value of y : " + y);
	}
}
