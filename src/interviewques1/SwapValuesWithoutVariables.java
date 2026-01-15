package interviewques1;

public class SwapValuesWithoutVariables {
	static int x = 10;
	static int y = 16;

	public static void main(String args[]) {
		x = x+y; // 26
		y = x - y; //26 - 16 = 10
		x = x-y; // 26 - 10 = 16
		System.out.println("value of x:" + x);
		System.out.println("value of y:" + y);
	}

}
