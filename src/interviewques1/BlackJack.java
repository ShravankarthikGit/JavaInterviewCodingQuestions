package interviewques1;

public class BlackJack {
	public static void main(String[] args) {
		System.out.print(blackjack(33, 1));
	}

	public static int blackjack(int a, int b) {
		int result = 0;

		if (a > 21 && b > 21) {
			result = 0;
		} else if (a <= 21) {
			if (a > b || b > 21) {
				return a;
			}
			else {
				return b;
			}
		} else if (b <= 21) {
			if (b > a || b > 21) {
				return b;
			}
			else {
				return a;
			}
		}

		return result;
	}

}
