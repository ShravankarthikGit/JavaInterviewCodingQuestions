package InterqQuesAbstractClassTest;

public class TestSubClassForAbstractClass extends TestAbstractClass {

	@Override
	public void studycolorone() {
		System.out.println("The color is Black");
	}

	@Override
	public void studycolortwo() {
		System.out.println("The color is White");
	}

	public static void main(String args[]) {
		TestSubClassForAbstractClass tobj = new TestSubClassForAbstractClass();
		//USing the method implemented in the Abstract super class
		tobj.studycolorthree();
		// Using methods defined in the super class but implemented in sub class
		tobj.studycolortwo();
		tobj.studycolorone();
	}

}
