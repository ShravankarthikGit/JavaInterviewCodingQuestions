package TestEncapsulation;

public class TestEncapsulationTwo {
	public static void main(String args[]) {
		TestEncapsulation tesenc = new TestEncapsulation();
		
		//set valus 
		tesenc.setName("Tom");
		tesenc.setNum(100);
		
		System.out.println ("value of name: " + tesenc.getName());
		

		System.out.println ("value of number: " + tesenc.getNum());
		
		
	}
}
