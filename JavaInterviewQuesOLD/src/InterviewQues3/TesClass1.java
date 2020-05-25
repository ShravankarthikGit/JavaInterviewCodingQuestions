package InterviewQues3;

public class TesClass1 implements TestInterface {
	// when we say class implements a interface then all the unimplemented
	// methods in interface need to be added to the
	// class else it will throw compile error

	@Override
	public void studyone() {
		System.out.println("Test studyone method");
	}

	@Override
	public void studytwo() {
		System.out.println("Test studytwo method");

	}

	@Override
	public void studyfour() {
		// TODO Auto-generated method stub
		System.out.println("Test studyfour method");
	}

}
