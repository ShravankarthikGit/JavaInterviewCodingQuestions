package interviewques1;

public class practice {

	public static void main(String[] args) {
		test(5);
	}

	public static void test(int num) {
		int fac = 1;
		for (int i = 1; i <= num; i++) {
			fac = fac * i;
			//System.out.println(fac);
		}
		System.out.println(fac);
	}
}
