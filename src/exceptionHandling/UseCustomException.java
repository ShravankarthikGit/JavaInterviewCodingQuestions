package exceptionHandling;

public class UseCustomException {
	public static void main(String args[]) {
		UseCustomException obj = new UseCustomException();
		try {
			obj.productCheck(60);
		} catch (CustomException ex) {
			System.out.println("Caught the exception");
			System.out.println(ex.getMessage());
		}
	}

	void productCheck(int weight) throws CustomException {
		if (weight < 100) {
			throw new CustomException("Product Invalid");
		}
	}
}
