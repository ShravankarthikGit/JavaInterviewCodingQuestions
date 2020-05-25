package interviewques1;

public class swapValuesForVariables {
	static int x = 10;
	static int y = 16;

	public static void main(String args[]) {
		int z = x;
		x = y;
		y = z;
		System.out.println("value of x:" + x);
		System.out.println("value of y:" + y);
	}

}
