package interviewques1;

public class tofindTwoMaxNumbers {
	public static void main(String args[]) {
		int[] test = { 1, 3, 7, 8, 34, 40 };
		int maxone = 0;
		int maxtwo = 0;
		for (int i : test) {
			if (i > maxone) {
				maxtwo = maxone;
				maxone = i;
			} else if (i > maxtwo) {
				maxtwo = i;
			}
		}
		System.out.println("max number one : " + maxone);
		System.out.println("max number two : " + maxtwo);
	}
}
