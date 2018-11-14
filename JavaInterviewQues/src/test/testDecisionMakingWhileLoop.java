package test;
public class testDecisionMakingWhileLoop {
	static int Count = 0;
	public static void main(String[] args) {
		//dowhile(50);
		testDecisionMakingWhileLoop obj = new testDecisionMakingWhileLoop();
		obj.testwhile(50);
	}
	public static void dowhile (int a){
		do{
			Count = Count + 5;
			System.out.println("First count value = " + Count);
		} while (Count <a);
	}
	public void testwhile(int a) {
		while (Count < a) {
			Count = Count + 5;
			System.out.println("While loop value ===>" + Count);
		}
	}
}