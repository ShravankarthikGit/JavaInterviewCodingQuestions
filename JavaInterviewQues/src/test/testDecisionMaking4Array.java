package test;

public class testDecisionMaking4Array {

	/*
	 * public static void main(String[] args) { String[] testarray = new
	 * String[5]; testarray[0] = "car"; testarray[1] = "car"; testarray[2] =
	 * "car"; testarray[3] = "car"; testarray[4] = "car";
	 * System.out.println(testarray[1]); } }
	 */
	/*
	 * public static void main(String[] args) { String[] testarray = {"car",
	 * "bus", "car1","car2"}; int alength = testarray.length; for (int i=0; i <
	 * alength; i ++){ System.out.println ("Array value :" + testarray[i]); } }
	 */

	/*
	 * public static void main(String[] args) { 
	 * String[] testarray = { "car","bus", "car1", "car2" }; 
	 * forloop(testarray); 
	 * }
	 * 
	 * public static void forloop(String array[]) { int alength = array.length;
	 * for (int i = 0; i < alength; i++) { System.out.println(array[i]); } }
	 */

	public static void main(String[] args) {
		String[] aMake = ReturnArray();
		for (int i = 0; i <= aMake.length - 1; i++) {
			System.out.println("Printing all the values of an Array ==> " + aMake[i]);
		}
	}
	// This method returns an Array of type String
	public static String[] ReturnArray() {
		String[] aArray = { "BMW", "AUDI", "TOYOTA", "SUZUKI", "HONDA" };
		return aArray;
	}

}