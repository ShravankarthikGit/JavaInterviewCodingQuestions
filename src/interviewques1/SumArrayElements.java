package interviewques1;

public class SumArrayElements {
	public static void main(String arg[]) {

		int[] array = { 1, 2, 3, 4, 5 };

		int sum = 0;

		for (int i : array)
			sum += i;

		System.out.println(sum);
	}
}
